package classPra;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * author {yhh1056}
 * Create by {2020/07/06}
 */
public class ReflectionTest {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException,
            IllegalAccessException, InvocationTargetException, InstantiationException {

        Person person = new Person("yhh");
        System.out.println(person);

        Class c1 = Class.forName("classPra.Person");

        Class[] param = {String.class};
        Constructor con = c1.getConstructor(param);

        Object[] init = {"yhh1056"};
        Person personY = (Person) con.newInstance(init);

        System.out.println(personY);
    }
}
