package objectCooperation;

/**
 * 클레스 설명
 * <p>
 * author {yhh1056}
 * Create by {2020/06/27}
 */
public interface Vehicle {
    void setNumber(String number);

    void ridePassenger(int passenger);

    int getFair();

    void earn(int income);

    void showInfo();
}
