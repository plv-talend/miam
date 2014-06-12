package my.food;

import java.util.List;

import country.Country;

public class LaMian implements Food {

	@Override
	public List<String> getIngredients() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getCountryOrigin() {
		// TODO Auto-generated method stub
		return Country.CHINA.getName();
	}

}
