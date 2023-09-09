package Java.day48_collection_part3;

import Java.day46_collection_part1.Product;


import java.util.HashSet;
import java.util.Set;

public class HashSetsOfProducts {

	public static void main(String[] args) {
		
		Set<Product> prodSet=new HashSet<>();
		
		prodSet.add(new Product("book",25.99));
		prodSet.add(new Product("book", 17.99));
		prodSet.add(new Product("book", 7.99));
		
		System.out.println(prodSet.toString());
		
		for (Product product : prodSet) {
			
			System.out.println(product.getPrice());
			
		}
		
		prodSet.forEach(p -> System.out.println(p));
		
		
		

	}

}
