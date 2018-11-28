SERVICE_NAME ?= serverless-go-scheduler
SERVICE_VERSION ?= $(shell git rev-parse --short HEAD)
AWS_DEFAULT_REGION ?= us-east-1
# include env.sh

default:
	$(info Make target options:)
	$(info `make start` to build and run the ODE)
	$(info `make stop` to stop the ODE)
	$(info `make delete` to destroy the current Docker containers)
	$(info `make rebuild` to stop, delete, and then rebuild the containers)

start:
ifeq ("$(wildcard ./jpo-ode-private)", "")
	$(error "ERROR: Directory `jpo-ode-private` not found in ${PWD}")
endif
ifeq ("$(wildcard ./asn1_codec/asn1c_combined/J2735_201603DA.ASN)", "")
	$(error "ERROR: J2735_201603DA.ASN not found in ${PWD}/asn1_codec/asn1c_combined/")
endif
ifndef DOCKER_HOST_IP
	$(error ERROR: Environment variable DOCKER_HOST_IP is not set)
endif
ifndef DOCKER_SHARED_VOLUME
	$(error ERROR: Environment variable DOCKER_SHARED_VOLUME is not set)
endif
ifeq ("$(wildcard .env)", "")
	$(warning "WARNING: Environment file `.env` not found in ${PWD}")
endif
	docker-compose up --build -d

stop:
	docker-compose down

delete:
	docker-compose rm -fvs

rebuild:
	$(MAKE) stop delete start
