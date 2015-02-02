package com.mds.factory;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.maidis.mdskernel.MdsDate;
import com.maidis.mdskernel.MdsLog;

import com.maidis.mdsproxys.MdsDataServer;
import com.maidis.mdsproxys.MdsPassCryptDecrypt;

import com.maidis.mdsrpc.Connection;
import com.maidis.mdsrpc.RpcInt;

import com.maidis.mdslib.DBV_COCorresp;
import com.maidis.mdslib.DBV_PAContact;
import com.maidis.mdslib.DBV_PAMI;
import com.maidis.mdslib.DBV_PAMIAttr;
import com.maidis.mdslib.DBV_PAPatient;
import com.maidis.mdslib.DBV_SEProfil;
import com.maidis.mdslib.DBV_SEUser;
import com.maidis.mdslib.MdsClientSession;
import com.maidis.mdslib.MdsRemoteSql;


import com.mds.model.Contact;
import com.mds.model.MedicalItem;
import com.mds.model.Patient;
import com.mds.model.User;
import com.mds.model.medical.item.MiCategory;
import com.mds.model.medical.item.MiType;
import com.mds.model.medical.item.Subjective;
import com.mds.model.medical.item.objective.exam.simple.measurement.Height;
import com.mds.model.medical.item.objective.exam.simple.measurement.Weight;
import com.mds.model.medical.item.objective.exam.simple.vital.signs.BloodOxygenSaturation;
import com.mds.model.medical.item.objective.exam.simple.vital.signs.BloodPressure;
import com.mds.model.medical.item.objective.exam.simple.vital.signs.Pulse;
import com.mds.model.medical.item.objective.exam.simple.vital.signs.RespiratoryRate;
import com.mds.model.medical.item.objective.exam.simple.vital.signs.Temperature;


public class MdsDbToOntologyFactory {
	private static MdsDbToOntologyFactory instance;
	private  MdsRemoteSql sql;	
	private MdsDbToOntologyFactory(String login,String pwd){
		
		String mdsDataServerHost = "smdspatst110";
		int mdsDataserverPort = 5234;
		
		if(System.getProperty("mds.data.server.host") != null)
			mdsDataServerHost = System.getProperty("mds.data.server.host");
		
		if(System.getProperty("mds.data.server.port") != null)
			mdsDataserverPort = Integer.parseInt(System.getProperty("mds.data.server.port"));
			
		try {
			MdsLog.Initialize("Banner Java To MdsDataServer", "MaidinaCynara.log", MdsLog.Level.LVL_API);
		} catch (Exception e1) {
			e1.printStackTrace();
			System.exit(100);
		}

		Connection rpc = new Connection(mdsDataServerHost,mdsDataserverPort);
		RpcInt user_id = new RpcInt();
		MdsDataServer.RefConnectStatus status = new MdsDataServer.RefConnectStatus();
		
		try {
			@SuppressWarnings("unused")
			String ticket =MdsDataServer.Connect(rpc, login, MdsPassCryptDecrypt.MdsPassCrypt(pwd), user_id, status);
		} catch (Exception e) {
			System.err.println("Error when try to get MDS ticket !!!!");
			e.printStackTrace();
		}                              
		MdsClientSession sess = new MdsClientSession(rpc);              
		RpcInt r_userid = new RpcInt();
		try {
			sess.Connect(login,  pwd, r_userid, status);
			
			 this.sql = new MdsRemoteSql(sess);
		} catch (Exception e) {
			System.err.println("Error when try to connect to mdsClientSession !!!");
			e.printStackTrace();
		}
	}

