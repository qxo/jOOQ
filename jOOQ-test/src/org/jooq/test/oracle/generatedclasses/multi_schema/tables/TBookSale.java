/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.multi_schema.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TBookSale extends org.jooq.impl.TableImpl<org.jooq.test.oracle.generatedclasses.multi_schema.tables.records.TBookSaleRecord> {

	private static final long serialVersionUID = 1051685337;

	/**
	 * The singleton instance of <code>MULTI_SCHEMA.T_BOOK_SALE</code>
	 */
	public static final org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBookSale T_BOOK_SALE = new org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBookSale();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.oracle.generatedclasses.multi_schema.tables.records.TBookSaleRecord> getRecordType() {
		return org.jooq.test.oracle.generatedclasses.multi_schema.tables.records.TBookSaleRecord.class;
	}

	/**
	 * The column <code>MULTI_SCHEMA.T_BOOK_SALE.ID</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.multi_schema.tables.records.TBookSaleRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>MULTI_SCHEMA.T_BOOK_SALE.BOOK_ID</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.multi_schema.tables.records.TBookSaleRecord, java.lang.Integer> BOOK_ID = createField("BOOK_ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>MULTI_SCHEMA.T_BOOK_SALE.BOOK_STORE_NAME</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.multi_schema.tables.records.TBookSaleRecord, java.lang.String> BOOK_STORE_NAME = createField("BOOK_STORE_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(400), this);

	/**
	 * The column <code>MULTI_SCHEMA.T_BOOK_SALE.SOLD_AT</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.multi_schema.tables.records.TBookSaleRecord, java.sql.Date> SOLD_AT = createField("SOLD_AT", org.jooq.impl.SQLDataType.DATE, this);

	/**
	 * The column <code>MULTI_SCHEMA.T_BOOK_SALE.SOLD_FOR</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.multi_schema.tables.records.TBookSaleRecord, java.math.BigDecimal> SOLD_FOR = createField("SOLD_FOR", org.jooq.impl.SQLDataType.NUMERIC.precision(10, 2), this);

	/**
	 * Create a <code>MULTI_SCHEMA.T_BOOK_SALE</code> table reference
	 */
	public TBookSale() {
		super("T_BOOK_SALE", org.jooq.test.oracle.generatedclasses.multi_schema.MultiSchema.MULTI_SCHEMA);
	}

	/**
	 * Create an aliased <code>MULTI_SCHEMA.T_BOOK_SALE</code> table reference
	 */
	public TBookSale(java.lang.String alias) {
		super(alias, org.jooq.test.oracle.generatedclasses.multi_schema.MultiSchema.MULTI_SCHEMA, org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBookSale.T_BOOK_SALE);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.oracle.generatedclasses.multi_schema.tables.records.TBookSaleRecord> getPrimaryKey() {
		return org.jooq.test.oracle.generatedclasses.multi_schema.Keys.PK_T_BOOK_SALE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.oracle.generatedclasses.multi_schema.tables.records.TBookSaleRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.oracle.generatedclasses.multi_schema.tables.records.TBookSaleRecord>>asList(org.jooq.test.oracle.generatedclasses.multi_schema.Keys.PK_T_BOOK_SALE);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<org.jooq.test.oracle.generatedclasses.multi_schema.tables.records.TBookSaleRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.test.oracle.generatedclasses.multi_schema.tables.records.TBookSaleRecord, ?>>asList(org.jooq.test.oracle.generatedclasses.multi_schema.Keys.FK_T_BOOK_TO_BOOK_STORE);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBookSale as(java.lang.String alias) {
		return new org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBookSale(alias);
	}
}
