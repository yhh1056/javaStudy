package inheritence.example1;

/**
 * 클레스 설명
 * <p>
 * author {yhh1056}
 * Create by {2020/06/30}
 */
public class VipCustomer extends Customer {

	/**
	 * 초기화 블럭(initialization block)
	 * 클래스 초기화 블럭 : 클래스 변수의 복잡한 초기화에 사용된다. 클래스가 처음 로딩될 때 한번만 수행된다.
	 */
	static {
		System.out.println("JUit BeforEach가 이런 원리구나");
	}

	public VipCustomer(String name, int money) {
		super(name, money);
	}

	public void enterVip() {
		System.out.println("====vip 입장=====");
	}

	@Override
	public void buyProduct(int price) {
		super.bonusPoint += 2000;
		this.money -= price;
		System.out.println(name + " 회원님 " + bonusPoint + " 원이 적립됐습니다.");
		System.out.println("남은 금액은 " + money + "원 입니다.");
	}
}
