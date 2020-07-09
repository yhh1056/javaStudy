package innerClassPra;

/**
 * author {yhh1056}
 * Create by {2020/07/08}
 */
class OutClass {

    class InnerClass {
        private int num = 10;

        public void showInnerClass() {
            System.out.println(num);
            System.out.println("이너 클래스");
        }

        public void thisIsOutClassMethodAndShowInnerClassMethod() {
            showInnerClass();
        }

    }

    static class StaticInnerClass {
        private static int NUM = 15;

        public void showStaticInnerClass() {
            System.out.println(NUM);
        }
    }



}
public class innerClassPra {

    public static void main(String[] args) {
        OutClass.InnerClass outClass = new OutClass().new InnerClass();
        outClass.showInnerClass();

        outClass.thisIsOutClassMethodAndShowInnerClassMethod();

        OutClass.StaticInnerClass innerClass = new OutClass.StaticInnerClass();
        innerClass.showStaticInnerClass();

    }
}
