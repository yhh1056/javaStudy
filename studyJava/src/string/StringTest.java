package string;

/**
 * author {yhh1056}
 * Create by {2020/07/06}
 */
public class StringTest {

    public static void main(String[] args) {
        String hello = "hello";
        String world = "world";
        System.out.println(System.identityHashCode(hello)); // 출력값-> 2001049719

        String helloWorld = hello.concat(world);
        System.out.println(System.identityHashCode(helloWorld));  //출력값-> 1528902577

        StringBuilder stringBuilder = new StringBuilder("hello");
        System.out.println(System.identityHashCode(stringBuilder));    //출력값-> 1927950199
        stringBuilder.append("world");
        System.out.println(System.identityHashCode(stringBuilder));    //출력값-> 1927950199
    }
}
