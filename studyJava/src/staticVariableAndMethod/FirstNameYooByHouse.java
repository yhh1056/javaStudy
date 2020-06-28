package staticVariableAndMethod;

/**
 * 스태틱 답게 사용해보자
 *
 * author {yhh1056}
 * Create by {2020/06/28}
 */
public class FirstNameYooByHouse {
    public static int housePeopleNumber = 0;
    private static final String firstName = "yoo";            //static variable
    private String name;

    public FirstNameYooByHouse() {
        this.housePeopleNumber++;
    }

    public void naming(String name) {
        this.name = name;
    }

    public void showFullName() {
        System.out.println(this.firstName + " " +name);
    }

    public static void getHousePeopleNumber() {
        System.out.println(housePeopleNumber);
    }
}
