/**
 * This class is generated by jOOQ
 */
package org.jooq.util.mysql.mysql.enums;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = "http://jooq.sourceforge.net",
                            comments = "This class is generated by jOOQ")
public enum ProcType implements org.jooq.EnumType {
	FUNCTION("FUNCTION"),

	PROCEDURE("PROCEDURE"),

	;

	private final java.lang.String literal;

	private ProcType(java.lang.String literal) {
		this.literal = literal;
	}

	@Override
	public java.lang.String getName() {
		return "proc_type";
	}

	@Override
	public java.lang.String getLiteral() {
		return literal;
	}
}
