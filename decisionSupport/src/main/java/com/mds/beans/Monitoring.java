package com.mds.beans;

import java.util.ArrayList;

/**
 * This class was automatically generated by the data modeler tool.
 */

@org.kie.api.definition.type.Label("Monitoring")
public class Monitoring implements java.io.Serializable {

    static final long serialVersionUID = 1L;

    @org.kie.api.definition.type.Position(0)
	private java.util.List<com.mds.beans.VitalSignMonitoring> items;

	@org.kie.api.definition.type.Label("patient")
	@org.kie.api.definition.type.Position(1)
	private com.mds.beans.Patient patient;
	
	@org.kie.api.definition.type.Label("items to Monitor")
	@org.kie.api.definition.type.Position(2)	
	private java.util.List<com.mds.beans.VitalSignMonitoring> itemsToMonitor;

	public java.util.List<com.mds.beans.VitalSignMonitoring> getItemsToMonitor() {
		return itemsToMonitor;
	}

	public void setItemsToMonitor(	java.util.List<com.mds.beans.VitalSignMonitoring> itemsToMonitor) {
		this.itemsToMonitor = itemsToMonitor;
		newMonitoringAssessment();
	}

	public void addItemToMonitor(com.mds.beans.VitalSignMonitoring itemToMonitor) {
		if(itemsToMonitor == null){
			itemsToMonitor = new ArrayList<VitalSignMonitoring>();
		}
		this.itemsToMonitor.add(itemToMonitor);
		addItem(itemToMonitor);
	}
	
	public java.util.List<com.mds.beans.VitalSignMonitoring> getItems() {
		return this.items;
	}

	public void setItems(java.util.List<com.mds.beans.VitalSignMonitoring> items) 
	{
		this.items = items;
	}
	
	public void addItem(com.mds.beans.VitalSignMonitoring item)
	{
		if(items ==null)
		{
			this.items = new ArrayList<VitalSignMonitoring>();			
		}
		this.items.add(item);		
	}
	
	public void newMonitoringAssessment()
	{
		for (VitalSignMonitoring item : itemsToMonitor) {
			addItem(item);
			
		}
	}

	public com.mds.beans.Patient getPatient() {
		return this.patient;
	}

	public void setPatient(com.mds.beans.Patient patient) {
		this.patient = patient;
	}

	@Override
	public String toString() {
		return "Monitoring [items=" + items + "]";
	}

	public Monitoring() {
	}

	public Monitoring(java.util.List<com.mds.beans.VitalSignMonitoring> items,
			com.mds.beans.Patient patient) {
		this.items = items;
		this.patient = patient;
	}
}