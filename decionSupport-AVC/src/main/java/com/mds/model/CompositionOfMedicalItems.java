package com.mds.model;

import java.util.List;

import com.mds.gao.Generated;
import com.mds.gao.Id;
import com.mds.gao.Namespace;
import com.mds.gao.Transient;
import com.mds.gao.binding.RdfBean;



@Namespace(MdsVocabulary.NS)
public class CompositionOfMedicalItems extends RdfBean<CompositionOfMedicalItems> implements java.io.Serializable{

	@Transient	private static final long serialVersionUID = 1;
	@Generated	@Id	private long id;	
	private List<MedicalItem> hasMedicalItemsRegrouped;

	
	
	public CompositionOfMedicalItems() {
		super();
	}

		
	public CompositionOfMedicalItems(
			List<MedicalItem> hasMedicalItemsRegrouped) {
		super();		
		this.hasMedicalItemsRegrouped = hasMedicalItemsRegrouped;
	}
	

	public long getId() {
		return id;
	}
	
	
	public void setId(long id) {
		this.id = id;
	}


	public List<MedicalItem> getHasMedicalItemsRegrouped() {
		return hasMedicalItemsRegrouped;
	}

	public void setHasMedicalItemsRegrouped(
			List<MedicalItem> hasMedicalItemsRegrouped) {
		this.hasMedicalItemsRegrouped = hasMedicalItemsRegrouped;
	}

}
