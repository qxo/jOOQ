/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.humanresources.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "vJobCandidate", schema = "HumanResources")
public class vJobCandidate implements java.io.Serializable {

	private static final long serialVersionUID = 2007044112;

	private java.lang.Integer  JobCandidateID;
	private java.lang.Integer  EmployeeID;
	private java.lang.String   Name_Prefix;
	private java.lang.String   Name_First;
	private java.lang.String   Name_Middle;
	private java.lang.String   Name_Last;
	private java.lang.String   Name_Suffix;
	private java.lang.String   Skills;
	private java.lang.String   Addr_Type;
	private java.lang.String   Addr_Loc_CountryRegion;
	private java.lang.String   Addr_Loc_State;
	private java.lang.String   Addr_Loc_City;
	private java.lang.String   Addr_PostalCode;
	private java.lang.String   EMail;
	private java.lang.String   WebSite;
	private java.sql.Timestamp ModifiedDate;

	@javax.persistence.Column(name = "JobCandidateID", nullable = false)
	public java.lang.Integer getJobCandidateID() {
		return this.JobCandidateID;
	}

	public void setJobCandidateID(java.lang.Integer JobCandidateID) {
		this.JobCandidateID = JobCandidateID;
	}

	@javax.persistence.Column(name = "EmployeeID")
	public java.lang.Integer getEmployeeID() {
		return this.EmployeeID;
	}

	public void setEmployeeID(java.lang.Integer EmployeeID) {
		this.EmployeeID = EmployeeID;
	}

	@javax.persistence.Column(name = "Name.Prefix")
	public java.lang.String getName_Prefix() {
		return this.Name_Prefix;
	}

	public void setName_Prefix(java.lang.String Name_Prefix) {
		this.Name_Prefix = Name_Prefix;
	}

	@javax.persistence.Column(name = "Name.First")
	public java.lang.String getName_First() {
		return this.Name_First;
	}

	public void setName_First(java.lang.String Name_First) {
		this.Name_First = Name_First;
	}

	@javax.persistence.Column(name = "Name.Middle")
	public java.lang.String getName_Middle() {
		return this.Name_Middle;
	}

	public void setName_Middle(java.lang.String Name_Middle) {
		this.Name_Middle = Name_Middle;
	}

	@javax.persistence.Column(name = "Name.Last")
	public java.lang.String getName_Last() {
		return this.Name_Last;
	}

	public void setName_Last(java.lang.String Name_Last) {
		this.Name_Last = Name_Last;
	}

	@javax.persistence.Column(name = "Name.Suffix")
	public java.lang.String getName_Suffix() {
		return this.Name_Suffix;
	}

	public void setName_Suffix(java.lang.String Name_Suffix) {
		this.Name_Suffix = Name_Suffix;
	}

	@javax.persistence.Column(name = "Skills")
	public java.lang.String getSkills() {
		return this.Skills;
	}

	public void setSkills(java.lang.String Skills) {
		this.Skills = Skills;
	}

	@javax.persistence.Column(name = "Addr.Type")
	public java.lang.String getAddr_Type() {
		return this.Addr_Type;
	}

	public void setAddr_Type(java.lang.String Addr_Type) {
		this.Addr_Type = Addr_Type;
	}

	@javax.persistence.Column(name = "Addr.Loc.CountryRegion")
	public java.lang.String getAddr_Loc_CountryRegion() {
		return this.Addr_Loc_CountryRegion;
	}

	public void setAddr_Loc_CountryRegion(java.lang.String Addr_Loc_CountryRegion) {
		this.Addr_Loc_CountryRegion = Addr_Loc_CountryRegion;
	}

	@javax.persistence.Column(name = "Addr.Loc.State")
	public java.lang.String getAddr_Loc_State() {
		return this.Addr_Loc_State;
	}

	public void setAddr_Loc_State(java.lang.String Addr_Loc_State) {
		this.Addr_Loc_State = Addr_Loc_State;
	}

	@javax.persistence.Column(name = "Addr.Loc.City")
	public java.lang.String getAddr_Loc_City() {
		return this.Addr_Loc_City;
	}

	public void setAddr_Loc_City(java.lang.String Addr_Loc_City) {
		this.Addr_Loc_City = Addr_Loc_City;
	}

	@javax.persistence.Column(name = "Addr.PostalCode")
	public java.lang.String getAddr_PostalCode() {
		return this.Addr_PostalCode;
	}

	public void setAddr_PostalCode(java.lang.String Addr_PostalCode) {
		this.Addr_PostalCode = Addr_PostalCode;
	}

	@javax.persistence.Column(name = "EMail")
	public java.lang.String getEMail() {
		return this.EMail;
	}

	public void setEMail(java.lang.String EMail) {
		this.EMail = EMail;
	}

	@javax.persistence.Column(name = "WebSite")
	public java.lang.String getWebSite() {
		return this.WebSite;
	}

	public void setWebSite(java.lang.String WebSite) {
		this.WebSite = WebSite;
	}

	@javax.persistence.Column(name = "ModifiedDate", nullable = false)
	public java.sql.Timestamp getModifiedDate() {
		return this.ModifiedDate;
	}

	public void setModifiedDate(java.sql.Timestamp ModifiedDate) {
		this.ModifiedDate = ModifiedDate;
	}
}