package com.mds.model.medical.item;

import java.io.Serializable;

import com.mds.model.MdsVocabulary;
import com.mds.model.MedicalItem;

import com.mds.gao.Namespace;

@Namespace(MdsVocabulary.NS)
public interface Objective extends MedicalItem,Serializable {
	
	
}
