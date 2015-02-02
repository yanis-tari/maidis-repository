package com.mds.model;

import com.mds.factory.MdsRdfBean;
import com.mds.gao.Namespace;

@Namespace(MdsVocabulary.NS)
public class Employe extends MdsRdfBean<Employe>{
		
	
	
	private  String name;
	
	private  String Lastname;

	public Employe() {
		super();
	
	}
	
	

	public String getName() {
		return name;
	}

	public String getLastname() {
		return Lastname;
	}

	public void setLastname(String lastname) {
		Lastname = lastname;
	}

	public void setName(String name) {	
		this.name = name;
	}
	
	

	
}
