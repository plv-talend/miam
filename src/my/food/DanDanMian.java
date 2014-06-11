package my.food;

import java.util.ArrayList;
import java.util.List;

import country.Country;

public class DanDanMian implements Food {

	List<String> ingredients = new ArrayList<String>();

	/**
	 * default
	 */
	public DanDanMian() {
		ingredients.add("noodle");
		ingredients.add("spices");
		ingredients.add("peanuts");
	}

	public DanDanMian(List<String> ingredients) {
		this.ingredients = ingredients;
	}

	/* Exercise 1: implement Constructor */

	@Override
	public List<String> getIngredients() {
		return ingredients;
	}

	@Override
	public String getCountryOrigin() {
		return Country.CHINA.getName();
	}

}
