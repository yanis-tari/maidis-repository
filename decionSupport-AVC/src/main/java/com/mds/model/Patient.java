package com.mds.model;

import java.rmi.server.UID;
import java.util.Date;

import virtuoso.jena.driver.VirtGraph;
import virtuoso.jena.driver.VirtModel;

import com.mds.gao.Generated;
import com.mds.gao.Id;
import com.mds.gao.Namespace;
import com.mds.gao.RdfProperty;
import com.mds.gao.Transient;
import com.mds.gao.binding.Jenabean;
import com.mds.gao.binding.RdfBean;

@Namespace(MdsVocabulary.NS)
public class Patient extends RdfBean<Patient>  implements java.io.Serializable,Person{
	
	/**
	 * 
	 */
	@Transient
	private static final long serialVersionUID = 5700458147540833945L;
	@Transient
	private boolean existeInOnt;
	
	@Generated
	@Id	
	private String patient_id;
	
	@RdfProperty(MdsVocabulary.pin)	
	private String pin;
	
	@RdfProperty(MdsVocabulary.patientInsurance_id)
	private int patientInsurance_id;
	
	@RdfProperty(MdsVocabulary.gender)
	private int gender;
	
	@RdfProperty(MdsVocabulary.firstName)
	private String firstName;
	
	@RdfProperty(MdsVocabulary.lastName)
	private String lastName;	
	
	@RdfProperty(MdsVocabulary.birthDate)
	private Date birthDate;
	
	@RdfProperty(MdsVocabulary.adress)
	private String adress;
	
	@RdfProperty(MdsVocabulary.email)
	private String email;	
	
	
	

	@RdfProperty(MdsVocabulary.medicalRecordOfPatient)
	private MedicalRecord medicalRecordOfPatient;
	
		
	
	public Patient() {	
		super();
	}

	public Patient(String firstName, String lastName, Date birthDate,
			String adress, String email, MedicalRecord medicalRecordOfPatient) {
		super();
		this.patient_id = new UID().toString();			
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.adress = adress;
		this.email = email;
		this.medicalRecordOfPatient = medicalRecordOfPatient;
	}

	



	public void setId(String id) {
		
		if(!id.equals("") && ! existeInOnt){
			try{
			VirtGraph graph = new VirtGraph ("http://ontology/mds","jdbc:virtuoso://smdspatst52:1111", "dba", "dba");	
			VirtModel model  = new VirtModel(graph);
			Jenabean jenaBean = Jenabean.instance();
			jenaBean.bind(model);
			jenaBean.bind(MdsVocabulary.Patient);	
			Patient p =	this.load(id);
			this.patient_id = p.getId();
			this.adress = p.getAdress();				
			this.firstName = p.getFirstName();
			this.lastName = p.getLastName();
			this.birthDate = p.getBirthDate();
			this.email = p.getEmail();
			this.pin = p.getPin();
			this.patientInsurance_id = p.getPatientInsurance_id();
			this.medicalRecordOfPatient = p.getMedicalRecordOfPatient();
			this.existeInOnt = true;
			this.setId(id);
			}catch(Exception e){
				this.patient_id = id;
			}
			
		}
	}


	public MedicalRecord getMedicalRecordOfPatient() {
		return medicalRecordOfPatient;
	}

	public void setMedicalRecordOfPatient(MedicalRecord medicalRecordOfPatient) {
		this.medicalRecordOfPatient = medicalRecordOfPatient;
	}
	
	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public int getPatientInsurance_id() {
		return patientInsurance_id;
	}

	public void setPatientInsurance_id(int patientInsurance_id) {
		this.patientInsurance_id = patientInsurance_id;
	}

	public void setExisteInOnt(boolean existeInOnt) {
		this.existeInOnt = existeInOnt;
	}

	public void setPatient_id(String patient_id) {
		this.patient_id = patient_id;
	}


	public boolean isExisteInOnt() {
		return existeInOnt;
	}

	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public Date getBirthDate() {
		return birthDate;
	}



	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}



	public String getAdress() {
		return adress;
	}



	public void setAdress(String adress) {
		this.adress = adress;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getPatient_id() {
		return patient_id;
	}

	public String getId() {
		
		return patient_id;
	}




}
