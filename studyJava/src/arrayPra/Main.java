package arrayPra;

import java.util.ArrayList;
import java.util.List;

/**
 * 얇은 복사와 깊은 복사
 * author {yhh1056}
 * Create by {2020/06/28}
 */
public class Main {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {10, 20, 30, 40, 50};
        System.out.println(arr2);               //출력값 I@77459877    얕은 복사;

        System.arraycopy(arr1, 0, arr2, 0, 5);

        System.out.println(arr2);               //출력값 I@77459877    얕은 복사;

        arr2 = arr1.clone();

        System.out.println(arr2);               //출력값 I@5b2133b1    깊은 복사;
        System.out.println("--------------");

        List<Book> bookList = new ArrayList<>();
        Book book1 = new Book("해리포터", "롤링");
        Book book2 = new Book("해리포터", "롤링");
        Book book3 = new Book("해리포터", "롤링");
        Book book4 = new Book("해리포터", "롤링");
        Book book5 = new Book("해리포터", "롤링");

        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        bookList.add(book4);
        bookList.add(book5);

        System.out.println(bookList);

        System.out.println("-----");

        List<Book> deepCopyBookList = new ArrayList<>();
        deepCopyBookList.add(0, new Book(book1.getName(), book1.getAuthor()));
        deepCopyBookList.add(1, new Book(book1.getName(), book1.getAuthor()));
        deepCopyBookList.add(2, new Book(book1.getName(), book1.getAuthor()));
        deepCopyBookList.add(3, new Book(book1.getName(), book1.getAuthor()));
        deepCopyBookList.add(4, new Book(book1.getName(), book1.getAuthor()));
        System.out.println(deepCopyBookList);
    }
}

