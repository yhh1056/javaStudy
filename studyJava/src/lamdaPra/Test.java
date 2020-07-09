package lamdaPra;

/**
 * author {yhh1056}
 * Create by {2020/07/09}
 */
public class Test {
    public static void main(String[] args) {
        StringConcat stringConcat = (s, v) -> s + v;
        stringConcat.makeString("hello","lamda");

        MakeInt makeInt = (s, v) -> s * v;
        int lamdaInt = makeInt.inputInt(10, 20);
        System.out.println(lamdaInt);
    }

    @FunctionalInterface
    public interface StringConcat {

        String makeString(String s1, String s2);
    }

    @FunctionalInterface
    public interface MakeInt {
        Integer inputInt(int a, int b);

    }
}
