import Concrete.Food;

public abstract class FoodToppingDecorator implements Food {
    protected Food decoratedTopping;

    public FoodToppingDecorator(Food decoratedTopping) {
        this.decoratedTopping = decoratedTopping;
    }

    @Override
    public String getFood() {
        return decoratedTopping.getFood();
    }
}