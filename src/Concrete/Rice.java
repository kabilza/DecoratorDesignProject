package Concrete;

import Concrete.Food;

public class Rice implements Food {
    @Override
    public String getFood() {
        return "Food: Rice";
    }

    @Override
    public double getPrice() {
        return 10;
    }
}