	public static MdsDbToOntologyFactory getInstance(String login,String pwd){
		if(instance == null){		
			instance = new MdsDbToOntologyFactory(login, pwd);				
		}	
			return instance;				
	}
	
	
	public static Contact selectContact(long contact_id) throws Exception{
		Contact contact=null;
						String query = " SELECT  "
										+DBV_PAContact.f_Contact_Id+" , "
										+DBV_PAContact.f_BeginDateTime+" , "
										+DBV_PAContact.f_ContactType+" , "
										+DBV_PAContact.f_ContactPlace+" , "
										+DBV_PAContact.f_Remark+" , "
										+DBV_PAContact.f_ContactReason+" , "
										+DBV_PAContact.f_Patient_Id+" , "
										+DBV_PAPatient.f_PatientInsurance_Id+" , "
										+DBV_PAPatient.f_PIN+" , "
										+DBV_PAPatient.f_FirstName+" , "
										+DBV_PAPatient.f_LastName+" , "
										+DBV_PAPatient.f_BirthDate+" , "
										+DBV_PAPatient.f_Gender+" , "
										+DBV_SEUser.f_User_Id+" , "
										+DBV_SEUser.f_UserName+" , "
										+DBV_SEUser.f_UserPassword+" , "
										+DBV_SEProfil.f_Profil_Id+" , "
										+DBV_SEProfil.f_ProfilName+" , "
										+DBV_SEProfil.f_Description+" , "
										+DBV_COCorresp.f_Civility+" , "
										+DBV_COCorresp.f_Name+" , "
										+DBV_COCorresp.f_FirstName+" , "
										+DBV_COCorresp.f_Title
				        + "	FROM "+DBV_PAContact.TABLE +" , "+DBV_PAPatient.TABLE+" , "+DBV_SEUser.TABLE +" , "+DBV_COCorresp.TABLE+" , "+DBV_SEProfil.TABLE+" "						
						+ "	WHERE Contact_Id = "+contact_id+" AND "
						+ ""+DBV_PAContact.f_Patient_Id+" = "+DBV_PAPatient.f_Patient_Id+" AND "
						+ ""+DBV_PAContact.f_User_Id+" = "+DBV_SEUser.f_User_Id+" AND "
						+ ""+DBV_SEUser.f_Corresp_Id+" = "+DBV_COCorresp.f_Corresp_Id+" AND "
						+ ""+DBV_SEProfil.f_Profil_Id+" = "+DBV_SEUser.f_Profil_Id+ "; " ;
						
		instance.sql.StartSelect(query);			
		while(instance.sql.FetchNextRow())
		{
			int col = 0;
			//Create Contact Object ...
			contact = new Contact();
			contact.setContactId(instance.sql.GetIntValue(col)); col++;
			try {					    
			    SimpleDateFormat dmyFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ");
			    String dmy = dmyFormat.format(instance.sql.GetDateTimeValue(col).getDate());
			    System.out.println("date : "+dmy);			    
			    contact.setStartDateOfContact(dmyFormat.parse(dmy)); col++;
			} catch (ParseException exp) {
			    col++;
			}

			contact.setContactType(instance.sql.GetStringValue(col));col++;
			contact.setContactPlace(instance.sql.GetStringValue(col));col++;
			contact.setCommentOfContact(instance.sql.GetStringValue(col));col++;
			contact.setContactReason(instance.sql.GetStringValue(col));col++;
			
			//Create Patient Object ...
			Patient patient = new Patient();
			patient.setPatient_id(String.valueOf(instance.sql.GetIntValue(col))); col++;
			patient.setPatientInsurance_id(instance.sql.GetIntValue(col));col++;
			patient.setPin(instance.sql.GetStringValue(col));col++;
			patient.setFirstName(instance.sql.GetStringValue(col));col++;
			patient.setLastName(instance.sql.GetStringValue(col));col++;
			try {					    
			    SimpleDateFormat dmyFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ");
			    String dmy = dmyFormat.format(instance.sql.GetDateTimeValue(col).getDate());
			    System.out.println("date : "+dmy);			    
			    patient.setBirthDate(dmyFormat.parse(dmy)); col++;
			} catch (ParseException exp) {
			    col++;
			}
			patient.setGender(instance.sql.GetIntValue(col));col++;
			
			//Create User Object ...
			User user = new User();
			user.setUserId(instance.sql.GetIntValue(col));col++;
			user.setUserName(instance.sql.GetStringValue(col));col++;
			user.setUserPasseword(instance.sql.GetStringValue(col));col++;
			user.setProfilId(instance.sql.GetIntValue(col));	col++;
			user.setProfilName(instance.sql.GetStringValue(col));col++;
			user.setProfilDescription(instance.sql.GetStringValue(col));col++;
			user.setCivility(instance.sql.GetStringValue(col));col++;
			user.setLastName(instance.sql.GetStringValue(col));col++;			
			user.setFirstName(instance.sql.GetStringValue(col));col++;
			user.setTitle(instance.sql.GetStringValue(col));col++;									
		
			
			contact.setPatientConcerned(patient);
			contact.setHealthcarePersonneConcerned(user);			
		}
		instance.sql.EndSelect();			
		return contact;
	}
	
