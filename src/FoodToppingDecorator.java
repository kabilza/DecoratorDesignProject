public class FoodToppingDecorator extends Food {
//    public abstract String getDescription ();

    public FoodToppingDecorator(Type decoratedType) {
        super(decoratedType);
    }

    @Override
    public void getType() {
        decoratedType.getType();
        getTopping();
    }

    private void getTopping() {
        System.out.println("Topping: Pork");
    }
}