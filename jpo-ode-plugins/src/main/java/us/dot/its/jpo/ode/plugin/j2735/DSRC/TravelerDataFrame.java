package us.dot.its.jpo.ode.plugin.j2735.DSRC;

import us.dot.its.jpo.ode.plugin.types.Asn1Sequence;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import us.dot.its.jpo.ode.plugin.annotations.Asn1Property;
import us.dot.its.jpo.ode.plugin.types.Asn1Choice;
import java.util.List;
import java.util.Optional;
import us.dot.its.jpo.ode.plugin.types.Asn1Type;
import us.dot.its.jpo.ode.plugin.types.Asn1SequenceOf;
import us.dot.its.jpo.ode.plugin.j2735.ITIS.ITIScodesAndText;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import us.dot.its.jpo.ode.plugin.serialization.NestedSequenceOfDeserializer;
import us.dot.its.jpo.ode.plugin.serialization.NestedSequenceOfSerializer;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * EDITED: Fixed "notUsed" properties.
 * <p>
 * This source code was generated by a tool. Manual edits are futile.
 * </p>
 * <p>
 * asn1jvm v1.0-SNAPSHOT
 * </p>
 * <p>
 * ASN.1 source files:
 * </p>
 * 
 * <pre>
 * J2735_201603DA.ASN
 * </pre>
 * 
 */
