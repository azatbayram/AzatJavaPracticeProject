package Java.day36_StaticClassMembers;

public class StudentTest {

	public static void main(String[] args) {
		
		Student s1=new Student("Azat", 26, 1000);
		Student s2=new Student("Bilal", 30, 1200);
		Student s3=new Student("Ozzy", 29, 1500);
		
		s1.school="CybertekEU5";
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
		

	}

}
