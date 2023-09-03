package Java.day37_inheritance;

public class School {

	public static void main(String[] args) {
		
		Person person=new Person();
		Student student=new Student();
		
		person.name="Azat";
		person.age=26;
		person.gender='M';
		
		student.name="Guvanch";
		student.age=26;
		student.gender='M';
		
		student.studentID=12345;
		
		person.eat("steak");
		student.eat("pizza");
		
		student.code("Java");
		
		
		

	}

}
