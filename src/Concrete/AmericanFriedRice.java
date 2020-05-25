package Concrete;

import Concrete.Food;

public class AmericanFriedRice implements Food {
    @Override
    public String getFood() {
        return "Food: American Friend Rice";
    }

    @Override
    public double getPrice() {
        return 30;
    }
}