package genericPra;

/**
 * author {yhh1056}
 * Create by {2020/07/06}
 */
public class CoffeeTest {

    public static void main(String[] args) {
        Material<Water> espresso = new Material<>();
        Water water = new Water();

        espresso.fill(water);
        espresso.showBeverage();

        Material<Milk> espresso2 = new Material<>();
        Milk milk = new Milk();

        espresso2.fill(milk);
        espresso2.showBeverage();
    }
}
