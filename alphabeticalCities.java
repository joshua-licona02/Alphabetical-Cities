package cis.vmi.edu;

import java.util.Scanner;

/*
 * Author: Joshua Licona
 * Purpose: order three cities in ascending order 
 */

public class alphabeticalCities {

	public static void main(String[]args) {
		
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Enter the first city: ");
		String city1 = scanner.nextLine();
		System.out.println("Enter the second city: ");
		String city2 = scanner.nextLine();
		System.out.println("Enter the third city: ");
		String city3 = scanner.nextLine();

		String temp;
		if ((city2.compareTo(city1) < 0) && (city2.compareTo(city3) < 0))
		{
			temp = city1;
			city1 = city2;
			city2 = temp;	
		}
		else if ((city3.compareTo(city1) < 0) && (city3.compareTo(city2) < 0))
		{
			temp = city1;
			city1 = city3;
			city3 = temp;
			
		}
		if (city3.compareTo(city2) < 0)
		{
			temp = city2;
			city2 = city3;
			city3 = temp;
		}

		System.out.println("The three cities in alphabetical order are " +
			city1 + ", " + city2 + ", and " + city3);
	}
}
