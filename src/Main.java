import Concrete.Food;
import Concrete.Rice;
import Decorator.BeefTopping;
import Decorator.PorkTopping;

public class Main {
    public static void main(String[] args){

        Food rice = new Rice();

        Food pork = new PorkTopping(new Rice());

        Food beef = new BeefTopping(pork);

        System.out.println("\nRice without any topping");
        System.out.println(rice.getFood());
        System.out.println("Total price: " + rice.getPrice());

        System.out.println("\nRice with Pork");
        System.out.println(pork.getFood());
        System.out.println("Total price: " + pork.getPrice());

        System.out.println("\nRice with Beef and Pork");
        System.out.println(beef.getFood());
        System.out.println("Total price: " + beef.getPrice());
    }
}
