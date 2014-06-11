package my.food;

import java.util.ArrayList;
import java.util.List;

public class ChaShaoBao implements Food {


    List<String> ingredients = new ArrayList<String>();
	
	/* Exercise 1: implement Constructor */
	public ChaShaoBao(){
		ingredients.add("chashaobao1");
		ingredients.add("chashaobao2");
		ingredients.add("chashaobao");
		ingredients.add("chashaobao3");
		ingredients.add("chashaobao4");
		ingredients.add("chashaobao5");
		ingredients.add("chashaobao6");
		ingredients.add("chashaobao7");
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
