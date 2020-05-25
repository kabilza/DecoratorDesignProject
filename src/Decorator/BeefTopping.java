package Decorator;

import Concrete.Food;

public class BeefTopping extends FoodToppingDecorator {

    public BeefTopping(Food food) {
        super(food);
    }

    @Override
    public String getFood() {
        return super.getFood() + "Topping: Beef\n";
    }
}
