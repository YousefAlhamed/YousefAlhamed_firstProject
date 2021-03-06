
public class Student {

	private int id;
	private String name;
	private int age;

	public Student() {
		this.id = 0;
		this.name = null;
		this.age = 0;
	}

	public Student(int id, String n, int age) {
		this.id = id;
		name = n;
		this.age = age;
	}

	public int getId() {
		return id++;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return n;
	}

	public void setName(String name) {
		name = n;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