	@SuppressWarnings("unused")
	public static List<MedicalItem> selectMedicalItemsOfContact(long contact_id) throws Exception{
		List<MedicalItem> miList =new ArrayList<MedicalItem>(); 
		Map<String, Integer> collom = new HashMap<String, Integer>();
		collom.put(DBV_PAMI.f_MI_Id,0 ); collom.put(DBV_PAMIAttr.f_MIAttr_Id,1 );		collom.put(DBV_PAMI.f_MICategory,2 );		collom.put(DBV_PAMI.f_MIText, 3);		collom.put(DBV_PAMI.f_MIType, 4);		collom.put(DBV_PAMI.f_MIEndDate,5 );		collom.put(DBV_PAMI.f_MIDate, 6);		collom.put(DBV_PAMI.f_MIClass,7 );		collom.put(DBV_PAMI.f_MICode, 8);		collom.put(DBV_PAMIAttr.f_MIAttrName,9 ); 	collom.put(DBV_PAMIAttr.f_ValueType,10 );		collom.put(DBV_PAMIAttr.f_StringValue,11 );		collom.put(DBV_PAMIAttr.f_NumValue, 12);		collom.put(DBV_PAMIAttr.f_MeasureUnit,13 );		collom.put(DBV_PAMIAttr.f_UpperValue, 14);		collom.put(DBV_PAMIAttr.f_LowerValue, 15);		collom.put(DBV_PAMIAttr.f_VStartDate, 16);				
		
		String query = "SELECT   "
						+ DBV_PAMI.f_MI_Id+", "
						+ DBV_PAMIAttr.f_MIAttr_Id+" ,"
						+ DBV_PAMI.f_MICategory+" , "
						+ DBV_PAMI.f_MIText +" , "
						+ DBV_PAMI.f_MIType +" , "
						+ DBV_PAMI.f_MIEndDate +" , "
						+ DBV_PAMI.f_MIDate +" , "
						+ DBV_PAMI.f_MIClass +" , "
						+ DBV_PAMI.f_MICode +" , "
						+ DBV_PAMIAttr.f_MIAttrName +" , "
						+ DBV_PAMIAttr.f_ValueType +" , "
						+ DBV_PAMIAttr.f_StringValue +" , "
						+ DBV_PAMIAttr.f_NumValue +" , "
						+ DBV_PAMIAttr.f_MeasureUnit +" , "
						+ DBV_PAMIAttr.f_UpperValue +" , "
						+ DBV_PAMIAttr.f_LowerValue +" , "
						+ DBV_PAMIAttr.f_VStartDate +"  "//17						
						+ "FROM "+DBV_PAMI.TABLE+" , "+DBV_PAMIAttr.TABLE+" "
						+ "WHERE "+DBV_PAMI.f_Contact_Id+"="+contact_id+" AND "+DBV_PAMI.f_MI_Id+" = "+DBV_PAMIAttr.f_MI_Id+" "
						+ "ORDER BY "+DBV_PAMI.f_MI_Id+" , "+DBV_PAMIAttr.f_MIAttr_Id+" ; " ;						
		
		instance.sql.StartSelect(query);
		
		int mi_id=0, miattr_id=0;
		MedicalItem mi = null ;		
		while(instance.sql.FetchNextRow())
		{
			int col = 0;
			
			if(mi_id == instance.sql.GetIntValue(0)){
		//		System.out.println(miattr_id+" "+mi);
					/* ########################  MIATTR  (amount)  ##################"  */			
			}else{

				
				mi_id =  instance.sql.GetIntValue(0);
			    miattr_id = instance.sql.GetIntValue(1);
				String category = instance.sql.GetStringValue(2);
				MiCategory miCategory = MiCategory.valueOf(category);
				String miText = instance.sql.GetStringValue(3);
				String miType = instance.sql.GetStringValue(4);
				MiType typeMi = MiType.valueOf(miType);
				MdsDate miEndDate = instance.sql.GetDateValue(5);
				MdsDate date = instance.sql.GetDateTimeValue(6);
				String miClass = instance.sql.GetStringValue(7);
				String miCode = instance.sql.GetStringValue(8);
				String attrName = instance.sql.GetStringValue(9);
				String valueType = instance.sql.GetStringValue(10);
				String stringValue = instance.sql.GetStringValue(11);
				double numValue = instance.sql.GetFloatValue(12);
				String measureUnit = instance.sql.GetStringValue(13);
				double upperValue = instance.sql.GetFloatValue(14);
				double lowerValue = instance.sql.GetFloatValue(15);		
/*				
				switch(miCategory){
					case M: 
						mi = new Subjective();
						System.out.println(miCategory);
					break;
					case S :
						mi = new Subjective();
						System.out.println(miCategory);
					break;
					case O :
						mi = new Subjective();
						System.out.println(miCategory);

							switch(typeMi){
							case ACP : 
//								ACP   Prescribed Act
								System.out.println("ACP "+miText+" ::"+attrName+"::"+valueType+" :: "+stringValue+"::"+numValue+"::"+measureUnit+"|");
							break;	

							case ACR : 
//								ACR   Acte R�alis�
								System.out.println("ACR"+miText+" ::"+attrName+"::"+valueType+" :: "+stringValue+"::"+numValue+"::"+measureUnit+"|");
							break;	
							
							case AL : 
//								AL   Allergie non m�dicamenteuse
								System.out.println("AL"+miText+" ::"+attrName+"::"+valueType+" :: "+stringValue+"::"+numValue+"::"+measureUnit+"|");
							break;	
							
							case AM : 
//								AM   Allergie m�dicamenteuse
								System.out.println("AM"+miText+" ::"+attrName+"::"+valueType+" :: "+stringValue+"::"+numValue+"::"+measureUnit+"|");
							break;	
							
							case MEP : 
//								MEP   Prescribed Drug
								System.out.println("MEP"+miText+" ::"+attrName+"::"+valueType+" :: "+stringValue+"::"+numValue+"::"+measureUnit+"|");
							break;	
							
							case MEA : 
//								MEA   Administration M�dicament
								System.out.println("MEA"+miText+" ::"+attrName+"::"+valueType+" :: "+stringValue+"::"+numValue+"::"+measureUnit+"|");
							break;	
							
							case PA : 
//								PA   Pathology
								System.out.println("PA "+miText+" ::"+attrName+"::"+valueType+" :: "+stringValue+"::"+numValue+"::"+measureUnit+"|" );
							break;	
							
							case NO : 
//								NO   Note
								System.out.println("NO"+miText+" ::"+attrName+"::"+valueType+" :: "+stringValue+"::"+numValue+"::"+measureUnit+"|");
							break;	
							
							case TR : 
//								TR   Transmission
								System.out.println("TR"+miText+" ::"+attrName+"::"+valueType+" :: "+stringValue+"::"+numValue+"::"+measureUnit+"|");
							break;	
							
							case XBP : 
//								XBP   Prescribed Exam
								System.out.println("XBP"+miText+" ::"+attrName+"::"+valueType+" :: "+stringValue+"::"+numValue+"::"+measureUnit+"|");
							break;	
							
							case XBR : 
//								XBR   Examen R�alis�
								System.out.println("XBR"+miText+" ::"+attrName+"::"+valueType+" :: "+stringValue+"::"+numValue+"::"+measureUnit+"|");
							break;	
							
							case XS : 
//								XS   Simple Exam
								//System.out.println("XS"+miText+" ::"+attrName+"::"+valueType+" :: "+stringValue+"::"+numValue+"::"+measureUnit+"|");
								
									if(miCode.equals("HER")||miCode.equals("ITU_PULSE2")||miCode.equals("VTS0006")){
										mi = new Pulse(numValue, measureUnit);
									}
//									switch (miCode) {
//									case "HER": case "ITU_PULSE2" : case "VTS0006":  System.out.println("Pulse "+" : "+stringValue+" : "+numValue+" : "+measureUnit);	
//									mi = new Pulse(numValue, measureUnit);
//									break;
									if(miCode.equals("TEM")||miCode.equals("ITU_TEMP2xx")||miCode.equals("VTS0005")){
										mi = new Temperature(numValue, measureUnit);
									}
									
//									case "TEM": case "ITU_TEMP2xx" : case "VTS0005": System.out.println("temperature"+" : "+stringValue+" : "+numValue+" : "+measureUnit);
//									mi = new Temperature(numValue, measureUnit);
//									break;
									if(miCode.equals("OH_ASSESS_BP_SYSTOLIC")||miCode.equals("BPS")||miCode.equals("VTS0002")||miCode.equals("ITU_SYSTO2")){
										mi = new BloodPressure(numValue, BloodPressure.SYSTOLIC, measureUnit);
									}

//									case "OH_ASSESS_BP_SYSTOLIC": case "BPS" : case "VTS0002" : case "ITU_SYSTO2" :System.out.println("BP Systolic " +" : "+stringValue+" : "+numValue+" : "+measureUnit);
//									mi = new BloodPressure(numValue, BloodPressure.SYSTOLIC, measureUnit);
//									break;
									if(miCode.equals("OH_ASSESS_BP_DIASTOLIC")||miCode.equals("BPD")||miCode.equals("VTS0010")||miCode.equals("ITU_DIASTO2")){
										mi = new BloodPressure(numValue, BloodPressure.DIASTOLIC, measureUnit);
									}

//									case "OH_ASSESS_BP_DIASTOLIC": case "BPD" : case "VTS0010" : case "ITU_DIASTO2" : System.out.println("BP Diastolic"+" : "+stringValue+" : "+numValue+" : "+measureUnit);
//									mi = new BloodPressure(numValue, BloodPressure.DIASTOLIC, measureUnit);
//									break;
									if(miCode.equals("OH_ASSESS_SPO2")||miCode.equals("OH_SPO2_P")){
										mi = new BloodOxygenSaturation(numValue, measureUnit);
									}

//									case "OH_ASSESS_SPO2": case "OH_SPO2_P" : System.out.println("SpO2 %"+" : "+stringValue+" : "+numValue+" : "+measureUnit);
//									mi = new BloodOxygenSaturation(numValue, measureUnit);
//									break;
									if(miCode.equals("WEI")||miCode.equals("ITU_WEIGHT2")||miCode.equals("VTS0003")){
										mi= new Weight(numValue, measureUnit);
									}

//									case "WEI": case "ITU_WEIGHT2" : case "VTS0003" : System.out.println("Weight"+" : "+stringValue+" : "+numValue+" : "+measureUnit);	
//									mi= new Weight(numValue, measureUnit);
//									break;
									if(miCode.equals("HEI")||miCode.equals("ITU_HEIGHT2")){
										mi = new Height(numValue, measureUnit);
									}

//									case "HEI":  case "ITU_HEIGHT2" : System.out.println("Height"+" : "+stringValue+" : "+numValue+" : "+measureUnit);
//									mi = new Height(numValue, measureUnit);
//									break;
									if(miCode.equals("OH_ASSESS_RESPIRATION")||miCode.equals("OH_RESPIRATION")||miCode.equals("ITU_RESP2")||miCode.equals("VTS0007")){
										mi = new RespiratoryRate(numValue, measureUnit);
									}

//									case "OH_ASSESS_RESPIRATION": case "OH_RESPIRATION" : case "ITU_RESP2" : case "VTS0007" : System.out.println("Respiration"+" : "+stringValue+" : "+numValue+" : "+measureUnit);
//									mi = new RespiratoryRate(numValue, measureUnit);
//									break;
//									if(){
//										
//									}
//
//									default:
//										//System.out.println("Default :"+miText+" ::::: "+miCode+" : "+stringValue+" : "+numValue+" : "+measureUnit);
//										break;
//									}								
						                                                      								
								
							break;	
							
							case AC : 
//								AC   Act
								System.out.println("AC"+miText+" ::"+attrName+"::"+valueType+" :: "+stringValue+"::"+numValue+"::"+measureUnit+"|");
							break;	
							
							case ME : 
//								ME   Drug
								System.out.println("ME"+miText+" ::"+attrName+"::"+valueType+" :: "+stringValue+"::"+numValue+"::"+measureUnit+"|");
							break;	
							
							case MO : 
//								MO   Motif
								System.out.println("MO"+miText+" ::"+attrName+"::"+valueType+" :: "+stringValue+"::"+numValue+"::"+measureUnit+"|");
							break;	
							
							case SY : 
//								SY   Symptom
								System.out.println("SY"+miText+" ::"+attrName+"::"+valueType+" :: "+stringValue+"::"+numValue+"::"+measureUnit+"|");
							break;	
							
							case XB : 
//								XB   Biologic exam
								System.out.println("XB"+miText+" ::"+attrName+"::"+valueType+" :: "+stringValue+"::"+numValue+"::"+measureUnit+"|");
							break;	
							
							case XR : 
//								XR   Radiological exam
								System.out.println("XR"+miText+" ::"+attrName+"::"+valueType+" :: "+stringValue+"::"+numValue+"::"+measureUnit+"|");
							break;	
							
							case XA : 
//								XA   Other exam
								System.out.println("XA"+miText+" ::"+attrName+"::"+valueType+" :: "+stringValue+"::"+numValue+"::"+measureUnit+"|");
							break;	
							
							case XAD : 
//								XAD   Prescription of other exam
								System.out.println("XAD"+miText+" ::"+attrName+"::"+valueType+" :: "+stringValue+"::"+numValue+"::"+measureUnit+"|");
							break;	
							
							case XBD : 
//								XBD   Prescription of biologic exam
								System.out.println("XBD"+miText+" ::"+attrName+"::"+valueType+" :: "+stringValue+"::"+numValue+"::"+measureUnit+"|");
							break;	
							

							case XRD : 
//								XRD   Prescription of radiologic exam
								System.out.println("XRD"+miText+" ::"+attrName+"::"+valueType+" :: "+stringValue+"::"+numValue+"::"+measureUnit+"|");
							break;	
							
							case XSD : 
//								XSD   Prescription of monitoring exam
								System.out.println("XSD"+miText+" ::"+attrName+"::"+valueType+" :: "+stringValue+"::"+numValue+"::"+measureUnit+"|");
							break;	
							
							case ET : 
//								ET   State
								System.out.println("ET"+miText+" ::"+attrName+"::"+valueType+" :: "+stringValue+"::"+numValue+"::"+measureUnit+"|");
							break;	
							
							case RI : 
//								RI   Risk
								System.out.println("RI"+miText+" ::"+attrName+"::"+valueType+" :: "+stringValue+"::"+numValue+"::"+measureUnit+"|");
							break;	
							
							case XAR : 
//								XAR   Other Exam Result
								System.out.println("XAR"+miText+" ::"+attrName+"::"+valueType+" :: "+stringValue+"::"+numValue+"::"+measureUnit+"|");
							break;	
							
							case XRR : 
//								XRR   Radiological Exam Result
								System.out.println("XRR"+miText+" ::"+attrName+"::"+valueType+" :: "+stringValue+"::"+numValue+"::"+measureUnit+"|");
							break;	
															
							case DI : 
//								DI   Disposable
								System.out.println("DI"+miText+" ::"+attrName+"::"+valueType+" :: "+stringValue+"::"+numValue+"::"+measureUnit+"|");
							break;	
							
							case NAC : 
//								NAC   Nurse acts
								System.out.println("NAC"+miText+" ::"+attrName+"::"+valueType+" :: "+stringValue+"::"+numValue+"::"+measureUnit+"|");
							break;	
							
							case VAD : 
//								VAD   Prescription of Vaccine
								System.out.println("VAD"+miText+" ::"+attrName+"::"+valueType+" :: "+stringValue+"::"+numValue+"::"+measureUnit+"|");
							break;	
							
							case VAR : 
//								VAR   Vaccine
								System.out.println("VAR"+miText+" ::"+attrName+"::"+valueType+" :: "+stringValue+"::"+numValue+"::"+measureUnit+"|");
							break;	
							
							}
					break;
				}
				*/
				
			}
			mi_id = instance.sql.GetIntValue(col);
			

			
		}	
		instance.sql.EndSelect();
		
		return miList;
	}
	
	
	@SuppressWarnings("unused")
	private static Date xsdDateFormater(Date date){
		try {					    
		    SimpleDateFormat dmyFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ");
		    String dmy = dmyFormat.format(date);
		    System.out.println("Add date : "+dmy);
		   return dmyFormat.parse(dmy);		    		    		   
		} catch (ParseException exp) {
		    return null;
		}
		
	}
	
	
	
