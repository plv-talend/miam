package my.food;

import java.util.ArrayList;
import java.util.List;

import country.Country;

public class ChaShaoBao implements Food {

	List<String> ingredients = new ArrayList<String>();

	/* Exercise 1: implement Constructor */
	public ChaShaoBao() {
		ingredients.add("chashaobao1");
		ingredients.add("chashaobao2");
		// ddddddddddddddddddddd
		ingredients.add("chashaobao");
		ingredients.add("chashaobao3");
	}

	@Override
	public List<String> getIngredients() {
		return ingredients;
	}

	@Override
	public String getCountryOrigin() {
		// TODO Auto-generated method stub
		return Country.FRANCE.getName();
	}

}
