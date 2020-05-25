package Concrete;

import Concrete.Food;

public class GreenCurryFriedRice implements Food {
    @Override
    public String getFood() {
        return "Food: Green curry friend rice";
    }

    @Override
    public double getPrice() {
        return 20;
    }
}
