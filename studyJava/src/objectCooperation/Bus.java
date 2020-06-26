package objectCooperation;

/**
 * 클레스 설명
 * <p>
 * author {yhh1056}
 * Create by {2020/06/26}
 */
public class Bus implements Vehicle {
    private String number;
    private int fair = 1000;
    private int balance;
    private int passenger;

    @Override
    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public void ridePassenger(int passenger) {
        this.passenger += passenger;
    }

    @Override
    public int getFair() {
        return this.fair;
    }

    @Override
    public void earn(int income) {
        this.balance += income;
    }

    @Override
    public void showInfo() {
        System.out.println("승객 수는 " + passenger + "입니다.");
        System.out.println(number + "버스의 현재 수입은 " + balance + "입니다.");
    }
}
