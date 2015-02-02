package com.mds.model.medical.item;

public enum MiType {
	
	  ACP ("Prescribed Act"),

	  ACR ("Acte R�alis�"),

	  AL ("Allergie non m�dicamenteuse"),

	  AM ("Allergie m�dicamenteuse"),

	  MEP ("Prescribed Drug"),
	  
	  MEA ("Administration M�dicament"),
	  
	  PA ("Pathology"),

	  NO ("Note"),

	  TR ("Transmission"),

	  XBP ("Prescribed Exam"),

	  XBR ("Examen R�alis�"),

	  XS ("Simple Exam"),

	  AC ("Act"),

	  ME ("Drug"),

	  MO ("Motif"),

	  SY ("Symptom"),

	  XB ("Biologic exam"),

	  XR ("Radiological exam"),

	  XA ("Other exam"),
	  
	  XAD ("Prescription of other exam"),

	  XBD ("Prescription of biologic exam"),

	  XRD ("Prescription of radiologic exam"),

	  XSD ("Prescription of monitoring exam"),

	  ET ("State"),

	  RI ("Risk"),

	  XAR ("Other Exam Result"),

	  XRR ("Radiological Exam Result"),

	  DI ("Disposable"),

	  NAC ("Nurse acts"),

	  VAD ("Prescription of Vaccine"),

	  VAR ("Vaccine");	  

//	  CHI   
//	  EVT  
	  private final String val;
	  
	  MiType(String val){
		  this.val = val;		  
	  }
	  
	  public String toString(){
		    return val;
		  }

	}
