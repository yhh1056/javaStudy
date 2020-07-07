package collectionPra.hashmapEx;

/**
 * author {yhh1056}
 * Create by {2020/07/07}
 */
public class StudentTest {
    public static void main(String[] args) {
        StudentHashMap studentHashMap = new StudentHashMap();

        Student student = new Student(1, "yyy");
        Student student1 = new Student(2, "aaa");
        Student student2 = new Student(3, "yyy");

        studentHashMap.addStudent(student);
        studentHashMap.addStudent(student1);
        studentHashMap.addStudent(student2);

        studentHashMap.removeStudent(2);

        studentHashMap.showAll();

    }
}
