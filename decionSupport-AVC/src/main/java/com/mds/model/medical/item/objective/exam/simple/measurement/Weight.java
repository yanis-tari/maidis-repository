package com.mds.model.medical.item.objective.exam.simple.measurement;

import java.io.Serializable;
import java.net.URI;
import java.rmi.server.UID;
import java.util.List;
import java.util.Date;

import com.mds.model.Amount;
import com.mds.model.CompositionOfMedicalItems;
import com.mds.model.Entity;
import com.mds.model.MdsVocabulary;
import com.mds.model.MedicalItem;
import com.mds.model.medical.item.MiType;
import com.mds.model.medical.item.objective.exam.Measurement;

import com.mds.gao.Generated;
import com.mds.gao.Id;
import com.mds.gao.Namespace;
import com.mds.gao.RdfProperty;
import com.mds.gao.Transient;
import com.mds.gao.binding.RdfBean;


@Namespace(MdsVocabulary.NS)
public class Weight extends RdfBean<Height> implements Serializable, Measurement {
	

	/**
	 * 
	 */
	@Transient
	private static final long serialVersionUID = 8016675862189872272L;	
	
	public static final String KG = "kg";
	
	@Generated
	@Id
	private String id;
	
	@RdfProperty(MdsVocabulary.hasType)
	private MiType hasType;

	@RdfProperty(MdsVocabulary.isAnPrescription)
	private Boolean isAnPrescription;
	
	@RdfProperty(MdsVocabulary.isAnResult)
	private Boolean isAnResult;
	
	
	@RdfProperty(MdsVocabulary.hasLabel)
	private String hasLabel;
	
	@RdfProperty(MdsVocabulary.weightValue)
	private Double value;	
	
	@RdfProperty(MdsVocabulary.hasMeasurementUnit)
	private String unit;		
	
	@RdfProperty(MdsVocabulary.hasMeasurementDataValue)
	private String stringValue;
		
	@RdfProperty(MdsVocabulary.commentOfMedicalItem)
	protected String commentOfMedicalItem;
	
	@RdfProperty(MdsVocabulary.endDateOfMedicalItem)
	protected Date endDateOfMedicalItem;

	@RdfProperty(MdsVocabulary.startDateOfMedicalItem)
	protected Date startDateOfMedicalItem;
	
	@RdfProperty(MdsVocabulary.hasEffectTime)
	protected Date hasEffectTime;
	
	@RdfProperty(MdsVocabulary.hasTimeStamp)
	protected Date hasTimeStamp;
	
	@RdfProperty(MdsVocabulary.hasAmount)
	protected List<Amount> hasAmount;
	
	@RdfProperty(MdsVocabulary.hasMedicalObject)
	protected List<MedicalItem> hasMedicalObject;
	
	@RdfProperty(MdsVocabulary.hasSource)
	protected List<Entity> hasSource;
	
	@RdfProperty(MdsVocabulary.isPartOf)
	protected CompositionOfMedicalItems isPartOf;

	@RdfProperty(MdsVocabulary.hasContext)
	private URI hasContext;
	
	@RdfProperty(MdsVocabulary.hasGeographicalLocation)
	private URI hasGeographicalLocation;
	
	@RdfProperty(MdsVocabulary.hasNomenclatureCode)
	private String hasNomenclatureCode;
	
	@RdfProperty(MdsVocabulary.hasNomenclatueClass)
	private String hasNomenclatueClass;
	
	public Weight(){
		this.hasType = MiType.XS;
		this.hasLabel = "Weight";		
		this.id = new UID().toString();		
	}
	
	
	
	public Weight(Double value, String unit) {
		super();
		this.hasType = MiType.XS;
		this.hasLabel = "Weight";		
		this.id = new UID().toString();
		this.value = value;
		this.unit = unit;
	}



	public Weight(Double value, String unit, Date endDateOfMedicalItem,
			Date startDateOfMedicalItem, Date hasEffectTime, Date hasTimeStamp) {
		super();
		this.hasType = MiType.XS;
		this.id = new UID().toString();
		this.hasLabel = "Weight";
		this.value = value;
		this.unit = unit;
		this.endDateOfMedicalItem = endDateOfMedicalItem;
		this.startDateOfMedicalItem = startDateOfMedicalItem;
		this.hasEffectTime = hasEffectTime;
		this.hasTimeStamp = hasTimeStamp;
	}

