import Concrete.Food;

public class PorkTopping extends FoodToppingDecorator {

    public PorkTopping(Food decoratedTopping) {
        super(decoratedTopping);
    }

    @Override
    public String getFood() {
        return super.getFood() + "Topping: Pork\n";
    }
}
