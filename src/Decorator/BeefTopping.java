import Concrete.Food;

public class BeefTopping extends FoodToppingDecorator {

    public BeefTopping(Food decoratedTopping) {
        super(decoratedTopping);
    }

    @Override
    public String getFood() {
        return super.getFood() + "Topping: Beef\n";
    }
}