	public Weight(Double value, String unit, 
			String commentOfMedicalItem, Date endDateOfMedicalItem,
			Date startDateOfMedicalItem, Date hasEffectTime, Date hasTimeStamp,
			List<Amount> hasAmount,
			List<MedicalItem> hasMedicalObject,
			List<Entity> hasSource, CompositionOfMedicalItems isPartOf,
			URI hasContext, URI hasGeographicalLocation,
			String hasNomenclatureCode) {
		super();
		this.hasType = MiType.XS;
		this.hasLabel = "Weight";
		this.value = value;
		this.unit = unit;
		this.id = new UID().toString();
		this.commentOfMedicalItem = commentOfMedicalItem;
		this.endDateOfMedicalItem = endDateOfMedicalItem;
		this.startDateOfMedicalItem = startDateOfMedicalItem;
		this.hasEffectTime = hasEffectTime;
		this.hasTimeStamp = hasTimeStamp;
		this.hasAmount = hasAmount;
		this.hasMedicalObject = hasMedicalObject;
		this.hasSource = hasSource;
		this.isPartOf = isPartOf;
		this.hasContext = hasContext;
		this.hasGeographicalLocation = hasGeographicalLocation;
		this.hasNomenclatureCode = hasNomenclatureCode;
	}
	
	
	
	public MiType getHasType() {
		return hasType;
	}



	public void setHasType(MiType hasType) {
		this.hasType = hasType;
	}



	public String getHasLabel() {
		return hasLabel;
	}



	public void setHasLabel(String hasLabel) {
		this.hasLabel = hasLabel;
	}



	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCommentOfMedicalItem() {
		return commentOfMedicalItem;
	}

	public void setCommentOfMedicalItem(String commentOfMedicalItem) {
		this.commentOfMedicalItem = commentOfMedicalItem;
	}

	public Date getEndDateOfMedicalItem() {
		return endDateOfMedicalItem;
	}

	public void setEndDateOfMedicalItem(Date endDateOfMedicalItem) {
		this.endDateOfMedicalItem = endDateOfMedicalItem;
	}

	public Date getStartDateOfMedicalItem() {
		return startDateOfMedicalItem;
	}

	public void setStartDateOfMedicalItem(Date startDateOfMedicalItem) {
		this.startDateOfMedicalItem = startDateOfMedicalItem;
	}

	public Date getHasEffectTime() {
		return hasEffectTime;
	}

	public void setHasEffectTime(Date hasEffectTime) {
		this.hasEffectTime = hasEffectTime;
	}

	public Date getHasTimeStamp() {
		return hasTimeStamp;
	}

	public void setHasTimeStamp(Date hasTimeStamp) {
		this.hasTimeStamp = hasTimeStamp;
	}

	public List<Amount> getHasAmount() {
		return hasAmount;
	}

	public void setHasAmount(List<Amount> hasAmount) {
		this.hasAmount = hasAmount;
	}

	public List<MedicalItem> getHasMedicalObject() {
		return hasMedicalObject;
	}

	public void setHasMedicalObject(List<MedicalItem> hasMedicalObject) {
		this.hasMedicalObject = hasMedicalObject;
	}

	public List<Entity> getHasSource() {
		return hasSource;
	}

	public void setHasSource(List<Entity> hasSource) {
		this.hasSource = hasSource;
	}

	public CompositionOfMedicalItems getIsPartOf() {
		return isPartOf;
	}

	public void setIsPartOf(CompositionOfMedicalItems isPartOf) {
		this.isPartOf = isPartOf;
	}

	public URI getHasContext() {
		return hasContext;
	}

	public void setHasContext(URI hasContext) {
		this.hasContext = hasContext;
	}

	public URI getHasGeographicalLocation() {
		return hasGeographicalLocation;
	}

	public void setHasGeographicalLocation(URI hasGeographicalLocation) {
		this.hasGeographicalLocation = hasGeographicalLocation;
	}

	public String getHasNomenclatureCode() {
		return hasNomenclatureCode;
	}

	public void setHasNomenclatureCode(String hasNomenclatureCode) {
		this.hasNomenclatureCode = hasNomenclatureCode;
	}



	public String getHasNomenclatueClass() {
		return hasNomenclatueClass;
	}



	public void setHasNomenclatueClass(String hasNomenclatueClass) {
		this.hasNomenclatueClass = hasNomenclatueClass;
	}



	
	public String getStringValue() {
		if(stringValue!=null && !stringValue.equals("")){
			return stringValue;
		}else{
			return String.valueOf(value); 
		}
	}



	
	public void setStringValue(String value) {
		  try { 
		       this.value =  Double.parseDouble(value);
		       this.stringValue = value;
		    } catch(NumberFormatException e) {
		    	System.out.println("error when initialise Height value, the value is not a number !!");
		        this.value = 0.0;
		        this.stringValue = value;
		    }
				
	}



	public Boolean getIsAnPrescription() {
		return isAnPrescription;
	}



	public void setIsAnPrescription(Boolean isAnPrescription) {
		this.isAnPrescription = isAnPrescription;
	}



	public Boolean getIsAnResult() {
		return isAnResult;
	}



	public void setIsAnResult(Boolean isAnResult) {
		this.isAnResult = isAnResult;
	}


}
