package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class ProgramLambda {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>(); 

		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));
		
		
		//list.sort(new MyComparator()); // Solução 01
		
		//Solução 02
		/*Comparator<Product> comp = (p1, p2) -> {
			return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
		};
		Comparator<Product> comp = (p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
        */
		
		// SOLUCÃO 03
		list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));

		for (Product p : list) {
			System.out.println(p);
		}
	}
}
