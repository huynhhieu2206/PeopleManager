package advance.dev.model;

public class People {
	private String name;
	private int age;

	public  People(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// Getter and Setter methods
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}

	

	

	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
}
