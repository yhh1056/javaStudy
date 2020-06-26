package objectCooperation;

/**
 * 클레스 설명
 * <p>
 * author {yhh1056}
 * Create by {2020/06/26}
 */
public class Subway implements Vehicle {
    private String number;
    private int fair = 1200;
    private int money;
    private int passenger;

    @Override
    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public void ridePassenger(int passenger) {
        this.passenger = passenger;
    }

    @Override
    public int getFair() {
        return this.fair;
    }

    @Override
    public void earn(int income) {
        this.money += income;
    }

    @Override
    public void showInfo() {
        System.out.println("승객 수는 " + passenger + "입니다.");
        System.out.println(number + "의 현재 수입은 " + this.money + "입니다.");
    }
}
