package Java.day27_array_lab;

public class Lab4_Question3 {

	public static void main(String[] args) {
		
		int[] x= {1,2,3};
		int[] y= {7,3};
		
		int[] x1= {1,2,3};
		int[] y1= {7,3,2};
		
		int[] x2= {1,2,3};
		int[] y2= {1,3};
		
		int[] x3= {1};
		int[] y3= {7,3};
		
		int[] x4= {1,2,3};
		int[] y4= {1};
		
		checkTwoArraysLength(x,y);
		checkTwoArraysLength(x1,y1);
		checkTwoArraysLength(x2,y2);
		checkTwoArraysLength(x3,y3);
		checkTwoArraysLength(x4,y4);
		
	}

	public static void checkTwoArraysLength(int[] array1, int[] array2) {
		
		if(array1.length>1) {
			
			if(array2.length>1) {
				
				if(array1[0]==array2[0] || array1[array1.length-1]==array2[array2.length-1]) {
					System.out.println(true);
				}
				else {
					System.out.println(false);
				}
			}
			else {
				System.out.println("Array2 is not valid");
			}
			
		}
		else {
			System.out.println("Array1 is not valid");
		}
		
	}

}
