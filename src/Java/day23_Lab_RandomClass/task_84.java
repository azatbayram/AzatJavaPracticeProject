package Java.day23_Lab_RandomClass;
import java.util.Random;

public class task_84 {

	public static void main(String[] args) {
		
        Random rn = new Random();
		
		for(int i=0;i<10;i++) {
			
			if(rn.nextInt(2)==0) {
				System.out.println("Tails");    //Tail=0 Heads=1
			}else {
				System.out.println("Heads");
			}
			
			
			
		}

	}

}
