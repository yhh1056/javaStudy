package inheritence.example2;

/**
 * author {yhh1056}
 * Create by {2020/11/23}
 */

public class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void eat() {
		System.out.println("먹는다");
	}

	public void sleep() {
		System.out.println("잠을 잔다");
	}

	public String toString() {
		return "이름 : " + name + ", 나이 : " + age;
	}
}
