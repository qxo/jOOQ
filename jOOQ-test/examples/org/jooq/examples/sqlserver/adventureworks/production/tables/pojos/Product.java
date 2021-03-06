/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.production.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name = "Product", schema = "Production")
public class Product implements java.io.Serializable {

	private static final long serialVersionUID = 1667277784;


	@javax.validation.constraints.NotNull
	private java.lang.Integer    ProductID;

	@javax.validation.constraints.NotNull
	@javax.validation.constraints.Size(max = 50)
	private java.lang.String     Name;

	@javax.validation.constraints.NotNull
	@javax.validation.constraints.Size(max = 25)
	private java.lang.String     ProductNumber;

	@javax.validation.constraints.NotNull
	private java.lang.Boolean    MakeFlag;

	@javax.validation.constraints.NotNull
	private java.lang.Boolean    FinishedGoodsFlag;

	@javax.validation.constraints.Size(max = 15)
	private java.lang.String     Color;

	@javax.validation.constraints.NotNull
	private java.lang.Short      SafetyStockLevel;

	@javax.validation.constraints.NotNull
	private java.lang.Short      ReorderPoint;

	@javax.validation.constraints.NotNull
	private java.math.BigDecimal StandardCost;

	@javax.validation.constraints.NotNull
	private java.math.BigDecimal ListPrice;

	@javax.validation.constraints.Size(max = 5)
	private java.lang.String     Size;

	@javax.validation.constraints.Size(max = 3)
	private java.lang.String     SizeUnitMeasureCode;

	@javax.validation.constraints.Size(max = 3)
	private java.lang.String     WeightUnitMeasureCode;
	private java.math.BigDecimal Weight;

	@javax.validation.constraints.NotNull
	private java.lang.Integer    DaysToManufacture;

	@javax.validation.constraints.Size(max = 2)
	private java.lang.String     ProductLine;

	@javax.validation.constraints.Size(max = 2)
	private java.lang.String     Class;

	@javax.validation.constraints.Size(max = 2)
	private java.lang.String     Style;
	private java.lang.Integer    ProductSubcategoryID;
	private java.lang.Integer    ProductModelID;

	@javax.validation.constraints.NotNull
	private java.sql.Timestamp   SellStartDate;
	private java.sql.Timestamp   SellEndDate;
	private java.sql.Timestamp   DiscontinuedDate;

	@javax.validation.constraints.NotNull
	private java.lang.String     rowguid;

	@javax.validation.constraints.NotNull
	private java.sql.Timestamp   ModifiedDate;

	@javax.persistence.Id
	@javax.persistence.Column(name = "ProductID", unique = true, nullable = false, precision = 10)
	public java.lang.Integer getProductID() {
		return this.ProductID;
	}

	public void setProductID(java.lang.Integer ProductID) {
		this.ProductID = ProductID;
	}

	@javax.persistence.Column(name = "Name", nullable = false, length = 50)
	public java.lang.String getName() {
		return this.Name;
	}

	public void setName(java.lang.String Name) {
		this.Name = Name;
	}

	@javax.persistence.Column(name = "ProductNumber", nullable = false, length = 25)
	public java.lang.String getProductNumber() {
		return this.ProductNumber;
	}

	public void setProductNumber(java.lang.String ProductNumber) {
		this.ProductNumber = ProductNumber;
	}

	@javax.persistence.Column(name = "MakeFlag", nullable = false)
	public java.lang.Boolean getMakeFlag() {
		return this.MakeFlag;
	}

	public void setMakeFlag(java.lang.Boolean MakeFlag) {
		this.MakeFlag = MakeFlag;
	}

	@javax.persistence.Column(name = "FinishedGoodsFlag", nullable = false)
	public java.lang.Boolean getFinishedGoodsFlag() {
		return this.FinishedGoodsFlag;
	}

	public void setFinishedGoodsFlag(java.lang.Boolean FinishedGoodsFlag) {
		this.FinishedGoodsFlag = FinishedGoodsFlag;
	}

	@javax.persistence.Column(name = "Color", length = 15)
	public java.lang.String getColor() {
		return this.Color;
	}

	public void setColor(java.lang.String Color) {
		this.Color = Color;
	}

	@javax.persistence.Column(name = "SafetyStockLevel", nullable = false, precision = 5)
	public java.lang.Short getSafetyStockLevel() {
		return this.SafetyStockLevel;
	}

	public void setSafetyStockLevel(java.lang.Short SafetyStockLevel) {
		this.SafetyStockLevel = SafetyStockLevel;
	}

	@javax.persistence.Column(name = "ReorderPoint", nullable = false, precision = 5)
	public java.lang.Short getReorderPoint() {
		return this.ReorderPoint;
	}

	public void setReorderPoint(java.lang.Short ReorderPoint) {
		this.ReorderPoint = ReorderPoint;
	}

