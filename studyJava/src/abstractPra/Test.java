package abstractPra;

/**
 * 추상화
 *
 * author {yhh1056}
 * Create by {2020/07/01}
 */
public class Test {
    public static void main(String[] args) {
        Customer customer = new Customer();
        Cafe kanyaCoffee = new KanyaCoffee();
        Cafe colombiaCoffee = new ColombiaCoffee();

        customer.oderCoffee(kanyaCoffee);
        customer.oderCoffee(colombiaCoffee);
    }
}
