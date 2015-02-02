package com.mds.model;

import java.net.URI;
import java.util.List;
import java.util.Date;

import com.mds.model.medical.item.MiType;
import com.mds.gao.Namespace;



@Namespace(MdsVocabulary.NS)
public interface MedicalItem extends java.io.Serializable{
	
	public String getId();
	
	public MiType getHasType();
	
	public void setHasType(MiType type);
	
	public String getHasLabel();
	
	public void setHasLabel(String label);
	
	public String getHasNomenclatureCode();
	
	public void setHasNomenclatureCode(String nomenclatureCode);
	
	public String getHasNomenclatueClass();
	
	public void setHasNomenclatueClass(String nomenclatureClass);
	
	public URI getHasGeographicalLocation();
	
	public void setHasGeographicalLocation(URI uri);
	
	public URI getHasContext();
	
	public void setHasContext(URI uri);
		
	public String getCommentOfMedicalItem();

	public void setCommentOfMedicalItem(String commentOfMedicalItem) ;
	
	public Date getEndDateOfMedicalItem() ;
	
	public void setEndDateOfMedicalItem(Date endDateOfMedicalItem);

	public Date getStartDateOfMedicalItem();

	public void setStartDateOfMedicalItem(Date startDateOfMedicalItem) ;

	public Date getHasEffectTime();

	public void setHasEffectTime(Date hasEffectTime);

	public Date getHasTimeStamp();

	public void setHasTimeStamp(Date hasTimeStamp);
	
	public List<Amount> getHasAmount();

	public void setHasAmount(List<Amount> hasAmount);

	public List<MedicalItem> getHasMedicalObject();

	public void setHasMedicalObject(List<MedicalItem> hasMedicalObject);

	public List<Entity> getHasSource() ;

	public void setHasSource(List<Entity> hasSource) ;

	public CompositionOfMedicalItems getIsPartOf();

	public void setIsPartOf(CompositionOfMedicalItems isPartOf) ;

	public Object save();
	
	
	
}
