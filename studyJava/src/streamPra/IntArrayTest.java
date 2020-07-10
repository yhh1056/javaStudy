package streamPra;

import java.util.Arrays;

/**
 * author {yhh1056}
 * Create by {2020/07/09}
 */
public class IntArrayTest {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        int sum = Arrays.stream(arr).sum();
        int count = (int) Arrays.stream(arr).count();
        double average = Arrays.stream(arr).average().getAsDouble();

        System.out.println(sum);        //15
        System.out.println(count);      //5
        System.out.println(average);    //3.0
    }
}
