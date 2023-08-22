package Java.day18_readingUserInput;

import java.util.Scanner;

public class changeMaker {

    public static void main(String[] args) {

        Scanner x=new Scanner(System.in);
        System.out.println("Enter your money amount between 1-100 cents");

        for (int i=1; i<=3; i++) {

            int userNumber=x.nextInt();

            if (userNumber>=1 && userNumber<=100) {

                change(userNumber);
                break;
            }
            else {
                System.out.println("Invalid Data");
                if (i==3) {

                    System.out.println("you entered invalid data 3 times so you can not enter any data anymore");
                    break;
                }
                System.out.println("Try again");
            }

        }

		/*System.out.println("Enter your money amount between 1-100 cents");

		int userNumber=x.nextInt();

		if (userNumber>=1 && userNumber<=100) {

			change(userNumber);
		}
		else {
			System.out.println("Invalid Data");
		}
		*/

    }

    public static void change(int userNumber) {

        int quarters=userNumber/25;
        int dimes=(userNumber-(quarters*25))/10;
        int nickles=(userNumber-(quarters*25)-(dimes*10))/5;
        int pennies=userNumber-(quarters*25)-(dimes*10)-(nickles*5);

        System.out.println("Price in cents : " + userNumber);

        System.out.println("Your change is " +  quarters + " quarters, " + dimes + " dimes, " + nickles + " nickles, and " + pennies + " pennies" );
    }

}
