package us.dot.its.jpo.ode.plugin.j2735.timstorage;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import us.dot.its.jpo.ode.plugin.asn1.Asn1Object;

/**
 * A list of lane data attributes.
 */
@EqualsAndHashCode(callSuper = false)
@Data
public class LaneDataAttributeList extends Asn1Object {

  private static final long serialVersionUID = 1L;

  @JsonProperty("LaneDataAttribute")
  private LaneDataAttribute laneDataAttribute;
}
