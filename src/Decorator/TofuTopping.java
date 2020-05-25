package Decorator;

import Concrete.Food;
import Decorator.FoodToppingDecorator;

public class TofuTopping extends FoodToppingDecorator {

    public TofuTopping(Food food) {
        super(food);
    }

    @Override
    public String getFood() {
        return super.getFood() + "Topping: Tofu\n";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 25;
    }
}
