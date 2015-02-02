package com.mds.factory;

import virtuoso.jena.driver.VirtModel;

import com.hp.hpl.jena.rdf.model.Model;
import com.mds.gao.binding.Jenabean;

public class VirtConnection {
	
	  private static String url = "jdbc:virtuoso://localhost:1111";
	 
	  private static String user = "dba";
	 
	  private static String passwd = "dba";
	 	  
	  private static String graphName="http://ontology/mds";

	  private static Jenabean jenabean;	 
	  
	  private VirtConnection(){}
	  
	  public static Jenabean getInstance(){
	    if(jenabean == null){	      
	    	Model model  = VirtModel.openDatabaseModel(graphName, url, user, passwd);
	    	jenabean = Jenabean.instance();
	    	jenabean.bind(model);
	    	jenabean.bindAll("com.mds.model");	    	
	    }      
	    return jenabean;
	  }	
}