@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class TravelerDataFrame extends Asn1Sequence {

	@Asn1Property(tag = 0)
	@JsonDeserialize(using = SSPindex.SSPindexDeserializer.class)
	private SSPindex notUsed;
	@Asn1Property(tag = 1)
	private TravelerInfoType frameType;
	@Asn1Property(tag = 2)
	private MsgIdChoice msgId;
	@Asn1Property(tag = 3, optional = true)
	@JsonDeserialize(using = DYear.DYearDeserializer.class)
	private DYear startYear;
	@Asn1Property(tag = 4)
	@JsonDeserialize(using = MinuteOfTheYear.MinuteOfTheYearDeserializer.class)
	private MinuteOfTheYear startTime;
	@Asn1Property(tag = 5)
	@JsonDeserialize(using = MinutesDuration.MinutesDurationDeserializer.class)
	private MinutesDuration duratonTime;
	@Asn1Property(tag = 6)
	@JsonDeserialize(using = SignPrority.SignProrityDeserializer.class)
	private SignPrority priority;
	@Asn1Property(tag = 7)
	@JsonDeserialize(using = SSPindex.SSPindexDeserializer.class)
	private SSPindex notUsed1;
	@Asn1Property(tag = 8)
	private SequenceOfRegions regions;
	@Asn1Property(tag = 9)
	@JsonDeserialize(using = SSPindex.SSPindexDeserializer.class)
	private SSPindex notUsed2;
	@Asn1Property(tag = 10)
	@JsonDeserialize(using = SSPindex.SSPindexDeserializer.class)
	private SSPindex notUsed3;
	@Asn1Property(tag = 11)
	private ContentChoice content;
	@Asn1Property(tag = 12, optional = true)
	private URL_Short url;

	public SSPindex getNotUsed() {
		return notUsed;
	}

	public void setNotUsed(SSPindex notUsed) {
		this.notUsed = notUsed;
	}

	public TravelerInfoType getFrameType() {
		return frameType;
	}

	public void setFrameType(TravelerInfoType frameType) {
		this.frameType = frameType;
	}

	@JsonInclude(Include.NON_NULL)
	public static class MsgIdChoice extends Asn1Choice {
		@Asn1Property(tag = 0)
		private FurtherInfoID furtherInfoID;
		@Asn1Property(tag = 1)
		private RoadSignID roadSignID;

		MsgIdChoice() {
			super(false);
		}

		public FurtherInfoID getFurtherInfoID() {
			return furtherInfoID;
		}

		public void setFurtherInfoID(FurtherInfoID furtherInfoID) {
			this.furtherInfoID = furtherInfoID;
		}

		public RoadSignID getRoadSignID() {
			return roadSignID;
		}

		public void setRoadSignID(RoadSignID roadSignID) {
			this.roadSignID = roadSignID;
		}

		@Override
		protected List<Optional<Asn1Type>> listTypes() {
			return null;
		}
	}

	public MsgIdChoice getMsgId() {
		return msgId;
	}

	public void setMsgId(MsgIdChoice msgId) {
		this.msgId = msgId;
	}

	public DYear getStartYear() {
		return startYear;
	}

	public void setStartYear(DYear startYear) {
		this.startYear = startYear;
	}

	public MinuteOfTheYear getStartTime() {
		return startTime;
	}

	public void setStartTime(MinuteOfTheYear startTime) {
		this.startTime = startTime;
	}

	public MinutesDuration getDuratonTime() {
		return duratonTime;
	}

	public void setDuratonTime(MinutesDuration duratonTime) {
		this.duratonTime = duratonTime;
	}

	public SignPrority getPriority() {
		return priority;
	}

	public void setPriority(SignPrority priority) {
		this.priority = priority;
	}

	public SSPindex getNotUsed1() {
		return notUsed1;
	}

	public void setNotUsed1(SSPindex notUsed1) {
		this.notUsed1 = notUsed1;
	}

	@JsonInclude(Include.NON_NULL)
	public static class SequenceOfRegions extends Asn1SequenceOf<GeographicalPath> {
		SequenceOfRegions() {
			super(GeographicalPath.class, 1L, 16L);
		}
	}

	public SequenceOfRegions getRegions() {
		return regions;
	}

	public void setRegions(SequenceOfRegions regions) {
		this.regions = regions;
	}

	public SSPindex getNotUsed2() {
		return notUsed2;
	}

	public void setNotUsed2(SSPindex notUsed2) {
		this.notUsed2 = notUsed2;
	}

	public SSPindex getNotUsed3() {
		return notUsed3;
	}

	public void setNotUsed3(SSPindex notUsed3) {
		this.notUsed3 = notUsed3;
	}

	@JsonInclude(Include.NON_NULL)
	public static class ContentChoice extends Asn1Choice {
		@Asn1Property(tag = 0)
		@JsonDeserialize(using = AdvisoryDeserializer.class)
		@JsonSerialize(using = AdvisorySerializer.class)
		private ITIScodesAndText advisory;
		@Asn1Property(tag = 1)
		@JsonDeserialize(using = WorkZoneDeserializer.class)
		@JsonSerialize(using = WorkZoneSerializer.class)
		private WorkZone workZone;
		@Asn1Property(tag = 2)
		@JsonDeserialize(using = GenericSignDeserializer.class)
		@JsonSerialize(using = GenericSignSerializer.class)
		private GenericSignage genericSign;
		@Asn1Property(tag = 3)
		@JsonDeserialize(using = SpeedLimitDeserializer.class)
		@JsonSerialize(using = SpeedLimitSerializer.class)
		private SpeedLimit speedLimit;
		@Asn1Property(tag = 4)
		@JsonDeserialize(using = ExitServiceDeserializer.class)
		@JsonSerialize(using = ExitServiceSerializer.class)
		private ExitService exitService;

		ContentChoice() {
			super(false);
		}

		public ITIScodesAndText getAdvisory() {
			return advisory;
		}

		public void setAdvisory(ITIScodesAndText advisory) {
			this.advisory = advisory;
		}

		public WorkZone getWorkZone() {
			return workZone;
		}

		public void setWorkZone(WorkZone workZone) {
			this.workZone = workZone;
		}

		public GenericSignage getGenericSign() {
			return genericSign;
		}

		public void setGenericSign(GenericSignage genericSign) {
			this.genericSign = genericSign;
		}

		public SpeedLimit getSpeedLimit() {
			return speedLimit;
		}

		public void setSpeedLimit(SpeedLimit speedLimit) {
			this.speedLimit = speedLimit;
		}

		public ExitService getExitService() {
			return exitService;
		}

		public void setExitService(ExitService exitService) {
			this.exitService = exitService;
		}

		@Override
		protected List<Optional<Asn1Type>> listTypes() {
			return null;
		}
	}

	public ContentChoice getContent() {
		return content;
	}

	public void setContent(ContentChoice content) {
		this.content = content;
	}

	public URL_Short getUrl() {
		return url;
	}

	public void setUrl(URL_Short url) {
		this.url = url;
	}

	TravelerDataFrame() {
		super(true);
	}

	public static class AdvisoryDeserializer extends NestedSequenceOfDeserializer<ITIScodesAndText> {
		public AdvisoryDeserializer() {
			super(ITIScodesAndText.class, "SEQUENCE");
		}
	}

	public static class AdvisorySerializer extends NestedSequenceOfSerializer<ITIScodesAndText> {
		public AdvisorySerializer() {
			super(ITIScodesAndText.class, "SEQUENCE");
		}
	}

	public static class WorkZoneDeserializer extends NestedSequenceOfDeserializer<WorkZone> {
		public WorkZoneDeserializer() {
			super(WorkZone.class, "SEQUENCE");
		}
	}

	public static class WorkZoneSerializer extends NestedSequenceOfSerializer<WorkZone> {
		public WorkZoneSerializer() {
			super(WorkZone.class, "SEQUENCE");
		}
	}

	public static class GenericSignDeserializer extends NestedSequenceOfDeserializer<GenericSignage> {
		public GenericSignDeserializer() {
			super(GenericSignage.class, "SEQUENCE");
		}
	}

	public static class GenericSignSerializer extends NestedSequenceOfSerializer<GenericSignage> {
		public GenericSignSerializer() {
			super(GenericSignage.class, "SEQUENCE");
		}
	}

	public static class SpeedLimitDeserializer extends NestedSequenceOfDeserializer<SpeedLimit> {
		public SpeedLimitDeserializer() {
			super(SpeedLimit.class, "SEQUENCE");
		}
	}

	public static class SpeedLimitSerializer extends NestedSequenceOfSerializer<SpeedLimit> {
		public SpeedLimitSerializer() {
			super(SpeedLimit.class, "SEQUENCE");
		}
	}

	public static class ExitServiceDeserializer extends NestedSequenceOfDeserializer<ExitService> {
		public ExitServiceDeserializer() {
			super(ExitService.class, "SEQUENCE");
		}
	}

	public static class ExitServiceSerializer extends NestedSequenceOfSerializer<ExitService> {
		public ExitServiceSerializer() {
			super(ExitService.class, "SEQUENCE");
		}
	}
}