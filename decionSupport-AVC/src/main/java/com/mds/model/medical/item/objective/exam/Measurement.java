package com.mds.model.medical.item.objective.exam;

import java.io.Serializable;

import com.mds.gao.Namespace;
import com.mds.model.MdsVocabulary;


@Namespace(MdsVocabulary.NS)
public interface Measurement extends Serializable, Exam {
	
	public Double  getValue();
	
	public void setValue(Double value);
	
	public String getUnit();
	
	public void setUnit(String unit);
	
	
	
}
