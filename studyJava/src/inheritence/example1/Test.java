package inheritence.example1;

/**
 * 상속
 *
 * author {yhh1056}
 * Create by {2020/06/30}
 */
public class Test {

    public static void main(String[] args) {
        Customer yhh1004 = new Customer("현호", 50000);
        yhh1004.buyProduct(2000);

        yhh1004.checkBonusPoint();

        VipCustomer vipCustomer = new VipCustomer("김부자", 100000);
        vipCustomer.enterVip();
        vipCustomer.buyProduct(100000);
        vipCustomer.checkBonusPoint();

        Customer vipCustomer2 = new VipCustomer("박부자", 40000);
        ((VipCustomer) vipCustomer2).enterVip();
        vipCustomer2.buyProduct(25000);
        vipCustomer2.checkBonusPoint();
    }
}
