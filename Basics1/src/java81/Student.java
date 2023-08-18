package java81;

public class Student {
	private String name;
	private int id;
	private int age;
	private char section;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getSection() {
		return section;
	}

	public void setSection(char section) {
		this.section = section;
	}

	public Student(String name, int id, int age, char section) {
		super();
		this.name = name;
		this.id = id;
		this.age = age;
		this.section = section;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", age=" + age + ", section=" + section + "]";
	}

}
