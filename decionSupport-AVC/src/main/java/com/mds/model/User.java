package com.mds.model;

import java.rmi.server.UID;
import java.util.Date;

import com.mds.gao.Generated;
import com.mds.gao.Id;
import com.mds.gao.Namespace;
import com.mds.gao.RdfProperty;
import com.mds.gao.Transient;
import com.mds.gao.binding.RdfBean;

@Namespace(MdsVocabulary.NS)
public class User extends RdfBean<User>  implements java.io.Serializable,Person{
	
	/**
	 * 
	 */
	@Transient
	private static final long serialVersionUID = 7939642952702904658L;

	@Generated
	@Id	
	private String id;	
	
	@RdfProperty(MdsVocabulary.civility)
	private String civility;
	
	@RdfProperty(MdsVocabulary.firstName)
	private String firstName;
	
	@RdfProperty(MdsVocabulary.lastName)
	private String lastName;	
	
	@RdfProperty(MdsVocabulary.birthDate)
	private Date birthDate;
	
	@RdfProperty(MdsVocabulary.adress)
	private String adress;
	
	@RdfProperty(MdsVocabulary.email)
	private String email;

	@RdfProperty(MdsVocabulary.userId)
	private int userId;
	
	@RdfProperty(MdsVocabulary.corespId)
	private int corespId;
	
	
	@RdfProperty(MdsVocabulary.profilId)
	private int profilId;
	
	@RdfProperty(MdsVocabulary.userName)
	private String userName;
	
	@RdfProperty(MdsVocabulary.userPasseword)
	private String userPasseword;
	
	@RdfProperty(MdsVocabulary.profilName)
	private String profilName;
	
	@RdfProperty(MdsVocabulary.profilDescription)
	private String profilDescription;
	
	@RdfProperty(MdsVocabulary.Title)
	private String title;
	
	@RdfProperty(MdsVocabulary.specialization)
	private String specialization;
	
	
	
	
	public User() {
		super();
		this.id = new UID().toString();			
	}


	public User(String civility, String firstName, String lastName,
			Date birthDate, String adress, String email, int userId,
			int corespId, int profilId, String userName, String userPasseword,
			String profilName, String profilDescription, String title,
			String specialization) {
		super();
		this.id = new UID().toString();	
		this.civility = civility;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.adress = adress;
		this.email = email;
		this.userId = userId;
		this.corespId = corespId;
		this.profilId = profilId;
		this.userName = userName;
		this.userPasseword = userPasseword;
		this.profilName = profilName;
		this.profilDescription = profilDescription;
		this.title = title;
		this.specialization = specialization;
	}

	public String getCivility() {
		return civility;
	}

	public void setCivility(String civility) {
		this.civility = civility;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getCorespId() {
		return corespId;
	}

	public void setCorespId(int corespId) {
		this.corespId = corespId;
	}

	public int getProfilId() {
		return profilId;
	}

	public void setProfilId(int profilId) {
		this.profilId = profilId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPasseword() {
		return userPasseword;
	}

	public void setUserPasseword(String userPasseword) {
		this.userPasseword = userPasseword;
	}

	public String getProfilName() {
		return profilName;
	}

	public void setProfilName(String profilName) {
		this.profilName = profilName;
	}

	public String getProfilDescription() {
		return profilDescription;
	}

	public void setProfilDescription(String profilDescription) {
		this.profilDescription = profilDescription;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", lastName="
				+ lastName + ", birthDate=" + birthDate + ", adress=" + adress
				+ ", email=" + email + ", userId=" + userId + ", corespId="
				+ corespId + ", profilId=" + profilId + ", userName="
				+ userName + ", userPasseword=" + userPasseword
				+ ", profilName=" + profilName + ", profilDescription="
				+ profilDescription + ", title=" + title + ", specialization="
				+ specialization + "]";
	}

}
