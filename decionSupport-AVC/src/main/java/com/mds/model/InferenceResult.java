package com.mds.model;

import java.rmi.server.UID;
import java.util.Date;

import com.mds.gao.Id;
import com.mds.gao.RdfProperty;
import com.mds.gao.Transient;
import com.mds.gao.binding.RdfBean;

public class InferenceResult extends RdfBean<InferenceResult> implements java.io.Serializable{

	@Transient
	private static final long serialVersionUID = 1388471172021182604L;
	@Id
	private String id; 
	
	@RdfProperty(MdsVocabulary.value)
	private String value;
	
	@RdfProperty(MdsVocabulary.integerValue)
	private int integerValue;
	
	@RdfProperty(MdsVocabulary.operation)
	private String operation;
	
	@RdfProperty(MdsVocabulary.remark)
	private String remark;
	
	@RdfProperty(MdsVocabulary.desciption)
	private String desciption;
	
	@RdfProperty(MdsVocabulary.service)
	private String service;
	
	@RdfProperty(MdsVocabulary.ruleThatGiveTheResult)
	private String ruleThatGiveTheResult;
	
	@RdfProperty(MdsVocabulary.relatedPathway)
	private String relatedPathway;
	
	@RdfProperty(MdsVocabulary.startRelatedPathway)
	private Boolean startRelatedPathway;
	
	@RdfProperty(MdsVocabulary.date)
	private Date date;
	
	
	
	public InferenceResult() {
		super();
		this.id = new UID().toString();
	}

	
	public InferenceResult( String value, int integerValue,
			String operation, String remark, String desciption, String service,
			String ruleThatGiveTheResult, Date date) {
		super();
		this.id = new UID().toString();
		this.value = value;
		this.integerValue = integerValue;
		this.operation = operation;
		this.remark = remark;
		this.desciption = desciption;
		this.service = service;
		this.ruleThatGiveTheResult = ruleThatGiveTheResult;
		this.date = date;
	}

	
	public String getId() {
		return id;
		
	}

	public void setId(String id) {
		this.id = id;
	}

	
	
	public Boolean getStartRelatedPathway() {
		return startRelatedPathway;
	}


	public void setStartRelatedPathway(Boolean startRelatedPathway) {
		this.startRelatedPathway = startRelatedPathway;
	}


	public String getRelatedPathway() {
		return relatedPathway;
	}


	public void setRelatedPathway(String relatedPathway) {
		this.relatedPathway = relatedPathway;
	}


	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public String getRuleThatGiveTheResult() {
		return ruleThatGiveTheResult;
	}

	public void setRuleThatGiveTheResult(String ruleThatGiveTheResult) {
		this.ruleThatGiveTheResult = ruleThatGiveTheResult;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public int getIntegerValue() {
		return integerValue;
	}

	public void setIntegerValue(int integerValue) {
		this.integerValue = integerValue;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getDesciption() {
		return desciption;
	}

	public void setDesciption(String desciption) {
		this.desciption = desciption;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	
}
