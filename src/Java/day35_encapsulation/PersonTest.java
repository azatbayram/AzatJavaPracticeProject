package Java.day35_encapsulation;

public class PersonTest {

	public static void main(String[] args) {
		
		Person p=new Person();
		
		p.setAge(20);
		
		System.out.println(p.getAge());
		
		
		//Encapsulation
		//cut the access - private
		//create setter method to initialize value
		//create getter method to retrive it

	}

}
