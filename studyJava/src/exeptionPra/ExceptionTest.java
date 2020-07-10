package exeptionPra;

/**
 * author {yhh1056}
 * Create by {2020/07/10}
 */
public class ExceptionTest {
    public static void main(String[] args) {
        int[] arr = new int[5];

        try {
            for (int i = 0; i < arr.length + 1; i++) {
                System.out.println(arr[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
            System.out.println("예외가 발생했습니다.");
        }
        System.out.println("프로그램을 종료합니다.");
    }
}
