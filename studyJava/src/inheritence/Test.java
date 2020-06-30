package inheritence;

/**
 * 클레스 설명
 * <p>
 * author {yhh1056}
 * Create by {2020/06/30}
 */
public class Test {

    public static void main(String[] args) {
        Customer yhh1004 = new Customer("현호", 50000);
        yhh1004.buyProduct(2000);
        yhh1004.buyProduct(40000);

        yhh1004.checkBonusPoint();

        System.out.println("====vip 입장=====");
        VipCustomer asdf = new VipCustomer("호갱님", 100000);
        asdf.buyProduct(100000);
        asdf.checkBonusPoint();
        System.out.println("======");

        Customer asdff = new VipCustomer("tester", 40000);
        asdff.buyProduct(2000);
        asdff.checkBonusPoint();
    }
}
