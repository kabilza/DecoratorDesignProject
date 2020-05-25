public class Main {
    public static void main(String[] args){

//        System.out.println("Test");
        Type rice = new Rice();
        Type food = new FoodToppingDecorator(rice);

        food.getType();
    }
}
