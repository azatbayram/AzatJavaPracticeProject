package Java.day40_accessModifier_finalKeyword_hiding;

import java.util.ArrayList;

public class FinalArrayList {

	public static void main(String[] args) {
		
		final ArrayList<String> colors=new ArrayList<>();
		
		colors.add("red");
		colors.add("green");
		System.out.println(colors.toString());
		
		//colors=new ArrayList<>();

	}

}
