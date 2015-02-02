package com.mds.factory;

import java.util.Collection;

import com.mds.gao.binding.Jenabean;
import com.mds.gao.binding.RdfBean;
import com.mds.model.Contact;
import com.mds.model.Employe;
import com.mds.model.MedicalRecord;
import com.mds.model.Patient;

public class ModelFactory {
	protected static Jenabean jenabean = VirtConnection.getInstance();
	
private ModelFactory(){}	

public static <E> E loadBean(Class<E> c, int id){ return Jenabean.load(c, id);}

public static <E> E loadBean(Class<E> c, String id){ return Jenabean.load(c, id);}

public static  Collection<Patient> loadAllPatients(){return Jenabean.load(Patient.class);}

public static Patient loadPatient(String id){return Jenabean.load(Patient.class,id);}

public static Collection<MedicalRecord> loadAllMedicalRecord(){	return Jenabean.load(MedicalRecord.class);} 

public static MedicalRecord loadMedicalRecord(String id){return Jenabean.load(MedicalRecord.class, id);} 

public static Contact loadContact(String id){return Jenabean.load(Contact.class, id);} 

public static Collection<Contact> loadAllContact(){	return Jenabean.load(Contact.class);} 

public static RdfBean<Patient> getPatient(){return new Patient();}

public static Employe getEmploye(){	return new Employe();}

public static <T> Collection<T> execSparql(Class<T> c,String query) {	return Jenabean.query(c, query);}

}
