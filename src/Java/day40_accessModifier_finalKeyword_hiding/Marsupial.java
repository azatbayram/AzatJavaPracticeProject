package Java.day40_accessModifier_finalKeyword_hiding;

public class Marsupial {
	

	/*
	public boolean isBiped() {
		return false;
	}
	*/
	
	
	
	public static boolean isBiped() {
		return false;
	}
	
	
	public void getMarsupialDescription() {
		System.out.println("Marsupial walks on the two legs:" + isBiped());
	}


}
