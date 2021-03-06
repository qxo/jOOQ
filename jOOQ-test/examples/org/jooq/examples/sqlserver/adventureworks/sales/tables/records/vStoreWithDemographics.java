/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.sales.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name = "vStoreWithDemographics", schema = "Sales")
public class vStoreWithDemographics extends org.jooq.impl.TableRecordImpl<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.vStoreWithDemographics> {

	private static final long serialVersionUID = 1138942003;

	/**
	 * Setter for <code>Sales.vStoreWithDemographics.CustomerID</code>. 
	 */
	public void setCustomerID(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vStoreWithDemographics.vStoreWithDemographics.CustomerID, value);
	}

	/**
	 * Getter for <code>Sales.vStoreWithDemographics.CustomerID</code>. 
	 */
	@javax.persistence.Column(name = "CustomerID", nullable = false, precision = 10)
	public java.lang.Integer getCustomerID() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vStoreWithDemographics.vStoreWithDemographics.CustomerID);
	}

	/**
	 * Setter for <code>Sales.vStoreWithDemographics.Name</code>. 
	 */
	public void setName(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vStoreWithDemographics.vStoreWithDemographics.Name, value);
	}

	/**
	 * Getter for <code>Sales.vStoreWithDemographics.Name</code>. 
	 */
	@javax.persistence.Column(name = "Name", nullable = false, length = 50)
	public java.lang.String getName() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vStoreWithDemographics.vStoreWithDemographics.Name);
	}

	/**
	 * Setter for <code>Sales.vStoreWithDemographics.ContactType</code>. 
	 */
	public void setContactType(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vStoreWithDemographics.vStoreWithDemographics.ContactType, value);
	}

	/**
	 * Getter for <code>Sales.vStoreWithDemographics.ContactType</code>. 
	 */
	@javax.persistence.Column(name = "ContactType", nullable = false, length = 50)
	public java.lang.String getContactType() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vStoreWithDemographics.vStoreWithDemographics.ContactType);
	}

	/**
	 * Setter for <code>Sales.vStoreWithDemographics.Title</code>. 
	 */
	public void setTitle(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vStoreWithDemographics.vStoreWithDemographics.Title, value);
	}

	/**
	 * Getter for <code>Sales.vStoreWithDemographics.Title</code>. 
	 */
	@javax.persistence.Column(name = "Title", length = 8)
	public java.lang.String getTitle() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vStoreWithDemographics.vStoreWithDemographics.Title);
	}

	/**
	 * Setter for <code>Sales.vStoreWithDemographics.FirstName</code>. 
	 */
	public void setFirstName(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vStoreWithDemographics.vStoreWithDemographics.FirstName, value);
	}

	/**
	 * Getter for <code>Sales.vStoreWithDemographics.FirstName</code>. 
	 */
	@javax.persistence.Column(name = "FirstName", nullable = false, length = 50)
	public java.lang.String getFirstName() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vStoreWithDemographics.vStoreWithDemographics.FirstName);
	}

	/**
	 * Setter for <code>Sales.vStoreWithDemographics.MiddleName</code>. 
	 */
	public void setMiddleName(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vStoreWithDemographics.vStoreWithDemographics.MiddleName, value);
	}

	/**
	 * Getter for <code>Sales.vStoreWithDemographics.MiddleName</code>. 
	 */
	@javax.persistence.Column(name = "MiddleName", length = 50)
	public java.lang.String getMiddleName() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vStoreWithDemographics.vStoreWithDemographics.MiddleName);
	}

	/**
	 * Setter for <code>Sales.vStoreWithDemographics.LastName</code>. 
	 */
	public void setLastName(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vStoreWithDemographics.vStoreWithDemographics.LastName, value);
	}

	/**
	 * Getter for <code>Sales.vStoreWithDemographics.LastName</code>. 
	 */
	@javax.persistence.Column(name = "LastName", nullable = false, length = 50)
	public java.lang.String getLastName() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vStoreWithDemographics.vStoreWithDemographics.LastName);
	}

	/**
	 * Setter for <code>Sales.vStoreWithDemographics.Suffix</code>. 
	 */
	public void setSuffix(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vStoreWithDemographics.vStoreWithDemographics.Suffix, value);
	}

	/**
	 * Getter for <code>Sales.vStoreWithDemographics.Suffix</code>. 
	 */
	@javax.persistence.Column(name = "Suffix", length = 10)
	public java.lang.String getSuffix() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vStoreWithDemographics.vStoreWithDemographics.Suffix);
	}

	/**
	 * Setter for <code>Sales.vStoreWithDemographics.Phone</code>. 
	 */
	public void setPhone(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vStoreWithDemographics.vStoreWithDemographics.Phone, value);
	}

	/**
	 * Getter for <code>Sales.vStoreWithDemographics.Phone</code>. 
	 */
	@javax.persistence.Column(name = "Phone", length = 25)
	public java.lang.String getPhone() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vStoreWithDemographics.vStoreWithDemographics.Phone);
	}

	/**
	 * Setter for <code>Sales.vStoreWithDemographics.EmailAddress</code>. 
	 */
	public void setEmailAddress(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vStoreWithDemographics.vStoreWithDemographics.EmailAddress, value);
	}

	/**
	 * Getter for <code>Sales.vStoreWithDemographics.EmailAddress</code>. 
	 */
	@javax.persistence.Column(name = "EmailAddress", length = 50)
	public java.lang.String getEmailAddress() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vStoreWithDemographics.vStoreWithDemographics.EmailAddress);
	}

	/**
	 * Setter for <code>Sales.vStoreWithDemographics.EmailPromotion</code>. 
	 */
	public void setEmailPromotion(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vStoreWithDemographics.vStoreWithDemographics.EmailPromotion, value);
	}

	/**
	 * Getter for <code>Sales.vStoreWithDemographics.EmailPromotion</code>. 
	 */
	@javax.persistence.Column(name = "EmailPromotion", nullable = false, precision = 10)
	public java.lang.Integer getEmailPromotion() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vStoreWithDemographics.vStoreWithDemographics.EmailPromotion);
	}

	/**
	 * Setter for <code>Sales.vStoreWithDemographics.AddressType</code>. 
	 */
	public void setAddressType(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vStoreWithDemographics.vStoreWithDemographics.AddressType, value);
	}

	/**
	 * Getter for <code>Sales.vStoreWithDemographics.AddressType</code>. 
	 */
	@javax.persistence.Column(name = "AddressType", nullable = false, length = 50)
	public java.lang.String getAddressType() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vStoreWithDemographics.vStoreWithDemographics.AddressType);
	}

	/**
	 * Setter for <code>Sales.vStoreWithDemographics.AddressLine1</code>. 
	 */
	public void setAddressLine1(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vStoreWithDemographics.vStoreWithDemographics.AddressLine1, value);
	}

	/**
	 * Getter for <code>Sales.vStoreWithDemographics.AddressLine1</code>. 
	 */
	@javax.persistence.Column(name = "AddressLine1", nullable = false, length = 60)
	public java.lang.String getAddressLine1() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vStoreWithDemographics.vStoreWithDemographics.AddressLine1);
	}

	/**
	 * Setter for <code>Sales.vStoreWithDemographics.AddressLine2</code>. 
	 */
	public void setAddressLine2(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vStoreWithDemographics.vStoreWithDemographics.AddressLine2, value);
	}

	/**
	 * Getter for <code>Sales.vStoreWithDemographics.AddressLine2</code>. 
	 */
	@javax.persistence.Column(name = "AddressLine2", length = 60)
	public java.lang.String getAddressLine2() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vStoreWithDemographics.vStoreWithDemographics.AddressLine2);
	}

	/**
	 * Setter for <code>Sales.vStoreWithDemographics.City</code>. 
	 */
	public void setCity(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vStoreWithDemographics.vStoreWithDemographics.City, value);
	}

	/**
	 * Getter for <code>Sales.vStoreWithDemographics.City</code>. 
	 */
	@javax.persistence.Column(name = "City", nullable = false, length = 30)
	public java.lang.String getCity() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vStoreWithDemographics.vStoreWithDemographics.City);
	}

	/**
	 * Setter for <code>Sales.vStoreWithDemographics.StateProvinceName</code>. 
	 */
	public void setStateProvinceName(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vStoreWithDemographics.vStoreWithDemographics.StateProvinceName, value);
	}

	/**
	 * Getter for <code>Sales.vStoreWithDemographics.StateProvinceName</code>. 
	 */
	@javax.persistence.Column(name = "StateProvinceName", nullable = false, length = 50)
	public java.lang.String getStateProvinceName() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vStoreWithDemographics.vStoreWithDemographics.StateProvinceName);
	}

	/**
	 * Setter for <code>Sales.vStoreWithDemographics.PostalCode</code>. 
	 */
	public void setPostalCode(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vStoreWithDemographics.vStoreWithDemographics.PostalCode, value);
	}

	/**
	 * Getter for <code>Sales.vStoreWithDemographics.PostalCode</code>. 
	 */
	@javax.persistence.Column(name = "PostalCode", nullable = false, length = 15)
	public java.lang.String getPostalCode() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vStoreWithDemographics.vStoreWithDemographics.PostalCode);
	}

	/**
	 * Setter for <code>Sales.vStoreWithDemographics.CountryRegionName</code>. 
	 */
	public void setCountryRegionName(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vStoreWithDemographics.vStoreWithDemographics.CountryRegionName, value);
	}

	/**
	 * Getter for <code>Sales.vStoreWithDemographics.CountryRegionName</code>. 
	 */
	@javax.persistence.Column(name = "CountryRegionName", nullable = false, length = 50)
	public java.lang.String getCountryRegionName() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vStoreWithDemographics.vStoreWithDemographics.CountryRegionName);
	}

	/**
	 * Setter for <code>Sales.vStoreWithDemographics.AnnualSales</code>. 
	 */
	public void setAnnualSales(java.math.BigDecimal value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vStoreWithDemographics.vStoreWithDemographics.AnnualSales, value);
	}

	/**
	 * Getter for <code>Sales.vStoreWithDemographics.AnnualSales</code>. 
	 */
	@javax.persistence.Column(name = "AnnualSales", precision = 19, scale = 4)
	public java.math.BigDecimal getAnnualSales() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vStoreWithDemographics.vStoreWithDemographics.AnnualSales);
	}

	/**
	 * Setter for <code>Sales.vStoreWithDemographics.AnnualRevenue</code>. 
	 */
	public void setAnnualRevenue(java.math.BigDecimal value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vStoreWithDemographics.vStoreWithDemographics.AnnualRevenue, value);
	}

	/**
	 * Getter for <code>Sales.vStoreWithDemographics.AnnualRevenue</code>. 
	 */
	@javax.persistence.Column(name = "AnnualRevenue", precision = 19, scale = 4)
	public java.math.BigDecimal getAnnualRevenue() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vStoreWithDemographics.vStoreWithDemographics.AnnualRevenue);
	}

	/**
	 * Setter for <code>Sales.vStoreWithDemographics.BankName</code>. 
	 */
	public void setBankName(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vStoreWithDemographics.vStoreWithDemographics.BankName, value);
	}

	/**
	 * Getter for <code>Sales.vStoreWithDemographics.BankName</code>. 
	 */
	@javax.persistence.Column(name = "BankName", length = 50)
	public java.lang.String getBankName() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vStoreWithDemographics.vStoreWithDemographics.BankName);
	}

	/**
	 * Setter for <code>Sales.vStoreWithDemographics.BusinessType</code>. 
	 */
	public void setBusinessType(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vStoreWithDemographics.vStoreWithDemographics.BusinessType, value);
	}

	/**
	 * Getter for <code>Sales.vStoreWithDemographics.BusinessType</code>. 
	 */
	@javax.persistence.Column(name = "BusinessType", length = 5)
	public java.lang.String getBusinessType() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vStoreWithDemographics.vStoreWithDemographics.BusinessType);
	}

	/**
	 * Setter for <code>Sales.vStoreWithDemographics.YearOpened</code>. 
	 */
	public void setYearOpened(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vStoreWithDemographics.vStoreWithDemographics.YearOpened, value);
	}

	/**
	 * Getter for <code>Sales.vStoreWithDemographics.YearOpened</code>. 
	 */
	@javax.persistence.Column(name = "YearOpened", precision = 10)
	public java.lang.Integer getYearOpened() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vStoreWithDemographics.vStoreWithDemographics.YearOpened);
	}

	/**
	 * Setter for <code>Sales.vStoreWithDemographics.Specialty</code>. 
	 */
	public void setSpecialty(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vStoreWithDemographics.vStoreWithDemographics.Specialty, value);
	}

	/**
	 * Getter for <code>Sales.vStoreWithDemographics.Specialty</code>. 
	 */
	@javax.persistence.Column(name = "Specialty", length = 50)
	public java.lang.String getSpecialty() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vStoreWithDemographics.vStoreWithDemographics.Specialty);
	}

	/**
	 * Setter for <code>Sales.vStoreWithDemographics.SquareFeet</code>. 
	 */
	public void setSquareFeet(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vStoreWithDemographics.vStoreWithDemographics.SquareFeet, value);
	}

	/**
	 * Getter for <code>Sales.vStoreWithDemographics.SquareFeet</code>. 
	 */
	@javax.persistence.Column(name = "SquareFeet", precision = 10)
	public java.lang.Integer getSquareFeet() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vStoreWithDemographics.vStoreWithDemographics.SquareFeet);
	}

	/**
	 * Setter for <code>Sales.vStoreWithDemographics.Brands</code>. 
	 */
	public void setBrands(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vStoreWithDemographics.vStoreWithDemographics.Brands, value);
	}

	/**
	 * Getter for <code>Sales.vStoreWithDemographics.Brands</code>. 
	 */
	@javax.persistence.Column(name = "Brands", length = 30)
	public java.lang.String getBrands() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vStoreWithDemographics.vStoreWithDemographics.Brands);
	}

	/**
	 * Setter for <code>Sales.vStoreWithDemographics.Internet</code>. 
	 */
	public void setInternet(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vStoreWithDemographics.vStoreWithDemographics.Internet, value);
	}

	/**
	 * Getter for <code>Sales.vStoreWithDemographics.Internet</code>. 
	 */
	@javax.persistence.Column(name = "Internet", length = 30)
	public java.lang.String getInternet() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vStoreWithDemographics.vStoreWithDemographics.Internet);
	}

	/**
	 * Setter for <code>Sales.vStoreWithDemographics.NumberEmployees</code>. 
	 */
	public void setNumberEmployees(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vStoreWithDemographics.vStoreWithDemographics.NumberEmployees, value);
	}

	/**
	 * Getter for <code>Sales.vStoreWithDemographics.NumberEmployees</code>. 
	 */
	@javax.persistence.Column(name = "NumberEmployees", precision = 10)
	public java.lang.Integer getNumberEmployees() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vStoreWithDemographics.vStoreWithDemographics.NumberEmployees);
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached vStoreWithDemographics
	 */
	public vStoreWithDemographics() {
		super(org.jooq.examples.sqlserver.adventureworks.sales.tables.vStoreWithDemographics.vStoreWithDemographics);
	}
}
