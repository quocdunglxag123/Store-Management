package com.quocdung.enums;

public enum SearchOperation {
	CONTAINS, EQUAL, GREATER_THAN, GREATER_THAN_EQUAL, LESS_THAN, LESS_THAN_EQUAL, ALL, ANY;
	public static final String[] SIMPLE_OPERATION_SET = { "cn", "eq", "gt", "ge", "lt", "le", "all", "any" };

	public static SearchOperation getDataOption(final String dataOption) {
		switch (dataOption) {
		case "all":
			return ALL;
		case "any":
			return ANY;
		default:
			return null;
		}
	}

	public static SearchOperation getSimpleOperation(final String input) {
		switch (input) {
		case "cn":
			return CONTAINS;
		case "eq":
			return EQUAL;
		case "gt":
			return GREATER_THAN;
		case "ge":
			return GREATER_THAN_EQUAL;
		case "lt":
			return LESS_THAN;
		case "le":
			return LESS_THAN_EQUAL;

		default:
			return null;
		}
	}
}
