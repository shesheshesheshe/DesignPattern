package CreationalType.BuilderPattern;

public class MealBuilder {

    public MealDirector prepareVegMealProduct(){
        MealDirector meal = new MealDirector();
        meal.addItem(new VegBurger());
        meal.addItem(new IceGreenTea());
        return meal;
    }

    public MealDirector prepareNonVegMealProduct(){
        MealDirector meal = new MealDirector();
        meal.addItem(new ChickenBurger());
        meal.addItem(new HotGreenTea());
        return meal;
    }
}