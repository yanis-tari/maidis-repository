package com.mds.model.medical.item.objective.exam.simple.vital.signs;

import java.io.Serializable;
import java.net.URI;
import java.rmi.server.UID;
import java.util.Date;
import java.util.List;

import com.mds.gao.Generated;
import com.mds.gao.Id;
import com.mds.gao.Namespace;
import com.mds.gao.RdfProperty;
import com.mds.gao.Transient;
import com.mds.gao.binding.RdfBean;

import com.mds.model.Amount;
import com.mds.model.CompositionOfMedicalItems;
import com.mds.model.Entity;
import com.mds.model.MdsVocabulary;
import com.mds.model.MedicalItem;
import com.mds.model.medical.item.MiType;
import com.mds.model.medical.item.objective.exam.VitalSigns;

@Namespace(MdsVocabulary.NS)
public class BloodPressure extends RdfBean<BloodPressure> implements Serializable, VitalSigns {		
	/**
	 * 
	 */
	@Transient
	private static final long serialVersionUID = 5845076111528035311L;
	@Transient	
	public static final String SNOMED_ID_DIASTOLIC="http://snomed.info/id/271650006";
	@Transient
	public static final String SNOMED_ID_SYSTOLIC="http://snomed.info/id/271649006";
	@Transient
	public static final String SNOMED_ID="http://snomed.info/id/392570002";	
	@Transient
	public static final String MMHG = "mmHg";
	
	@Generated
	@Id
	private String id;
	
	@RdfProperty(MdsVocabulary.hasType)
	private MiType hasType;

	
	@RdfProperty(MdsVocabulary.hasLabel)
	private String hasLabel;
	
	@RdfProperty(MdsVocabulary.isAnPrescription)
	private Boolean isAnPrescription;
	
	@RdfProperty(MdsVocabulary.isAnResult)
	private Boolean isAnResult;
	
	@RdfProperty(MdsVocabulary.systolicBPvalue)
	private Double systolicBPvalue;	
	
	@RdfProperty(MdsVocabulary.diastolicBPvalue)
	private Double diastolicBPvalue;
	
	@RdfProperty(MdsVocabulary.hasVitalSignsUnit)
	private String unit;		
	
	@RdfProperty(MdsVocabulary.VitalSignDataValue)
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

	@Transient
	public static String SYSTOLIC = "systolic";
	@Transient
	public static String DIASTOLIC = "diastolic";
	
	
	
	public BloodPressure() {
		super();
		
		this.hasType = MiType.XS;
		this.hasLabel = "Blood Pressure";
		this.hasNomenclatureCode = SNOMED_ID;
		this.hasNomenclatueClass = "Snomed-CT";
		this.id = new UID().toString();
	}




	public BloodPressure(Double bpValue,String bpType, String unit) {
		super();
		this.hasType = MiType.XS;
		this.hasNomenclatureCode = SNOMED_ID;
		this.hasNomenclatueClass = "Snomed-CT";
				
		this.id = new UID().toString();
		if(bpType.equals(DIASTOLIC)){
			this.hasLabel = "Diastolic Blood Pressure";
			this.hasNomenclatureCode = SNOMED_ID_DIASTOLIC;
			this.hasNomenclatueClass = "Snomed-CT";
			this.diastolicBPvalue = bpValue;		
		}else{
			if(bpType.equals(SYSTOLIC)){
				this.hasLabel = "Systolic Blood Pressure";
				this.hasNomenclatureCode = SNOMED_ID_SYSTOLIC;
				this.hasNomenclatueClass = "Snomed-CT";
				this.systolicBPvalue = bpValue;
				
			}else{
				this.hasLabel = "Blood Pressure";
				this.hasNomenclatureCode = SNOMED_ID;
				this.hasNomenclatueClass = "Snomed-CT";		
				// bpValue ??????????????????????????????????????
			}			
		}
		this.unit = unit;
	}




	public BloodPressure(Double systolicBPvalue, Double diastolicBPvalue, String unit) {
		super();
		this.hasType = MiType.XS;
		this.hasLabel = "Blood Pressure";
		this.hasNomenclatureCode = SNOMED_ID;
		this.hasNomenclatueClass = "Snomed-CT";	
		this.id = new UID().toString();
		this.systolicBPvalue = systolicBPvalue;
		this.diastolicBPvalue = diastolicBPvalue;
		this.unit = unit;
	}





	public BloodPressure(String hasLabel, Double systolicBPvalue,
			Double diastolicBPvalue, String unit, String stringValue,
			String commentOfMedicalItem, Date endDateOfMedicalItem,
			Date startDateOfMedicalItem, Date hasEffectTime, Date hasTimeStamp,
			List<Amount> hasAmount,
			List<MedicalItem> hasMedicalObject,
			List<Entity> hasSource, CompositionOfMedicalItems isPartOf,
			URI hasContext, URI hasGeographicalLocation,
			String hasNomenclatureCode) {
		super();
		this.hasType = MiType.XS;
		this.hasLabel = "Blood Pressure";
		this.hasNomenclatureCode = SNOMED_ID;
		this.hasNomenclatueClass = "Snomed-CT";
		this.id = new UID().toString();
		this.hasLabel = hasLabel;
		this.systolicBPvalue = systolicBPvalue;
		this.diastolicBPvalue = diastolicBPvalue;
		this.unit = unit;
		this.stringValue = stringValue;
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
	
	
	
	

	public BloodPressure(Double systolicBPvalue, Double diastolicBPvalue,
			String unit, String commentOfMedicalItem,
			Date endDateOfMedicalItem, Date startDateOfMedicalItem) {
		super();
		this.hasType = MiType.XS;
		this.hasLabel = "Blood Pressure";
		this.hasNomenclatureCode = SNOMED_ID;
		this.hasNomenclatueClass = "Snomed-CT";
		this.id = new UID().toString();
		this.systolicBPvalue = systolicBPvalue;
		this.diastolicBPvalue = diastolicBPvalue;
		this.unit = unit;
		this.commentOfMedicalItem = commentOfMedicalItem;
		this.endDateOfMedicalItem = endDateOfMedicalItem;
		this.startDateOfMedicalItem = startDateOfMedicalItem;
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

	public Double getSystolicBPvalue() {
		return systolicBPvalue;
	}

	public void setSystolicBPvalue(Double systolicBPvalue) {
		this.systolicBPvalue = systolicBPvalue;
	}

	public Double getDiastolicBPvalue() {
		return diastolicBPvalue;
	}

	public void setDiastolicBPvalue(Double diastolicBPvalue) {
		this.diastolicBPvalue = diastolicBPvalue;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getStringValue() {
		if(stringValue!= null && !stringValue.equals("") ){
			return stringValue;
			
		}else{							
				return String.valueOf(systolicBPvalue)+"/"+String.valueOf(diastolicBPvalue);			
		}
	}

	public void setStringValue(String stringValue) {
		this.stringValue = stringValue;
	
		if(stringValue.contains("/")){
			String[] str =  stringValue.split("/");
			this.systolicBPvalue = Double.parseDouble(str[0]);
			this.diastolicBPvalue = Double.parseDouble(str[1]);
		}else{
			if(stringValue.contains("-")){
				String[] str =  stringValue.split("-");
				this.systolicBPvalue = Double.parseDouble(str[0]);
				this.diastolicBPvalue = Double.parseDouble(str[1]);				
			}		
		}				
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


	public String getId() {
		return id;
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