	@javax.persistence.Column(name = "StandardCost", nullable = false, precision = 19, scale = 4)
	public java.math.BigDecimal getStandardCost() {
		return this.StandardCost;
	}

	public void setStandardCost(java.math.BigDecimal StandardCost) {
		this.StandardCost = StandardCost;
	}

	@javax.persistence.Column(name = "ListPrice", nullable = false, precision = 19, scale = 4)
	public java.math.BigDecimal getListPrice() {
		return this.ListPrice;
	}

	public void setListPrice(java.math.BigDecimal ListPrice) {
		this.ListPrice = ListPrice;
	}

	@javax.persistence.Column(name = "Size", length = 5)
	public java.lang.String getSize() {
		return this.Size;
	}

	public void setSize(java.lang.String Size) {
		this.Size = Size;
	}

	@javax.persistence.Column(name = "SizeUnitMeasureCode", length = 3)
	public java.lang.String getSizeUnitMeasureCode() {
		return this.SizeUnitMeasureCode;
	}

	public void setSizeUnitMeasureCode(java.lang.String SizeUnitMeasureCode) {
		this.SizeUnitMeasureCode = SizeUnitMeasureCode;
	}

	@javax.persistence.Column(name = "WeightUnitMeasureCode", length = 3)
	public java.lang.String getWeightUnitMeasureCode() {
		return this.WeightUnitMeasureCode;
	}

	public void setWeightUnitMeasureCode(java.lang.String WeightUnitMeasureCode) {
		this.WeightUnitMeasureCode = WeightUnitMeasureCode;
	}

	@javax.persistence.Column(name = "Weight", precision = 8, scale = 2)
	public java.math.BigDecimal getWeight() {
		return this.Weight;
	}

	public void setWeight(java.math.BigDecimal Weight) {
		this.Weight = Weight;
	}

	@javax.persistence.Column(name = "DaysToManufacture", nullable = false, precision = 10)
	public java.lang.Integer getDaysToManufacture() {
		return this.DaysToManufacture;
	}

	public void setDaysToManufacture(java.lang.Integer DaysToManufacture) {
		this.DaysToManufacture = DaysToManufacture;
	}

	@javax.persistence.Column(name = "ProductLine", length = 2)
	public java.lang.String getProductLine() {
		return this.ProductLine;
	}

	public void setProductLine(java.lang.String ProductLine) {
		this.ProductLine = ProductLine;
	}

	@javax.persistence.Column(name = "Class", length = 2)
	public java.lang.String getClass_() {
		return this.Class;
	}

	public void setClass_(java.lang.String Class) {
		this.Class = Class;
	}

	@javax.persistence.Column(name = "Style", length = 2)
	public java.lang.String getStyle() {
		return this.Style;
	}

	public void setStyle(java.lang.String Style) {
		this.Style = Style;
	}

	@javax.persistence.Column(name = "ProductSubcategoryID", precision = 10)
	public java.lang.Integer getProductSubcategoryID() {
		return this.ProductSubcategoryID;
	}

	public void setProductSubcategoryID(java.lang.Integer ProductSubcategoryID) {
		this.ProductSubcategoryID = ProductSubcategoryID;
	}

	@javax.persistence.Column(name = "ProductModelID", precision = 10)
	public java.lang.Integer getProductModelID() {
		return this.ProductModelID;
	}

	public void setProductModelID(java.lang.Integer ProductModelID) {
		this.ProductModelID = ProductModelID;
	}

	@javax.persistence.Column(name = "SellStartDate", nullable = false)
	public java.sql.Timestamp getSellStartDate() {
		return this.SellStartDate;
	}

	public void setSellStartDate(java.sql.Timestamp SellStartDate) {
		this.SellStartDate = SellStartDate;
	}

	@javax.persistence.Column(name = "SellEndDate")
	public java.sql.Timestamp getSellEndDate() {
		return this.SellEndDate;
	}

	public void setSellEndDate(java.sql.Timestamp SellEndDate) {
		this.SellEndDate = SellEndDate;
	}

	@javax.persistence.Column(name = "DiscontinuedDate")
	public java.sql.Timestamp getDiscontinuedDate() {
		return this.DiscontinuedDate;
	}

	public void setDiscontinuedDate(java.sql.Timestamp DiscontinuedDate) {
		this.DiscontinuedDate = DiscontinuedDate;
	}

	@javax.persistence.Column(name = "rowguid", nullable = false)
	public java.lang.String getrowguid() {
		return this.rowguid;
	}

	public void setrowguid(java.lang.String rowguid) {
		this.rowguid = rowguid;
	}

	@javax.persistence.Column(name = "ModifiedDate", nullable = false)
	public java.sql.Timestamp getModifiedDate() {
		return this.ModifiedDate;
	}

	public void setModifiedDate(java.sql.Timestamp ModifiedDate) {
		this.ModifiedDate = ModifiedDate;
	}
}
