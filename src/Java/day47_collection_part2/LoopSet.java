package Java.day47_collection_part2;

import java.util.HashSet;
import java.util.Set;

public class LoopSet {

	public static void main(String[] args) {
		
		Set<Integer> nums=new HashSet<>();
		nums.add(50);
		nums.add(543);
		nums.add(1150);
		nums.add(550);
		nums.add(570);
		nums.add(93);
		nums.add(5000);
		nums.add(950);
		
		for (Integer n : nums) {
			
			System.out.print(n + " | ");
			
		}
		
		System.out.println();
		
		nums.forEach(n -> System.out.print(n + " | "));

	}

}
