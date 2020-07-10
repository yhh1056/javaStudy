package streamPra;

import java.util.ArrayList;

/**
 * author {yhh1056}
 * Create by {2020/07/09}
 */
public class ArrayListStreamTest {

    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("yhh1056");
        nameList.add("pmj9292");
        nameList.add("dhtmdgkr123");

        nameList.stream().sorted().forEach(s -> System.out.print(s + " "));             //dhtmdgkr123 pmj9292 yhh1056
        System.out.println();                                                           //개행

        nameList.stream().map(l -> l.length()).forEach(s -> System.out.print(s + " ")); //7 7 11
    }
}
