package Concrete;

import Concrete.Food;

public class TomYumKung implements Food {
    @Override
    public String getFood() {
        return "Food: Tom yum kung";
    }

    @Override
    public double getPrice() {
        return 40;
    }
}