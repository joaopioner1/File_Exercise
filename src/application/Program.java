package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.entities.Product;

public class Program {
	
	public static void main(String[] args) {
		//Author: Joao Vitor Souza Pioner | Date: 21/05/2021
		//Last edition: 
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the path: ");
		String strPath = in.nextLine();
		
		System.out.print("How many products do you want to enter? ");
		int n = in.nextInt();
		
		Product[] vect = new Product[n];
		
		for (int i = 0; i < vect.length; i++) {
			System.out.println("-------------\nEnter product data:");
			System.out.println("QUANTITY,PRICE,NAME:");
			Integer quantity = in.nextInt();
			Double price = in.nextDouble();
			String name = in.nextLine();
			Product p = new Product(name, price, quantity);
			String[] item = String.valueOf(p).split(",");
		}
		
		
	}
}
