package Java.day36_StaticClassMembers;

public class Student {
	
	String name;
	int age;
	int idNumber;
	static String school;
	
	public Student(String name, int age, int idNumber) {
		super();
		this.name = name;
		this.age = age;
		this.idNumber = idNumber;
	}

	
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", idNumber=" + idNumber + ", school=" + school + "]";
	}
	
	
	
	

}
