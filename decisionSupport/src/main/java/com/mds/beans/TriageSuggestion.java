package com.mds.beans;

/**
 * This class was automatically generated by the data modeler tool.
 */

@org.kie.api.definition.type.Label("Triage suggestion")
public class TriageSuggestion implements java.io.Serializable {

    static final long serialVersionUID = 1L;

    @org.kie.api.definition.type.Label("Description")
	@org.kie.api.definition.type.Position(1)
	private java.lang.String description;

    @org.kie.api.definition.type.Label("Suggestion clinical pathway")
	@org.kie.api.definition.type.Position(2)
	private java.lang.String suggestionClinicalPathway;

    @org.kie.api.definition.type.Label("Suggestion clinical pathway ID")
	@org.kie.api.definition.type.Position(3)
	private java.lang.String suggestionClinicalPathwayID;

    @org.kie.api.definition.type.Label("Value")
	@org.kie.api.definition.type.Position(0)
	private java.lang.String value;

    @org.kie.api.definition.type.Label("start the pathway")
	@org.kie.api.definition.type.Position(4)
	private java.lang.Boolean startThePathway = false;

	@org.kie.api.definition.type.Label(value = "Action")
	@org.kie.api.definition.type.Position(value = 5)
	private java.lang.String action;
	
	@org.kie.api.definition.type.Label(value = "Department")
	@org.kie.api.definition.type.Position(value = 6)
	private java.lang.String department;

	@org.kie.api.definition.type.Label(value = "rule")
	@org.kie.api.definition.type.Position(value = 7)
	private java.lang.String rule;

	
	public java.lang.String getRule() {
		return rule;
	}

	public void setRule(java.lang.String rule) {
		this.rule = rule;
	}

	public java.lang.String getDepartment() {
		return department;
	}

	public void setDepartment(java.lang.String department) {
		this.department = department;
	}

	public java.lang.String getDescription() {
        return this.description;
    }
    
    public void setDescription(java.lang.String description) {
        this.description = description;
    }

    public java.lang.String getSuggestionClinicalPathway() {
        return this.suggestionClinicalPathway;
    }
    
    public void setSuggestionClinicalPathway(java.lang.String suggestionClinicalPathway) {
        this.suggestionClinicalPathway = suggestionClinicalPathway;
    }

    public java.lang.String getSuggestionClinicalPathwayID() {
        return this.suggestionClinicalPathwayID;
    }
    
    public void setSuggestionClinicalPathwayID(java.lang.String suggestionClinicalPathwayID) {
        this.suggestionClinicalPathwayID = suggestionClinicalPathwayID;
    }

    public java.lang.String getValue() {
        return this.value;
    }
    
    public void setValue(java.lang.String value) {
        this.value = value;
        initDescriptionAndAction();
    }

	public java.lang.Boolean getStartThePathway() {
		return this.startThePathway;
	}

	public void setStartThePathway(java.lang.Boolean startThePathway) {
		this.startThePathway = startThePathway;
	}

	public java.lang.String getAction() {
		return this.action;
	}

	public void setAction(java.lang.String action) {
		this.action = action;
	}

	public TriageSuggestion() {
	}

	public TriageSuggestion(java.lang.String value,
			java.lang.String description, java.lang.String action,java.lang.String department, java.lang.String rule,
			java.lang.String suggestionClinicalPathway,
			java.lang.String suggestionClinicalPathwayID,
			java.lang.Boolean startThePathway) {
		this.value = value;
		this.description = description;
		this.suggestionClinicalPathway = suggestionClinicalPathway;
		this.suggestionClinicalPathwayID = suggestionClinicalPathwayID;
		this.startThePathway = startThePathway;
		this.action = action;
		this.department = department;
		this.rule = rule;
	}
	public TriageSuggestion(java.lang.String value,
			java.lang.String suggestionClinicalPathway,
			java.lang.String suggestionClinicalPathwayID) {
		this.value = value;
		this.suggestionClinicalPathway = suggestionClinicalPathway;
		this.suggestionClinicalPathwayID = suggestionClinicalPathwayID;
		initDescriptionAndAction();
	}
	
	private void initDescriptionAndAction(){
		 if(value != null)
	        {
	        	if(value.equals("1"))
	        	{
	        		description="Immediately life-threatening";
	        		action="Actions focused on support of one or more vital functions Immediate medical and paramedical intervention ";
	        	}	
	        	if(value.equals("2"))
	        	{	
	        		description="Marked impairment of a vital organ or imminently life-threatening or functionally disabling traumatic lesion";
	        		action="Actions focused on treatment of the vital function or traumatic lesion Immediate paramedical and medical intervention within 20 min";
	        	}
	        	if(value.equals("3"))
	        	{	
	        		description="Functional impairment or organic lesions likely to deteriorate within 24h or complex medical situation justifying the use of several hospital resources";
	        		action="Multiple actions focused on diagnostic evaluation and prognostic evaluation in addition to treatment. Medical intervention within 60 min ± followed by paramedical intervention";
	        	}	
	        	if(value.equals("4"))
	        	{	
	        		description="Stable, noncomplex functional impairment or organic lesions, but justifying the urgent use of at least one hospital resource";
	        		action="Consultation with limited diagnostic and/or therapeutic procedures Medical intervention within 120 min ± followed by paramedical intervention";
	        	}	
	        	if(value.equals("5"))
	        	{	
	        		description="No functional impairment or organic lesion justifying the use of hospital resources";
	        		action="Consultation with no diagnostic or therapeutic procedure Medical intervention within 240 min";
	        	}	
	        	
	        	if(value.contains("-"))
	        	{	
	        		String[] values = value.split("-");
	        		try { 
		       	      Integer max = Integer.parseInt(values[0]);
		       	      Integer min =  Integer.parseInt(values[1]);
		       	      
		       	      description="";
		       	      action="leaves the choice of triage level ( "+max+" or "+min+") to the nurse";
		       	    } catch(NumberFormatException e) { 
			       	      description="";
			       	      action="leaves the choice of triage level to the nurse";	       	        
		       	    }
	        		
	        	}	
	        }
	}

	@Override
	public String toString() {
		return "TriageSuggestion [description=" + description
				+ ", suggestionClinicalPathway=" + suggestionClinicalPathway
				+ ", suggestionClinicalPathwayID="
				+ suggestionClinicalPathwayID + ", value=" + value
				+ ", startThePathway=" + startThePathway + ", action=" + action
				+ ", department=" + department + ", rule=" + rule + "]";
	}
	
	
	

}