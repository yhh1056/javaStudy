package inheritence.example2;

/**
 * author {yhh1056}
 * Create by {2020/11/23}
 */
public class Student extends Person {
	private int studentId;

	public Student(String name, int age) {
		super(name, age);
	}

	public Student(String name, int age, int studentId) {
		super(name, age);
		this.studentId = studentId;
	}

	public void study() {
		System.out.println("공부합니다.");
	}
}
