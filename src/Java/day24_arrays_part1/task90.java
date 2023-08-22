package Java.day24_arrays_part1;

public class task90 {

	public static void main(String[] args) {
		
		String[] carList= {"Honda", "Toyota", "Nissan", "BMW", "Mercedes", "Porsche"};
		boolean flag = false;
		
		for(int i=0;i<carList.length;i++) {
			
			
			if(carList[i].equals("Honda")) {
				
				flag=true;
				break;
			}
			
		}
		
		if(flag) {
			System.out.println("Found it");
		}else {
			System.out.println("Not found it ");
		}

	}

}
