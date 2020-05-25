package Decorator;

import Concrete.Food;
import Decorator.FoodToppingDecorator;

public class PorkTopping extends FoodToppingDecorator {

    public PorkTopping(Food food) {
        super(food);
    }

    @Override
    public String getFood() {
        return super.getFood() + "\nTopping: Pork";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 20;
    }
}
