package com.mds.model.medical.item.objective.exam;

import java.io.Serializable;

import com.mds.gao.Namespace;

import com.mds.model.MdsVocabulary;
import com.mds.model.medical.item.Objective;


@Namespace(MdsVocabulary.NS)
public interface Exam extends Serializable, Objective {
	
	public Boolean getIsAnPrescription();

	public void setIsAnPrescription(Boolean isAnPrescription);

	public Boolean getIsAnResult();
	
	public void setIsAnResult(Boolean isAnResult);	
	
	public String  getStringValue();
	
	public void setStringValue(String value);	
	
	
}
