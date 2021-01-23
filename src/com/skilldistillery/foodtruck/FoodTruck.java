package com.skilldistillery.foodtruck;

import java.util.Scanner;
import java.util.UUID;

public class FoodTruck {
	int i = 0;
	String [] foodTruck = {"Fast and the Hungriest", "6 Wheelier Sandwich", "Taco Truck", "Fish On The Go", "One Stop Cookie Shop"};
	
public boolean foodTruckList(String whatWasInput, String[] foodTruck) {
	boolean foodTruckList = true;
	for(i = 0; i < 5; i++) {
		if(whatWasInput.equals("Next") || whatWasInput.equals("next")) {
			System.out.println(foodTruck[0] + foodTruck[1]);
		}
		if(whatWasInput.equals("Next") || whatWasInput.equals("next")) {
			System.out.println(foodTruck[0] + foodTruck[1] + foodTruck[2]);
		}
		if(whatWasInput.equals("Next") || whatWasInput.equals("next")) {
			System.out.println(foodTruck[0] + foodTruck[1] + foodTruck[2] + foodTruck[3]);
		}
		if(whatWasInput.equals("Next") || whatWasInput.equals("next")) {
			System.out.println(foodTruck[0] + foodTruck[1] + foodTruck[2] + foodTruck[3] + foodTruck[4]);
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
	
}

}