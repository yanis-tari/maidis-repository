package com.mds.beans;

import com.mds.beans.Triage;

/**
 * This class was automatically generated by the data modeler tool.
 */

@org.kie.api.definition.type.Label("AVC")
public class Avc extends Triage implements java.io.Serializable {

    static final long serialVersionUID = 1L;

    @org.kie.api.definition.type.Position(1)
	private java.lang.Integer glasgowScore;

    @org.kie.api.definition.type.Position(0)
	private java.lang.String irmResult;

    @org.kie.api.definition.type.Position(2)
	private java.lang.Integer nihssScore;

    @org.kie.api.definition.type.Position(3)
	private java.lang.String patientidentity;    
    
    @org.kie.api.definition.type.Position(4)
	private java.lang.String irmReport;

	@org.kie.api.definition.type.Position(5)
	private java.lang.Integer glasgowScoreReassessment;

	@org.kie.api.definition.type.Position(6)
	private java.lang.Integer nihssScoreReassessment;

	@org.kie.api.definition.type.Position(value = 7)
	private java.lang.String treatmentSuggestion;

	public java.lang.Integer getGlasgowScore() {
        return this.glasgowScore;
    }
    
    public void setGlasgowScore(java.lang.Integer glasgowScore) {
        this.glasgowScore = glasgowScore;
    }

    public java.lang.String getIrmResult() {
        return this.irmResult;
    }
    
    public void setIrmResult(java.lang.String irmResult) {
        this.irmResult = irmResult;
    }

    public java.lang.Integer getNihssScore() {
        return this.nihssScore;
    }
    
    public void setNihssScore(java.lang.Integer nihssScore) {
        this.nihssScore = nihssScore;
    }

    
    @Override
	public String toString() {
		return "Avc [glasgowScore=" + glasgowScore + ", irmResult=" + irmResult
				+ ", nihssScore=" + nihssScore + ", patientidentity="
				+ patientidentity + ", contact=" + contact + ", patient="
				+ patient + ", pamiList=" + pamiList + ", triageValue="
				+ triageValue + ", triageDescription=" + triageDescription
				+ ", triageDate=" + triageDate + ", suggestions=" + suggestions
				+ ", adoptedSuggestion=" + adoptedSuggestion
				+ ", startTheSelectedClinicalPathway="
				+ startTheSelectedClinicalPathway + "]";
	}

	public java.lang.String getIrmReport() {
		return this.irmReport;
	}

	public void setIrmReport(java.lang.String irmReport) {
		this.irmReport = irmReport;
	}

	public java.lang.Integer getGlasgowScoreReassessment() {
		return this.glasgowScoreReassessment;
	}

	public void setGlasgowScoreReassessment(
			java.lang.Integer glasgowScoreReassessment) {
		this.glasgowScoreReassessment = glasgowScoreReassessment;
	}

	public java.lang.Integer getNihssScoreReassessment() {
		return this.nihssScoreReassessment;
	}

	public void setNihssScoreReassessment(
			java.lang.Integer nihssScoreReassessment) {
		this.nihssScoreReassessment = nihssScoreReassessment;
	}

	public java.lang.String getTreatmentSuggestion() {
		return this.treatmentSuggestion;
	}

	public void setTreatmentSuggestion(java.lang.String treatmentSuggestion) {
		this.treatmentSuggestion = treatmentSuggestion;
	}

	public Avc() {
	}

	public Avc(java.lang.String irmResult, java.lang.Integer glasgowScore,
			java.lang.Integer nihssScore, java.lang.String patientidentity,
			java.lang.String irmReport,
			java.lang.Integer glasgowScoreReassessment,
			java.lang.Integer nihssScoreReassessment,
			java.lang.String treatmentSuggestion) {
		this.irmResult = irmResult;
		this.glasgowScore = glasgowScore;
		this.nihssScore = nihssScore;
		this.patientidentity = patientidentity;
		this.irmReport = irmReport;
		this.glasgowScoreReassessment = glasgowScoreReassessment;
		this.nihssScoreReassessment = nihssScoreReassessment;
		this.treatmentSuggestion = treatmentSuggestion;
	}
	
	public Avc(com.mds.beans.Triage triage) {
    	this.patient = triage.getPatient();
		this.contact = triage.getContact();
		this.pamiList = triage.getPamiList();
		this.triageValue = triage.getTriageValue();
		this.triageDescription = triage.getTriageDescription();
		this.triageDate =triage.getTriageDate();
		this.suggestions = triage.getSuggestions();
		this.adoptedSuggestion =triage.getAdoptedSuggestion();
		this.startTheSelectedClinicalPathway = triage.getStartTheSelectedClinicalPathway();
		if(triage.getPatient() != null  && triage.getPatient().getFirstName() != null && triage.getPatient().getLastName() != null)
			this.patientidentity = triage.getPatient().getFirstName()+" "+triage.getPatient().getLastName();
   	}
	
}