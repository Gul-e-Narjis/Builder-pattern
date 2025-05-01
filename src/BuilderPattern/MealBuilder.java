package BuilderPattern;


import BuilderPattern.Meal;
import BuilderPattern.DietPepsi;
import BuilderPattern.DietCoke;
import BuilderPattern.Coke;
import BuilderPattern.Pepsi;
import BuilderPattern.ChickenBurger;
import BuilderPattern.VegBurger; 

public class MealBuilder {

    public Meal prepareVegMeal(boolean isDiabetic){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(isDiabetic ? new DietCoke() : new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal(boolean isDiabetic){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(isDiabetic ? new DietPepsi() : new Pepsi());
        return meal;
    }
}
