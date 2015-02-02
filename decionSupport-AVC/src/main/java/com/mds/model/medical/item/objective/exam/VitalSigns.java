package com.mds.model.medical.item.objective.exam;

import java.io.Serializable;

import com.mds.gao.Namespace;

import com.mds.model.MdsVocabulary;

@Namespace(MdsVocabulary.NS)
public interface VitalSigns extends Serializable, Exam {	
	
	public String getUnit();
	
	public void setUnit(String unit);
		
	public String  getStringValue();

	public void setStringValue(String value);
	
	
}
