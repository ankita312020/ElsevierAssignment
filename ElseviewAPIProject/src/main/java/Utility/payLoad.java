package Utility;

public class payLoad {
	public static String extOrg() {
		// Define a JSON payload for the external organization with the name attribute
		String payload="{\"name\":{\"en_US\": \"My external organization\"}}";
		return payload;
		
	}
	
	public static String extOrgAndoptional() {
		// Define a  complex JSON payload for the external organization with various optional fields
		String pLoad="{\n"
				+ "  \"name\": {\n"
				+ "    \"en_US\": \"My external organizatione\"\n"
				+ "  },\n"
				+ "  \"phoneNumber\": \"+94 56372283\",\n"
				+ "  \"mobilePhoneNumber\": \"+45 4392343\",\n"
				+ "  \"fax\": \"3453234\",\n"
				+ "  \"email\": \"demo@example.com\",\n"
				+ "  \"bankAccountNumber\": \"3300000343033\",\n"
				+ "  \"vatNumber\": \"2300\",\n"
				+ "  \"address\": {\n"
				+ "    \"address1\": \"Copenhagen\",\n"
				+ "    \"address2\": \"Denmark\",\n"
				+ "    \"address3\": \"Aalborg\",\n"
				+ "    \"address4\": \"Middle Jutland\",\n"
				+ "    \"address5\": \"Finland\",\n"
				+ "    \"postalCode\": \"2300\",\n"
				+ "    \"city\": \"Pune\"\n"
				+ "    }\n"
				+ "  \n"
				+ "  }\n"
				+ "";
		return pLoad;
	}

}
