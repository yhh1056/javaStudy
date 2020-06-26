package objectCooperation;

/**
 * 클레스 설명
 * <p>
 * author {yhh1056}
 * Create by {2020/06/26}
 */
public class Main {

    public static void main(String[] args) {
        Student yhh1056 = new Student("yhh1056", "3학년", 5000);
        Student osh1234 = new Student("osh123", "2학년", 4000);

        Bus busNumber15 = new Bus();
        busNumber15.setNumber("15번");

        Subway lineNumber3 = new Subway();
        lineNumber3.setNumber("3호선");

        yhh1056.ride(busNumber15);
        osh1234.ride(busNumber15);
        busNumber15.showInfo();

        yhh1056.ride(lineNumber3);
        lineNumber3.showInfo();

        yhh1056.showInfo();
        osh1234.showInfo();
    }
}
