package com.mds.beans;

import java.util.ArrayList;
import java.util.Date;

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

	@org.kie.api.definition.type.Label(value = "stop the monitoring")
	@org.kie.api.definition.type.Position(value = 3)
	private java.lang.Boolean stopMonitoring;

	public java.util.List<com.mds.beans.VitalSignMonitoring> getItemsToMonitor() {
		return itemsToMonitor;
	}

	public void setItemsToMonitor(	java.util.List<com.mds.beans.VitalSignMonitoring> itemsToMonitor) {
		this.itemsToMonitor = itemsToMonitor;		
	}

	public void addItemToMonitor(com.mds.beans.VitalSignMonitoring itemToMonitor) {
		if(itemsToMonitor == null){
			itemsToMonitor = new ArrayList<VitalSignMonitoring>();
		}
		this.itemsToMonitor.add(itemToMonitor);		
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
	
	public void addItem(int index, com.mds.beans.VitalSignMonitoring item)
	{
		if(items ==null)
		{
			this.items = new ArrayList<VitalSignMonitoring>();			
		}
		items.add(index, item);			
	}
	
	public void newMonitoringAssessment()
	{
		for (VitalSignMonitoring item : itemsToMonitor) {
			VitalSignMonitoring vs = new VitalSignMonitoring();
			vs.setRanges(item.getRanges());
			vs.setMiText(item.getMiText());
			if(item.getUnit() != null)
				vs.setUnit(item.getUnit());
			
			vs.setMiDate(new Date());	
			addItem(itemsToMonitor.indexOf(item), vs);					
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

	public java.lang.Boolean getStopMonitoring() {
		return this.stopMonitoring;
	}

	public void setStopMonitoring(java.lang.Boolean stopMonitoring) {
		this.stopMonitoring = stopMonitoring;
	}

	public Monitoring() {
	}

	public Monitoring(java.util.List<com.mds.beans.VitalSignMonitoring> items,
			com.mds.beans.Patient patient,
			java.util.List<com.mds.beans.VitalSignMonitoring> itemsToMonitor,
			java.lang.Boolean stopMonitoring) {
		this.items = items;
		this.patient = patient;
		this.itemsToMonitor = itemsToMonitor;
		this.stopMonitoring = stopMonitoring;
	}
}
