/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.dbo.routines;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class uspGetWhereUsedProductID extends org.jooq.impl.AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = 17103561;

	/**
	 * The parameter <code>dbo.uspGetWhereUsedProductID.StartProductID</code>. 
	 */
	public static final org.jooq.Parameter<java.lang.Integer> StartProductID = createParameter("StartProductID", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * The parameter <code>dbo.uspGetWhereUsedProductID.CheckDate</code>. 
	 */
	public static final org.jooq.Parameter<java.sql.Timestamp> CheckDate = createParameter("CheckDate", org.jooq.impl.SQLDataType.TIMESTAMP);

	/**
	 * Create a new routine call instance
	 */
	public uspGetWhereUsedProductID() {
		super("uspGetWhereUsedProductID", org.jooq.examples.sqlserver.adventureworks.dbo.dbo.dbo);

		addInParameter(StartProductID);
		addInParameter(CheckDate);
	}

	/**
	 * Set the <code>StartProductID</code> parameter IN value to the routine
	 */
	public void setStartProductID(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.dbo.routines.uspGetWhereUsedProductID.StartProductID, value);
	}

	/**
	 * Set the <code>CheckDate</code> parameter IN value to the routine
	 */
	public void setCheckDate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.dbo.routines.uspGetWhereUsedProductID.CheckDate, value);
	}
}
