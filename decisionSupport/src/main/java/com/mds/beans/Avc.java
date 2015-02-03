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
    
    @org.kie.api.definition.type.Position(3)
   	private org.jbpm.document.Document irmReport;

    @org.kie.api.definition.type.Position(2)
	private java.lang.Integer nihssScore;

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

    
    public org.jbpm.document.Document getIrmReport() {
        return this.irmReport;
    }
    
    public void setIrmReport(org.jbpm.document.Document irmReport) {
        this.irmReport = irmReport;
    }
    public Avc() {
	}

	public Avc(java.lang.String irmResult, java.lang.Integer glasgowScore,
			java.lang.Integer nihssScore, org.jbpm.document.Document irmReport) {
		this.irmResult = irmResult;
		this.glasgowScore = glasgowScore;
		this.nihssScore = nihssScore;
		this.irmReport = irmReport;
	}

}