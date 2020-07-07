package collectionPra;

import java.util.ArrayList;


/**
 * author {yhh1056}
 * Create by {2020/07/07}
 */
public class StackPractice {
    ArrayList<String> arrayList = new ArrayList<>();

    public void push(String push) {
        arrayList.add(push);
    }

    public String pop() {
        int size = arrayList.size();
        if (size == 0) {
            return null;
        }
        return arrayList.remove(size - 1);
    }
}
