package com.mds.beans;

import java.util.ArrayList;

/**
 * This class was automatically generated by the data modeler tool.
 */

@org.kie.api.definition.type.Label("Vital Sign Monitoring Range")
public class VitalSignMonitoring extends SimpleExam implements java.io.Serializable {

    static final long serialVersionUID = 1L;

    @org.kie.api.definition.type.Label(value = "range")
	@org.kie.api.definition.type.Position(value = 1)
	private java.util.List<com.mds.beans.MonitoringRange> ranges;


	public java.util.List<com.mds.beans.MonitoringRange> getRange() {
		return this.ranges;
	}

	public void setRange(java.util.List<com.mds.beans.MonitoringRange> ranges) {
		this.ranges = ranges;
	}

	public VitalSignMonitoring() {
		super();
	}

	public VitalSignMonitoring(	java.util.List<com.mds.beans.MonitoringRange> ranges) {
		super();		
		this.ranges = ranges;
	}

	public void addRange(com.mds.beans.MonitoringRange range)
	{
		if(ranges == null)
		{
			this.ranges = new ArrayList<MonitoringRange>();
		}
		ranges.add(range);
	}
}