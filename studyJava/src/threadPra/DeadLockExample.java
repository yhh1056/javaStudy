package threadPra;

/**
 * @author yhh1056
 * @since 2021/01/23
 */
public class DeadLockExample {

    public static void main(String[] args) {
        String down = "down";
        String up = "up";

        Thread thread1 = new Thread(() -> {
            synchronized (down) {
                System.out.println("내려가는거 락 걸어놨어");
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                }

                synchronized (up) {
                    System.out.println("올라가는 중");
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            synchronized (up) {
                System.out.println("올라가는거 락 걸어놨어");
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                }

                synchronized (down) {
                    System.out.println("내려가는 중");
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}
