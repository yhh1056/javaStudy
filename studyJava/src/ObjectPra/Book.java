package ObjectPra;

/**
 * 오브젝트 재정의 하기
 *
 * author {yhh1056}
 * Create by {2020/07/03}
 */
public class Book {
    int number;
    String name;
    String author;

    public Book(int number, String name, String author) {
        this.number = number;
        this.name = name;
        this.author = author;
    }

    @Override
    public String toString() {
        return "제목 : " + name + "\n작가 : " + author;
    }

    @Override
    public boolean equals(Object obj) {
        Book book = (Book) obj;
        return this.number == book.number;
    }

    @Override
    public int hashCode() {
        return number;
    }
}
