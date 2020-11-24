package inheritence.example2;

/**
 * author {yhh1056}
 * Create by {2020/11/23}
 */
public class Main {
	public static void main(String[] args) {
		Student student = new Student("김학생", 24, 20141056);
		System.out.println(student);
		student.eat();
		student.sleep();
		student.study();

		System.out.println("===========");

		Person person = new Person("이학생", 25);
		System.out.println(person);
		person.sleep();
		person.eat();

		System.out.println("+==========");

		Person student2 = new Student("박학생", 25);
		System.out.println(student2);
		student2.toString();
		student2.sleep();
	}
}
