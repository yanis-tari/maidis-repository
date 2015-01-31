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

    @org.kie.api.definition.type.Label(value = "start the pathway")
	@org.kie.api.definition.type.Position(value = 4)
	private java.lang.Boolean startThePathway;

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
    }

	public java.lang.Boolean getStartThePathway() {
		return this.startThePathway;
	}

	public void setStartThePathway(java.lang.Boolean startThePathway) {
		this.startThePathway = startThePathway;
	}

	public TriageSuggestion() {
	}

	public TriageSuggestion(java.lang.String value,
			java.lang.String description,
			java.lang.String suggestionClinicalPathway,
			java.lang.String suggestionClinicalPathwayID,
			java.lang.Boolean startThePathway) {
		this.value = value;
		this.description = description;
		this.suggestionClinicalPathway = suggestionClinicalPathway;
		this.suggestionClinicalPathwayID = suggestionClinicalPathwayID;
		this.startThePathway = startThePathway;
	}
	
	public TriageSuggestion(java.lang.String value,
			java.lang.String description,
			java.lang.String suggestionClinicalPathway,
			java.lang.String suggestionClinicalPathwayID) {
		this.value = value;
		this.description = description;
		this.suggestionClinicalPathway = suggestionClinicalPathway;
		this.suggestionClinicalPathwayID = suggestionClinicalPathwayID;
		this.startThePathway = false;
	}

}