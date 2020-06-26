package objectCooperation;

/**
 * 클레스 설명
 * <p>
 * author {yhh1056}
 * Create by {2020/06/26}
 */
public class Student {
    private String name;
    private String grade;
    private int money;
    private int passengerNumber = 1;

    public Student(String name, String grade, int money) {
        this.name = name;
        this.grade = grade;
        this.money = money;
    }

    public void showInfo() {
        System.out.println(name + " " + grade + " " + money);
    }

    public void ride(Vehicle vehicle) {
        this.money -= vehicle.getFair();
        vehicle.earn(vehicle.getFair());
        vehicle.ridePassenger(passengerNumber);
    }
}
