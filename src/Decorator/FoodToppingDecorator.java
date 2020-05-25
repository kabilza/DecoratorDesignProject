package Decorator;

import Concrete.Food;

public abstract class FoodToppingDecorator implements Food {
    protected Food food;

    public FoodToppingDecorator(Food food) {
        this.food = food;
    }

    @Override
    public String getFood() {
        return food.getFood();
    }
}