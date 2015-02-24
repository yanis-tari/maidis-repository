package com.mds.beans;

/**
 * This class was automatically generated by the data modeler tool.
 */

@org.kie.api.definition.type.Label("Monitoring")
public class Monitoring implements java.io.Serializable {

    static final long serialVersionUID = 1L;

    @org.kie.api.definition.type.Label("nurse actes")
	@org.kie.api.definition.type.Position(0)
	private java.util.List<com.mds.beans.NurseActe> nurseActe;

	@org.kie.api.definition.type.Position(value = 1)
	private java.util.List<com.mds.beans.VitalSignMonitoringRange> items;

	public java.util.List<com.mds.beans.NurseActe> getNurseActe() {
		return this.nurseActe;
	}

	public void setNurseActe(java.util.List<com.mds.beans.NurseActe> nurseActe) {
		this.nurseActe = nurseActe;
	}

	public java.util.List<com.mds.beans.VitalSignMonitoringRange> getItems() {
		return this.items;
	}

	public void setItems(
			java.util.List<com.mds.beans.VitalSignMonitoringRange> items) {
		this.items = items;
	}

	public Monitoring() {
	}

	public Monitoring(java.util.List<com.mds.beans.NurseActe> nurseActe,
			java.util.List<com.mds.beans.VitalSignMonitoringRange> items) {
		this.nurseActe = nurseActe;
		this.items = items;
	}

}