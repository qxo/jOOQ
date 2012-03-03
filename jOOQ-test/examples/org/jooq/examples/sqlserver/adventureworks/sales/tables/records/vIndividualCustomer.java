/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.sales.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "vIndividualCustomer", schema = "Sales")
public class vIndividualCustomer extends org.jooq.impl.TableRecordImpl<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.vIndividualCustomer> {

	private static final long serialVersionUID = 1847916856;

	/**
	 * An uncommented item
	 */
	public void setCustomerID(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vIndividualCustomer.vIndividualCustomer.CustomerID, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "CustomerID", nullable = false)
	public java.lang.Integer getCustomerID() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vIndividualCustomer.vIndividualCustomer.CustomerID);
	}

	/**
	 * An uncommented item
	 */
	public void setTitle(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vIndividualCustomer.vIndividualCustomer.Title, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "Title")
	public java.lang.String getTitle() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vIndividualCustomer.vIndividualCustomer.Title);
	}

	/**
	 * An uncommented item
	 */
	public void setFirstName(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vIndividualCustomer.vIndividualCustomer.FirstName, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "FirstName", nullable = false)
	public java.lang.String getFirstName() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vIndividualCustomer.vIndividualCustomer.FirstName);
	}

	/**
	 * An uncommented item
	 */
	public void setMiddleName(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vIndividualCustomer.vIndividualCustomer.MiddleName, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "MiddleName")
	public java.lang.String getMiddleName() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vIndividualCustomer.vIndividualCustomer.MiddleName);
	}

	/**
	 * An uncommented item
	 */
	public void setLastName(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vIndividualCustomer.vIndividualCustomer.LastName, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "LastName", nullable = false)
	public java.lang.String getLastName() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vIndividualCustomer.vIndividualCustomer.LastName);
	}

	/**
	 * An uncommented item
	 */
	public void setSuffix(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vIndividualCustomer.vIndividualCustomer.Suffix, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "Suffix")
	public java.lang.String getSuffix() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vIndividualCustomer.vIndividualCustomer.Suffix);
	}

	/**
	 * An uncommented item
	 */
	public void setPhone(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vIndividualCustomer.vIndividualCustomer.Phone, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "Phone")
	public java.lang.String getPhone() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vIndividualCustomer.vIndividualCustomer.Phone);
	}

	/**
	 * An uncommented item
	 */
	public void setEmailAddress(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vIndividualCustomer.vIndividualCustomer.EmailAddress, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "EmailAddress")
	public java.lang.String getEmailAddress() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vIndividualCustomer.vIndividualCustomer.EmailAddress);
	}

	/**
	 * An uncommented item
	 */
	public void setEmailPromotion(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vIndividualCustomer.vIndividualCustomer.EmailPromotion, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "EmailPromotion", nullable = false)
	public java.lang.Integer getEmailPromotion() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vIndividualCustomer.vIndividualCustomer.EmailPromotion);
	}

	/**
	 * An uncommented item
	 */
	public void setAddressType(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vIndividualCustomer.vIndividualCustomer.AddressType, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "AddressType", nullable = false)
	public java.lang.String getAddressType() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vIndividualCustomer.vIndividualCustomer.AddressType);
	}

	/**
	 * An uncommented item
	 */
	public void setAddressLine1(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vIndividualCustomer.vIndividualCustomer.AddressLine1, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "AddressLine1", nullable = false)
	public java.lang.String getAddressLine1() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vIndividualCustomer.vIndividualCustomer.AddressLine1);
	}

	/**
	 * An uncommented item
	 */
	public void setAddressLine2(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vIndividualCustomer.vIndividualCustomer.AddressLine2, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "AddressLine2")
	public java.lang.String getAddressLine2() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vIndividualCustomer.vIndividualCustomer.AddressLine2);
	}

	/**
	 * An uncommented item
	 */
	public void setCity(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vIndividualCustomer.vIndividualCustomer.City, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "City", nullable = false)
	public java.lang.String getCity() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vIndividualCustomer.vIndividualCustomer.City);
	}

	/**
	 * An uncommented item
	 */
	public void setStateProvinceName(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vIndividualCustomer.vIndividualCustomer.StateProvinceName, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "StateProvinceName", nullable = false)
	public java.lang.String getStateProvinceName() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vIndividualCustomer.vIndividualCustomer.StateProvinceName);
	}

	/**
	 * An uncommented item
	 */
	public void setPostalCode(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vIndividualCustomer.vIndividualCustomer.PostalCode, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "PostalCode", nullable = false)
	public java.lang.String getPostalCode() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vIndividualCustomer.vIndividualCustomer.PostalCode);
	}

	/**
	 * An uncommented item
	 */
	public void setCountryRegionName(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vIndividualCustomer.vIndividualCustomer.CountryRegionName, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "CountryRegionName", nullable = false)
	public java.lang.String getCountryRegionName() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vIndividualCustomer.vIndividualCustomer.CountryRegionName);
	}

	/**
	 * An uncommented item
	 * 
	 * The SQL type of this item (xml, ) could not be mapped.<br/>
	 * Deserialising this field might not work!
	 */
	public void setDemographics(java.lang.Object value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vIndividualCustomer.vIndividualCustomer.Demographics, value);
	}

	/**
	 * An uncommented item
	 * 
	 * The SQL type of this item (xml, ) could not be mapped.<br/>
	 * Deserialising this field might not work!
	 */
	@javax.persistence.Column(name = "Demographics")
	public java.lang.Object getDemographics() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.vIndividualCustomer.vIndividualCustomer.Demographics);
	}

	/**
	 * Create a detached vIndividualCustomer
	 */
	public vIndividualCustomer() {
		super(org.jooq.examples.sqlserver.adventureworks.sales.tables.vIndividualCustomer.vIndividualCustomer);
	}
}