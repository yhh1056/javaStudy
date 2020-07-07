package collectionPra;

import java.util.LinkedList;
import java.util.Queue;

/**
 * author {yhh1056}
 * Create by {2020/07/07}
 */
public class QueueTest {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int i = 0; i < arr.length; i++) {
            queue.offer(arr[i]);
        }
        System.out.println(queue.contains(10));
        System.out.println(queue.peek()); //가장 첫 번째 값 반환
        System.out.println(queue.poll()); //삭제하고 삭제한 값을 반환
        System.out.println(queue);
    }
}
