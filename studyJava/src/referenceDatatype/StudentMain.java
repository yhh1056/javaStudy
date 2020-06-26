package referenceDatatype;

/**
 * 클레스 설명
 * <p>
 * author {yhh1056}
 * Create by {2020/06/26}
 */
public class StudentMain {

    public static void main(String[] args) {
        Student yhh1056 = new Student();
        yhh1056.setStudent(1,"yhh1056");
        yhh1056.setSubject("국어", 80);
        yhh1056.setSubject("수학", 90);

        yhh1056.getInfo();
    }
}
