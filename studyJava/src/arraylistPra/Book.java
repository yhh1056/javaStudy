package arraylistPra;

import java.util.*;

/**
 * 클레스 설명
 * <p>
 * author {yhh1056}
 * Create by {2020/06/29}
 */
public class Book {
    public static void main(String[] args) {
        ArrayList<String> bookList = new ArrayList<>();
        bookList.add("객체지향의 오해와 진실");
        bookList.add("justice");
        bookList.add("Harry potter");

        Iterator<String> iterator = bookList.iterator();

        while (iterator.hasNext()) {
            String newBookList = iterator.next();
            if (newBookList.contains("justice")) {
                iterator.remove();
            }
            System.out.println(newBookList);
        }
        System.out.println(bookList);
        //출력 값 : [객체지향의 오해와 진실, Harry potter]
    }
}
