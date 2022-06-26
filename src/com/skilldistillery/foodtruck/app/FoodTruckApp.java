package com.skilldistillery.foodtruck.app;

import com.skilldistillery.foodtruck.entities.FoodTruck;
import java.util.Scanner;

public class FoodTruckApp {


	public static void main(String[] args) {
		 FoodTruck[] fleetOfFoodTrucks = new FoodTruck[5];

		Scanner sc = new Scanner(System.in);
		String truckName;
		String truckType;
		int truckRating;
		FoodTruck foodTruck; 
		
		
		for (int i = 0; i < fleetOfFoodTrucks.length; i++) {

			System.out.println("Enter food truck's name...");
			truckName = sc.nextLine();
			if (truckName.equals("quit")) {
				break;
			}
			
			else {
			System.out.println("Enter food type served...");
			truckType = sc.nextLine();

			System.out.println("Enter food truck's rating (1-10)");
			truckRating = sc.nextInt();
			
			
			sc.nextLine();
			
			
			// collection of up to 5 food trucks
			
		   foodTruck = new FoodTruck(truckName, truckType, truckRating);
		   fleetOfFoodTrucks[i] = foodTruck;  
			}
		}
		
		boolean menu = true;
		
		while (menu = true) {
		System.out.println("\n To list all existing food trucks, type 1. \n To see the average rating of food trucks, type 2. \n To display the highest-rated food truck, type 3. \n To quit the program, type 4.");
		 int input = sc.nextInt()
				 
;
		 if (input == 1) {
			 for(int i = 0; i < fleetOfFoodTrucks.length; i++) {
				 if (fleetOfFoodTrucks[i] != null) {
				 System.out.println(fleetOfFoodTrucks[i].toString());
				 
			 }
				 }
		 }
		 
		 if (input == 2) {
			 int total = 0;
			 int divider = 0;
			 int averageRating = 0;
			 for (int i= 0; i < fleetOfFoodTrucks.length; i++) {
				 if (fleetOfFoodTrucks[i] != null) {
					 total += fleetOfFoodTrucks[i].getRating();
					 divider++;
				 }
				 averageRating = total/divider;
				 
				
			}
			 System.out.println("The average rating of these trucks is: " + averageRating);
			 
		 }
		 
		 
		 
		 if (input == 3) {
			 FoodTruck highestRating = new FoodTruck();
			 for (int i = 0; i < fleetOfFoodTrucks.length; i++) {
				 if (fleetOfFoodTrucks[i] != null) {
					 if (fleetOfFoodTrucks[i].getRating() > highestRating.getRating()) {
						 highestRating = fleetOfFoodTrucks[i]; 
						 
					 }
					 
				 }
			 }
				
			 System.out.println("The highest rated truck is: " + highestRating.toString());
		 }
		 
		 if (input == 4) {
			 System.out.println("Goodbye");
			 break;
		 }
		
		}
		sc.close();
	}

}
