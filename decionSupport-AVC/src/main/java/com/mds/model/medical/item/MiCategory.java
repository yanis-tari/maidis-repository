package com.mds.model.medical.item;

public enum MiCategory {
	M("Motif"),
	S("Symptome"),
	O("Objective");

	private final String val;
	
	MiCategory(String val){this.val = val;}
	
	public String toString(){return val;}
}
