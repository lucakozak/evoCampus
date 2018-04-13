package Costumer;
import java.util.Scanner;

import Costumer.*;

public class CostumerRun {

	private static Scanner input;
	private static String tax;

	public static void main(String args[]) {
		
		Costumer c1 = new Costumer();

		System.out.println("Name: ");
        input = new Scanner(System.in);
        String name = input.nextLine();
        
		
		do{
        	System.out.println("Tax: ");
    		tax = input.nextLine();
		}while 
			(! tax.matches("[0-9]{11}"));
        
        
		String shopNumber = input.nextLine();
		
		String myString = shopNumber ;
		int foo = Integer.parseInt(myString);
		
		System.out.println("Regular costumer: " + c1.getRegularCostumer());
		
		
        System.out.println(name);
        
        
        

    }
}