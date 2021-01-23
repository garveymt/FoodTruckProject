package com.skilldistillery.foodtruck;

//import java.util.Scanner;
//import java.util.UUID;

public class FoodTruck {
//	private static final String foodTruckRating = null;
	String [] foodTruck = {"Fast and the Hungriest", "6 Wheelier Sandwich", "Taco Truck", "Fish On The Go", "One Stop Cookie Shop"};
	
public boolean foodTruckList(String whatWasInput, String[] foodTruck) {
	int i = 0;
	boolean foodTruckList = true;
	for(i = 0; i < 5; i++) {
		if(whatWasInput.equals("Next") || whatWasInput.equals("next")) {
			System.out.println(foodTruck[0]);
			System.out.println("To see more options enter \"Next\" or enter \"Quit\" to see ratings and to select a truck for food.");
		}
		if(whatWasInput.equals("Next") || whatWasInput.equals("next")) {
			System.out.println(foodTruck[0] + foodTruck[1]);
			System.out.println("To see more options enter \"Next\" or enter \"Quit\" to see ratings and to select a truck for food.");
		}
		if(whatWasInput.equals("Next") || whatWasInput.equals("next")) {
			System.out.println(foodTruck[0] + foodTruck[1] + foodTruck[2]);
			System.out.println("To see more options enter \"Next\" or enter \"Quit\" to see ratings and to select a truck for food.");
		}
		if(whatWasInput.equals("Next") || whatWasInput.equals("next")) {
			System.out.println(foodTruck[0] + foodTruck[1] + foodTruck[2] + foodTruck[3]);
			System.out.println("To see more options enter \"Next\" or enter \"Quit\" to see ratings and to select a truck for food.");
		}
		if(whatWasInput.equals("Next") || whatWasInput.equals("next")) {
			System.out.println(foodTruck[0] + foodTruck[1] + foodTruck[2] + foodTruck[3] + foodTruck[4]);
			System.out.println("To see more options enter \"Next\" or enter \"Quit\" to see ratings and to select a truck for food.");
		}
		else if (whatWasInput.equals("Quit") || whatWasInput.equals("quit")) {
			
		}
	}
	return foodTruckList;
}

public void foodTruckRating(String whatWasInput, char[] foodTruck) {
	int foodTruckRating;
	foodTruck[0] = (char) (foodTruckRating = 3);
		System.out.println(foodTruck[0] + "has a rating of" + (char)(foodTruckRating) + "out of 5 stars");
	foodTruck[1] = (char) (foodTruckRating = 4);
		System.out.println(foodTruck[1] + "has a rating of" + (char)(foodTruckRating) + "out of 5 stars");
	foodTruck[2] = (char) (foodTruckRating = 2);
		System.out.println(foodTruck[2] + "has a rating of" + (char)(foodTruckRating) + "out of 5 stars");
	foodTruck[3] = (char) (foodTruckRating = 1);
		System.out.println(foodTruck[3] + "has a rating of" + (char)(foodTruckRating) + "out of 5 stars");
	foodTruck[4] = (char) (foodTruckRating = 5);
		System.out.println(foodTruck[4] + "has a rating of" + (char)(foodTruckRating) + "out of 5 stars");
	
	
}
public void averageRating() {
	double average = 0;
	average = (3 + 4 + 2 + 1 + 5) / 5;
	System.out.println("The average rating of the food trucks is" + average);
}

}