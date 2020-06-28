package staticVariableAndMethod;

/**
 *
 *
 * author {yhh1056}
 * Create by {2020/06/28}
 */
public class Main {
    public static void main(String[] args) {
        FirstNameYooByHouse student = new FirstNameYooByHouse();
        student.naming("hyeonHo");

        FirstNameYooByHouse teacher = new FirstNameYooByHouse();
        teacher.naming("da yeon");

        FirstNameYooByHouse babo = new FirstNameYooByHouse();
        teacher.naming("dtmdgkr123");

        student.showFullName();
        teacher.showFullName();
        babo.showFullName();                //show all()

        FirstNameYooByHouse.getHousePeopleNumber();

    }
}
