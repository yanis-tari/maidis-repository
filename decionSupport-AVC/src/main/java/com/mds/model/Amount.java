package com.mds.model;

import com.mds.gao.Generated;
import com.mds.gao.Id;
import com.mds.gao.Namespace;
import com.mds.gao.Transient;
import com.mds.gao.binding.RdfBean;

@Namespace(MdsVocabulary.NS)
public class Amount extends RdfBean<Amount> implements java.io.Serializable{
	
	@Transient	private static final long serialVersionUID = 1;
	@Generated	@Id	private Long id;	
	private float hasConfidence;	
	private String amountName;	
	private String hasDataValueType; 	
	private String hasDataStringvalue;	
	private Double hasDataNumValue;		
	private String hasUnit;
	
	
	
	public Amount() {
		super();
	}
	public Amount( float hasConfidence, String hasDatavalue,
			String hasUnit) {
		super();		
		this.hasConfidence = hasConfidence;
		this.hasDataStringvalue = hasDatavalue;
		this.hasUnit = hasUnit;
	}
	
	
	public Amount(float hasConfidence, String amountName,
			String hasDataValueType, String hasDataStringvalue,
			Double hasDataNumValue, String hasUnit) {
		super();		
		this.hasConfidence = hasConfidence;
		this.amountName = amountName;
		this.hasDataValueType = hasDataValueType;
		this.hasDataStringvalue = hasDataStringvalue;
		this.hasDataNumValue = hasDataNumValue;
		this.hasUnit = hasUnit;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public float getHasConfidence() {
		return hasConfidence;
	}
	public void setHasConfidence(float hasConfidence) {
		this.hasConfidence = hasConfidence;
	}
	public String getHasDataStringvalue() {
		return hasDataStringvalue;
	}
	public void setHasDataStringvalue(String hasDatavalue) {
		this.hasDataStringvalue = hasDatavalue;
	}
	public String getHasUnit() {
		return hasUnit;
	}
	public void setHasUnit(String hasUnit) {
		this.hasUnit = hasUnit;
	}
	public String getAmountName() {
		return amountName;
	}
	public void setAmountName(String amountName) {
		this.amountName = amountName;
	}
	public String getHasDataValueType() {
		return hasDataValueType;
	}
	public void setHasDataValueType(String hasDataValueType) {
		this.hasDataValueType = hasDataValueType;
	}
	public Double getHasDataNumValue() {
		return hasDataNumValue;
	}
	public void setHasDataNumValue(Double hasDataNumValue) {
		this.hasDataNumValue = hasDataNumValue;
	}	
	
	

}
