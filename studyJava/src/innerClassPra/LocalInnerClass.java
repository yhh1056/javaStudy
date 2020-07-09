package innerClassPra;

/**
 * author {yhh1056}
 * Create by {2020/07/09}
 */
class OutClass2 {

    Runnable runnable(int i) {

        class MyRunnable implements Runnable {

            @Override
            public void run() {
                System.out.println("실행");
                System.out.println(i);
            }
        }
        return new MyRunnable();
    }
}

public class LocalInnerClass {
    public static void main(String[] args) {
        OutClass2 outClass2 = new OutClass2();
        outClass2.runnable(10).run();
    }

}
