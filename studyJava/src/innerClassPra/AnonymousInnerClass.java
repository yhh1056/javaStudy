package innerClassPra;

/**
 * author {yhh1056}
 * Create by {2020/07/09}
 */
class OutClass3 {

    Runnable runnable(int i) {

        return new Runnable() {
            @Override
            public void run() {
                System.out.println("익명이너");
                System.out.println("실행");
                System.out.println(i);

            }
        };
    }

    Runnable runner = new Runnable() {
        @Override
        public void run() {
            System.out.println("test");
        }
    };
}

public class AnonymousInnerClass {
    public static void main(String[] args) {
        OutClass3 outClass3 = new OutClass3();
        Runnable runnable = outClass3.runnable(50);
        runnable.run();

        outClass3.runner.run();
    }
}
