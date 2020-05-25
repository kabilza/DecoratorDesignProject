package Concrete;

import Concrete.Food;

public class PorkStirFriedWithBasilLeaf implements Food {
    @Override
    public String getFood() {
        return "Food: Pork stir-fried with Basil Leaf";
    }

    @Override
    public double getPrice() {
        return 25;
    }
}
