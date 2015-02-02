package com.mds.model;

import java.util.Date;

import com.mds.gao.Namespace;

@Namespace(MdsVocabulary.NS)
public interface Person extends java.io.Serializable{
	
	public String  getId();
	public String getFirstName();
	public void setFirstName(String firstName);
	public String getLastName();
	public void setLastName(String lastName);
	public Date getBirthDate();
	public void setBirthDate(Date birthDate);
	public String getAdress();	
	public void setAdress(String adress);	
	public String getEmail();
	public void setEmail(String email);
	public String toString();
	public boolean equals(Object obj);
	public int hashCode();
	
	
}
