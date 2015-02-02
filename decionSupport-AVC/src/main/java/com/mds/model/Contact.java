package com.mds.model;

import java.rmi.server.UID;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

import com.mds.gao.Generated;
import com.mds.gao.Id;
import com.mds.gao.Namespace;
import com.mds.gao.RdfProperty;
import com.mds.gao.Transient;
import com.mds.gao.binding.RdfBean;



@Namespace(MdsVocabulary.NS)
public class Contact extends RdfBean<Contact> implements java.io.Serializable{

	/**
	 * 
	 */
	@Transient
	private static final long serialVersionUID = 5619527857888263895L;
	
	@Generated
	@Id
	private String id;
	
	@RdfProperty(MdsVocabulary.HealthcarePersonneConcerned)
	private User healthcarePersonneConcerned;
	
	@RdfProperty(MdsVocabulary.hasMedicalItems)
	private List<MedicalItem> hasMedicalItems = new ArrayList<MedicalItem>();
	
	@RdfProperty(MdsVocabulary.hasMedicalItemsComposition)
	private List<CompositionOfMedicalItems> hasMedicalItemsComposition= new ArrayList<CompositionOfMedicalItems>();

	@RdfProperty(MdsVocabulary.hasMedicalRecordInvolved)
	private MedicalRecord hasMedicalRecordInvolved;
	
	@RdfProperty(MdsVocabulary.PatientConcerned)
	private Patient patientConcerned;
	
	@RdfProperty(MdsVocabulary.startDateOfContact)
	private Date startDateOfContact;
	
	@RdfProperty(MdsVocabulary.endDateOfContact)
	private Date endDateOfContact;
	
	@RdfProperty(MdsVocabulary.commentOfContact)
	private String commentOfContact;
	
	@RdfProperty(MdsVocabulary.contactId)
	private int contactId;
	
	@RdfProperty(MdsVocabulary.contactPlace)
	private String contactPlace;
	
	@RdfProperty(MdsVocabulary.contactState)
	private int contactState;
	
	@RdfProperty(MdsVocabulary.contactType)
	private String contactType;
	
	@RdfProperty(MdsVocabulary.ContactReason)
	private String ContactReason;
	
	@RdfProperty(MdsVocabulary.hasInferenceResults)
	private List<InferenceResult> hasInferenceResults = new ArrayList<InferenceResult>();
	
	public Contact() {
		super();
		this.id = new UID().toString();
	}

	public Contact(User healthcarePersonneConcerned,
			List<MedicalItem> hasMedicalItems,
			List<CompositionOfMedicalItems> hasMedicalItemsComposition,
			MedicalRecord hasMedicalRecordInvolved, Patient patientConcerned,
			Date startDateOfContact, Date endDateOfContact,
			String commentOfContact) {
		super();
		this.id = new UID().toString();
		this.healthcarePersonneConcerned = healthcarePersonneConcerned;
		this.hasMedicalItems = hasMedicalItems;
		this.hasMedicalItemsComposition = hasMedicalItemsComposition;
		this.hasMedicalRecordInvolved = hasMedicalRecordInvolved;
		this.patientConcerned = patientConcerned;		
		this.startDateOfContact =  startDateOfContact;
		this.endDateOfContact =  endDateOfContact;
		this.commentOfContact = commentOfContact;
	}

	
	
	
	public int getContactId() {
		return contactId;
	}

	public void setContactId(int contactId) {
		this.contactId = contactId;
	}

	public String getContactPlace() {
		return contactPlace;
	}

	public void setContactPlace(String contactPlace) {
		this.contactPlace = contactPlace;
	}

	public int getContactState() {
		return contactState;
	}

	public void setContactState(int contactState) {
		this.contactState = contactState;
	}

	public String getContactType() {
		return contactType;
	}

	public void setContactType(String contactType) {
		this.contactType = contactType;
	}

	public String getContactReason() {
		return ContactReason;
	}

	public void setContactReason(String contactReason) {
		ContactReason = contactReason;
	}

