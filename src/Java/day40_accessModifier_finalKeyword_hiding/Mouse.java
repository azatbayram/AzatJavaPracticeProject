package Java.day40_accessModifier_finalKeyword_hiding;

public class Mouse extends Rodent {
	
	protected int tailLength=8;
	
	public void getMouseDetails() {

		System.out.println("tail: " + tailLength + " ,parentTail:" + super.tailLength);
	}

}
