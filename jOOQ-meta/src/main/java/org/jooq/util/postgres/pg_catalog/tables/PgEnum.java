/**
 * This class is generated by jOOQ
 */
package org.jooq.util.postgres.pg_catalog.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "1.6.8"},
                            comments = "This class is generated by jOOQ")
public class PgEnum extends org.jooq.impl.TableImpl<org.jooq.util.postgres.pg_catalog.tables.records.PgEnumRecord> {

	private static final long serialVersionUID = -2027701323;

	/**
	 * The singleton instance of pg_enum
	 */
	public static final org.jooq.util.postgres.pg_catalog.tables.PgEnum PG_ENUM = new org.jooq.util.postgres.pg_catalog.tables.PgEnum();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.util.postgres.pg_catalog.tables.records.PgEnumRecord> __RECORD_TYPE = org.jooq.util.postgres.pg_catalog.tables.records.PgEnumRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.util.postgres.pg_catalog.tables.records.PgEnumRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.postgres.pg_catalog.tables.records.PgEnumRecord, java.lang.Long> ENUMTYPID = new org.jooq.impl.TableFieldImpl<org.jooq.util.postgres.pg_catalog.tables.records.PgEnumRecord, java.lang.Long>("enumtypid", org.jooq.impl.SQLDataType.BIGINT, PG_ENUM);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.postgres.pg_catalog.tables.records.PgEnumRecord, java.lang.String> ENUMLABEL = new org.jooq.impl.TableFieldImpl<org.jooq.util.postgres.pg_catalog.tables.records.PgEnumRecord, java.lang.String>("enumlabel", org.jooq.impl.SQLDataType.VARCHAR, PG_ENUM);

	/**
	 * No further instances allowed
	 */
	private PgEnum() {
		super("pg_enum", org.jooq.util.postgres.pg_catalog.PgCatalog.PG_CATALOG);
	}
}
