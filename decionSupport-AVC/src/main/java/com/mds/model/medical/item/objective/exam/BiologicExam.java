package com.mds.model.medical.item.objective.exam;

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

@Namespace(MdsVocabulary.NS)
public class BiologicExam extends RdfBean<BiologicExam>  implements Serializable, Exam{

	/**
	 * 
	 */
	@Transient
	private static final long serialVersionUID = -4208127210386551988L;

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
	
	@RdfProperty(MdsVocabulary.hasMeasurementDataValue)
	private String stringValue;

	public BiologicExam(String id, MiType hasType, String hasLabel,
			Boolean isAnPrescription, Boolean isAnResult,
			String commentOfMedicalItem, Date endDateOfMedicalItem,
			Date startDateOfMedicalItem, Date hasEffectTime, Date hasTimeStamp,
			List<Amount> hasAmount, List<MedicalItem> hasMedicalObject,
			List<Entity> hasSource, CompositionOfMedicalItems isPartOf,
			URI hasContext, URI hasGeographicalLocation,
			String hasNomenclatureCode, String hasNomenclatueClass,
			String stringValue) {
		super();
		this.id = id;
		this.hasType = hasType;
		this.hasLabel = hasLabel;
		this.isAnPrescription = isAnPrescription;
		this.isAnResult = isAnResult;
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
		this.hasNomenclatueClass = hasNomenclatueClass;
		this.stringValue = stringValue;
	}

	public BiologicExam( String hasLabel,
			Boolean isAnPrescription, Boolean isAnResult,
			String commentOfMedicalItem, Date endDateOfMedicalItem,
			Date startDateOfMedicalItem, Date hasEffectTime, Date hasTimeStamp,
			List<Amount> hasAmount, List<MedicalItem> hasMedicalObject,
			List<Entity> hasSource, CompositionOfMedicalItems isPartOf,
			URI hasContext, URI hasGeographicalLocation,
			String hasNomenclatureCode, String hasNomenclatueClass,
			String stringValue) {
		super();				
		this.id = new UID().toString();				
		this.hasLabel = hasLabel;
		this.isAnPrescription = isAnPrescription;
		this.isAnResult = isAnResult;
		if(isAnPrescription)
			this.hasType = MiType.XBD;
		if(isAnResult)
			this.hasType = MiType.XBR;
		
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
		this.hasNomenclatueClass = hasNomenclatueClass;
		this.stringValue = stringValue;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public Boolean getIsAnPrescription() {
		if(hasType.equals("XBD")){
			return true;
		}else{
			if(hasType.equals("XBR")){
				return false;
			}else{				
				return isAnPrescription;
			}
				
		}
		
	}

	public void setIsAnPrescription(Boolean isAnPrescription) {
		if(isAnPrescription){
			this.hasType=MiType.XBD;
		}else{
			this.hasType = MiType.XBR;			
		}
		this.isAnPrescription = isAnPrescription;
	}

	public Boolean getIsAnResult() {
		return isAnResult;
	}

	public void setIsAnResult(Boolean isAnResult) {
		this.isAnResult = isAnResult;
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
		return stringValue;
	}

	public void setStringValue(String stringValue) {
		this.stringValue = stringValue;
	}
	
	
	
	
}