	/**
	 * @return the healthcarePersonneConcerned
	 */
	public User getHealthcarePersonneConcerned() {
		return healthcarePersonneConcerned;
	}

	/**
	 * @param healthcarePersonneConcerned the healthcarePersonneConcerned to set
	 */
	public void setHealthcarePersonneConcerned(
			User healthcarePersonneConcerned) {
		this.healthcarePersonneConcerned = healthcarePersonneConcerned;
	}

	/**
	 * @return the hasMedicalItems
	 */
	public List<MedicalItem> getHasMedicalItems() {
		return hasMedicalItems;
	}

	/**
	 * @param hasMedicalItems the hasMedicalItems to set
	 */
	public void setHasMedicalItems(List<MedicalItem> hasMedicalItems) {
		this.hasMedicalItems = hasMedicalItems;
	}

	public void addMedicalItem(MedicalItem medicalItem){
		if(medicalItem!=null){
			this.hasMedicalItems.add(medicalItem);			
		}
				
	}
	public void addAllMedicalItem(List<? extends MedicalItem> medicalItems){
		if(medicalItems!=null){
			this.hasMedicalItems.addAll(medicalItems);			
		}		
	}
	/**
	 * @return the hasMedicalItemsComposition
	 */
	public List<CompositionOfMedicalItems> getHasMedicalItemsComposition() {
		return hasMedicalItemsComposition;
	}

	/**
	 * @param hasMedicalItemsComposition the hasMedicalItemsComposition to set
	 */
	public void setHasMedicalItemsComposition(
			List<CompositionOfMedicalItems> hasMedicalItemsComposition) {
		this.hasMedicalItemsComposition = hasMedicalItemsComposition;
	}
	public void addMedicalItemsComposition(
			CompositionOfMedicalItems medicalItemsComposition) {
		this.hasMedicalItemsComposition.add(medicalItemsComposition);
	}
	/**
	 * @return the hasMedicalRecordInvolved
	 */
	public MedicalRecord getHasMedicalRecordInvolved() {
		return hasMedicalRecordInvolved;
	}

	/**
	 * @param hasMedicalRecordInvolved the hasMedicalRecordInvolved to set
	 */
	public void setHasMedicalRecordInvolved(MedicalRecord hasMedicalRecordInvolved) {
		this.hasMedicalRecordInvolved = hasMedicalRecordInvolved;
	}

	/**
	 * @return the patientConcerned
	 */
	public Patient getPatientConcerned() {
		return patientConcerned;
	}

	/**
	 * @param patientConcerned the patientConcerned to set
	 */
	public void setPatientConcerned(Patient patientConcerned) {
		this.patientConcerned = patientConcerned;
	}

	/**
	 * @return the startDateOfContact
	 */
	public Date getStartDateOfContact() {
		return startDateOfContact;
	}

	/**
	 * @param startDateOfContact the startDateOfContact to set
	 */
	public void setStartDateOfContact(Date startDateOfContact) {
		this.startDateOfContact =  startDateOfContact;			
	}

	/**
	 * @return the endDateOfContact
	 */
	public Date getEndDateOfContact() {
		return endDateOfContact;
	}

	/**
	 * @param endDateOfContact the endDateOfContact to set
	 */
	public void setEndDateOfContact(Date endDateOfContact) {
		this.endDateOfContact =  endDateOfContact;		
	}

	/**
	 * @return the commentOfContact
	 */
	public String getCommentOfContact() {
		return commentOfContact;
	}

	/**
	 * @param commentOfContact the commentOfContact to set
	 */
	public void setCommentOfContact(String commentOfContact) {
		this.commentOfContact = commentOfContact;
	}

	public List<InferenceResult> getHasInferenceResults() {
		return hasInferenceResults;
	}

	public void setHasInferenceResults(List<InferenceResult> hasInferenceResults) {
		this.hasInferenceResults = hasInferenceResults;
	}

	public void addInferenceResults(InferenceResult inferenceResult) {
		this.hasInferenceResults.add(inferenceResult);
	}
	
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	
	public void setId(String id){
		this.id = id;
	}
	
	
	
}
