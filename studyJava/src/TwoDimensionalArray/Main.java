package TwoDimensionalArray;

/**
 * 이차원 배열;
 * <p>
 * author {yhh1056}
 * Create by {2020/06/29}
 */
public class Main {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {4, 5, 6, 7}};
        System.out.println(array.length);       // 2
        System.out.println(array[0].length);    // 3
        System.out.println(array[1].length);    // 4

        for(int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j ++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        // 1 2 3
        // 4 5 6 7
    }
}
