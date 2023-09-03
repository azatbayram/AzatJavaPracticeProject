package Java.day38_inheritance_part2;

public class FulltimeEmployee extends Employee{
	
	public void calculatePay(int hours, double rate) {
		double total=(hours*rate)*1.05;
		System.out.println("FulltimeEmployee total pay: " + total);
	}

}
