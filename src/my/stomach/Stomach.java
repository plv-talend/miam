package my.stomach;

import java.util.ArrayList;
import java.util.List;

import my.food.ChaShaoBao;
import my.food.DanDanMian;
import my.food.Food;
import my.food.Pizza;

public class Stomach {

	List<Food> foodsInside = new ArrayList<Food>();

	public Stomach() {
		foodsInside.add(new Pizza());
		/* Exercise 2 : add your food */
		foodsInside.add(new ChaShaoBao());
		// foodsInside.add(new Pizza()); // I like Pizza
		// foodsInside.add(new Pizza()); // I like Pizza
		foodsInside.add(new DanDanMian());// I like DanDanMian as
		// foodsInside.add(new Pizza()); // I like Pizza
		// foodsInside.add(new Pizza()); // I like Pizza
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("My stomach contains "
				+ foodsInside.size() + " food(s):\n\n");
		for (Food food : foodsInside) {
			sb.append(foodsInside.indexOf(food) + 1 + ")");

			/* Display the name of the food object */
			sb.append(food.getClass().getSimpleName() + ":");
			sb.append("\n");

			/* Display the name of the Country object */
			sb.append(food.getCountryOrigin() + ":");
			sb.append("\n");

			/* Display the list of ingredients */
			sb.append(food.getIngredients());
			sb.append("\n\n");

			/* Exercise 3: Display the country of origin see class Country */

		}
		return sb.toString();
	}
}
