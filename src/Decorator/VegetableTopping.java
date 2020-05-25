package Decorator;

import Concrete.Food;
import Decorator.FoodToppingDecorator;

public class VegetableTopping extends FoodToppingDecorator {

    public VegetableTopping(Food food) {
        super(food);
    }

    @Override
    public String getFood() {
        return super.getFood() + "Topping: Vegetable\n";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 12;
    }
}
