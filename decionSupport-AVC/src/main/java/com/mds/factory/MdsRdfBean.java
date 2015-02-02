package com.mds.factory;

import java.rmi.server.UID;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

import com.mds.gao.Id;
import com.mds.gao.binding.RdfBean;

public class MdsRdfBean<T> extends RdfBean<T>{
	
	@Id private String id;
	
	 public MdsRdfBean(){
		 super();
		 this.id = new UID().toString();		 		 
	 }	
	 

	 public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public Collection<T> loadWithFilter(Map<String, Object> propertyValueMap){		 
		 Set<String> keySet = propertyValueMap.keySet();
				 
		 String sparql=" SELECT ?s WHERE { ?s a <http://ontology/mds#"+getClass().getSimpleName()+"> . ";
		 for (String property : keySet) {
			 Object o = propertyValueMap.get(property);
			 String filter="";
			 if(o instanceof String)
				 filter+="FILTER regex( ?"+property+" ,\""+(String)o+"\" ) . " ;
			 if(o instanceof Integer || o instanceof Long || o instanceof Double || o instanceof Float )
				 filter+="FILTER ( ?"+property+"  = "+o.toString()+" ) . " ;			 			 
			 sparql+= "?s  <http://ontology/mds#"+property+"> ?"+property+" . "+filter;								
		}
		 sparql += " } ";
		 
		return query(sparql);		 		
	 }
	 
	 public Collection<T> loadWithFilter(Map<String, Object> propertyValueMap, String[] operators){		 
		 if(operators == null || propertyValueMap.size()!= operators.length)
			 return loadWithFilter(propertyValueMap);
		 
		 
		 Set<String> keySet = propertyValueMap.keySet();
		 int i =0;		 		
		 String sparql=" SELECT ?s WHERE { ?s a <http://ontology/mds#"+getClass().getSimpleName()+"> . ";
		 for (String property : keySet) {
			 Object o = propertyValueMap.get(property);
			 String filter="";
			 if(o instanceof String)
			 {
				 filter+="FILTER regex( ?"+property+" ,\""+(String)o+"\" ) . " ;
			 }
			 if(o instanceof Integer || o instanceof Long || o instanceof Double || o instanceof Float )
			 {
				 filter+="FILTER ( ?"+property+" "+operators[i]+" "+o.toString()+" ) . ";
			 }
			 i++;
			 sparql+= "?s  <http://ontology/mds#"+property+"> ?"+property+" . "+filter;								
		}
		 
		 sparql += " } ";
		 
		return query(sparql);		 		
	 }
	 
}