	public static void main(String[] args) {

		MdsDbToOntologyFactory.getInstance("superadmin","maidis");
		try {
			
//			MdsDbToOntologyFactory.selectMedicalItemsOfContact(910);
			
			Contact c =	MdsDbToOntologyFactory.selectContact(910);
			System.out.println("Print result !!!!!!!!!!!!!!!!!!!!!!!!!!");
			
			System.out.println("Contact : ");
			System.out.println("getCommentOfContact "+c.getCommentOfContact());
			System.out.println("getContactId "+c.getContactId());
			System.out.println("getContactPlace "+c.getContactPlace());
			System.out.println("getContactReason "+c.getContactReason());
			System.out.println("getContactState "+c.getContactState());
			System.out.println("getContactType "+c.getContactType());
			System.out.println("getId "+c.getId());
			System.out.println("getStartDateOfContact "+c.getStartDateOfContact());
			Patient p=c.getPatientConcerned();
			System.out.println("Patient : ");
			System.out.println(p.getId()+" "+p.getPatient_id() +" "+ p.getPatientInsurance_id()  +""+p.getPin()+""+p.getGender()+" "+p.getFirstName()+" "+p.getLastName());
						
			//MdsDbToOntologyFactory.selectMedicalItemsOfContact(910);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	

	}

}
