package classPra;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * author {yhh1056}
 * Create by {2020/07/06}
 */

public class ClassTest {
    public static void main(String[] args) throws ClassNotFoundException {
        Class str = Class.forName("java.lang.String");

        System.out.println("String constructor 출력");
        Constructor[] constructors = str.getConstructors();
        for (Constructor con : constructors) {
            System.out.println(con);
        }

        System.out.println("String Method 출력");
        Method[] methods = str.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
    }
}
