package my.food;

import java.util.ArrayList;
import java.util.List;

public class DanDanMian implements Food {

	List<String> ingredients = new ArrayList<String>();

	/**
	 * default
	 */
	public DanDanMian() {
		ingredients.add("noodle");
		ingredients.add("spices");
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer getCalory() {
		// TODO Auto-generated method stub
		return null;
	}

}
