package collectionPra;

import java.util.Stack;

/**
 * author {yhh1056}
 * Create by {2020/07/07}
 */
public class StackTest {
    public static void main(String[] args) {
        StackPractice stackpractice = new StackPractice();
        stackpractice.push("A");
        stackpractice.push("B");
        stackpractice.push("C");

        System.out.println(stackpractice.pop());
        System.out.println(stackpractice.pop());
        System.out.println(stackpractice.pop());

        System.out.println("===stack===");

        Stack<Integer> stack = new Stack<>();

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }
        stack.pop();
        System.out.println(stack.peek());
        System.out.println(stack);
        System.out.println(stack.search(10));

        while (!stack.empty()) {
            stack.pop();
        }
        System.out.println(stack);
    }
}
