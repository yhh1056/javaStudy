package singletonPractice;

/**
 * 클레스 설명
 * <p>
 * author {yhh1056}
 * Create by {2020/06/28}
 */
public class StudentWhoIsTakeExam {
    private static StudentWhoIsTakeExam studding = null;
    private StudentWhoIsTakeExam() {}

    public static StudentWhoIsTakeExam getStudding() {
        if(studding == null) {
            studding = new StudentWhoIsTakeExam();
        }
        System.out.println("공부만 해야한다");
        return studding;
    }
}
