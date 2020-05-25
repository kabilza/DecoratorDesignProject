package Concrete;

import Concrete.Food;

public class Noodle implements Food {
    @Override
    public String getFood() {
        return "Food: Noodle";
    }

    @Override
    public double getPrice() {
        return 10;
    }
}
