package collectionPra.hashmapEx;

/**
 * author {yhh1056}
 * Create by {2020/07/07}
 */
public class Student {
    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return id + " " + name;
    }
}
