package Java.day24_arrays_part1;

import java.util.Random;
import java.util.Scanner;

public class task88 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Random rn=new Random();
		
		String[] carName=new String[7];
		
		carName[0]="Honda";
		carName[1]="Toyota";
		carName[2]="Nissan";
		carName[3]="BMW";
		carName[4]="Mercedes";
		carName[5]="Porsche";
		carName[6]="Ferrari";
		
		System.out.println("Enter an index number between 0-6 to choose your dream car");
		int index=sc.nextInt();
		int price;
		
		if(index>=0 && index<=2) {
			
			price=rn.nextInt(20001)+20000;
			System.out.println("Car name is " + carName[index] + " price: $" + price);
		}
		else if(index==3 || index==4) {
			
			price=rn.nextInt(30001)+50000;
			System.out.println("Car name is " + carName[index] + " price: $" + price);
		}
		else if(index==5 || index==6) {
			
			price=rn.nextInt(50001)+100000;
			System.out.println("Car name is " + carName[index] + " price: $" + price);
		}
		else {
			System.out.println("Invalid index");
		}
		

	}

}
