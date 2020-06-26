package referenceDatatype;

/**
 * 클레스 설명
 * <p>
 * author {yhh1056}
 * Create by {2020/06/26}
 */
public class Student {
    int id;
    String name;

    Subject subject;

    public Student() {
        subject = new Subject();
    }

    public void setStudent(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setSubject(String name, int score) {
        this.subject.name = name;
        this.subject.score = score;
    }

    public void getInfo() {
        System.out.println(name + " " + subject.name + " " + subject.score);
    }

}
