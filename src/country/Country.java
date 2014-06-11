package country;

public enum Country {

	FRANCE("France"),

	ITALY("Italy"),

	CHINA("China"),

	SPAIN("Spain"),
	
	USA("USA");

	private String name;

	Country(String name) {

	}

	public String getName() {
		return name;
	}

}

}
