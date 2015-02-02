package com.mds.model;

import java.rmi.server.UID;
import java.util.ArrayList;
import java.util.List;

import com.mds.gao.Id;
import com.mds.gao.Namespace;
import com.mds.gao.RdfProperty;
import com.mds.gao.Transient;
import com.mds.gao.binding.RdfBean;


@Namespace(MdsVocabulary.NS)
public class MedicalRecord extends RdfBean<MedicalRecord> implements java.io.Serializable{
	/**
	 * 
	 */
	@Transient
	private static final long serialVersionUID = 5928521093734753509L;
	@Id
	private String id;
	@RdfProperty("http://ontology/mds#hasComment")
	private String hasComment;
	@RdfProperty("http://ontology/mds#hasStaticInformation")
	private Patient hasStaticInformation;	
	@RdfProperty("http://ontology/mds#hasContacts")
	private List<Contact> hasContacts = new ArrayList<Contact>();
	
	@RdfProperty(MdsVocabulary.hasInferenceResults)
	private List<InferenceResult> hasInferenceResults = new ArrayList<InferenceResult>();
	
	public MedicalRecord() {
		this.id = new UID().toString();
	}
	

	public MedicalRecord( String hasComment, Patient hasStaticInformation, List<Contact> hasContacts) {
		this.id = new UID().toString();
		this.hasComment = hasComment;
		this.hasStaticInformation = hasStaticInformation;
		this.hasContacts = hasContacts;
	}



	public MedicalRecord(String id, String hasComment,
			Patient hasStaticInformation, List<Contact> hasContacts,
			List<InferenceResult> hasInferenceResults) {
		super();
		this.id = id;
		this.hasComment = hasComment;
		this.hasStaticInformation = hasStaticInformation;
		this.hasContacts = hasContacts;
		this.hasInferenceResults = hasInferenceResults;
	}


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	
	

	public List<InferenceResult> getHasInferenceResults() {
		return hasInferenceResults;
	}


	public void setHasInferenceResults(List<InferenceResult> hasInferenceResults) {
		this.hasInferenceResults = hasInferenceResults;
	}
//
//	@Transient
//	public void addInferenceResult(String value,int integerValue,String operation,String remark,String desciption,Date date){		
//		this.hasInferenceResults.add(new InferenceResult(value, integerValue, operation, remark, desciption, date));		
//	}
	
	@Transient
	public void addInferenceResult(InferenceResult ir){		
		this.hasInferenceResults.add(ir);		
	}
	
	public String getHasComment() {
		return hasComment;
	}

	public void setHasComment(String hasComment) {
		this.hasComment = hasComment;
	}

	public Patient getHasStaticInformation() {
		return hasStaticInformation;
	}

	public void setHasStaticInformation(Patient hasStaticInformation) {
		this.hasStaticInformation = hasStaticInformation;
	}

	public List<Contact> getHasContacts() {
		return hasContacts;
	}

	public void setHasContacts(List<Contact> hasContacts) {
		this.hasContacts = hasContacts;
	}

	@Transient
	public void addContact(Contact contact){
		this.hasContacts.add(contact);
	}	
}
