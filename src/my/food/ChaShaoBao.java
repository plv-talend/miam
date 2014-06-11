package my.food;

import java.util.ArrayList;
import java.util.List;

public class ChaShaoBao implements Food {


    List<String> ingredients = new ArrayList<String>();
	
	/* Exercise 1: implement Constructor */
	public ChaShaoBao(){
		ingredients.add("chashaobao1");
		ingredients.add("chashaobao2");
	}
	
	@Override
	public List<String> getIngredients() {
		return ingredients;
	}

    @Override
    public String getCountryOrigin() {
        // TODO Auto-generated method stub
        return "hello";
    }

    @Override
    public Integer getCalory() {
        // TODO Auto-generated method stub
        return 99;
    }

}
