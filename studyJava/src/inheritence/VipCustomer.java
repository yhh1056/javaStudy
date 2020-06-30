package inheritence;

/**
 * 클레스 설명
 * <p>
 * author {yhh1056}
 * Create by {2020/06/30}
 */
public class VipCustomer extends Customer {
    int bonusPoint;

    public VipCustomer(String name, int money) {
        super(name, money);
    }
    @Override
    public void buyProduct(int price) {
        bonusPoint += 2000;
        this.money -= price;
        System.out.println(name + " 회원님 " + bonusPoint + " 원이 적립됐습니다.");
        System.out.println("남은 금액은 " + money + "원 입니다.");
    }
    @Override
    public void checkBonusPoint() {
        System.out.println(this.bonusPoint);
    }
}
