package country;

public enum Country {

	FRANCE("France"),

	ITALY("Italy"),

	CHINA("China"),

	SPAIN("Spain");

	private String name;

	Country(String name) {

	}

	public String getName() {
		return name;
	}

}
