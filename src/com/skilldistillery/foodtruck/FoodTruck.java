package com.skilldistillery.foodtruck;

//import java.util.Scanner;
//import java.util.UUID;

public class FoodTruck {
//	private static final String foodTruckRating = null;
	String [] foodTruck = {"Fast and the Hungriest", "6 Wheelier Sandwich", "Taco Truck", "Fish On The Go", "One Stop Cookie Shop"};
	String [] menuSelection = {"1", "2", "3", "4", "5"};
	private Object highestRated;

public void menuSelection() {
	System.out.println("Please Select an option");
	System.out.println("1. Food Truck List");
	System.out.println("2. Food Truck Rating");
	System.out.println("3. Average Rating");
	System.out.println("4. Menu of Selected Food Truck");
	System.out.println("5. Quit");
	
	if (menuSelection.equals("1")){
		foodTruckList(null, foodTruck);
	}
	if (menuSelection.equals("2")){
		foodTruckRating(null, null);
	}
	if (menuSelection.equals("3")){
		averageRating();
	}
	if (menuSelection.equals("4")){
		menuItems(foodTruck, null);
	}
	if (menuSelection.equals("5")){
		
	}
}
	
	
	
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
	if(whatWasInput.equals(foodTruck[0])) {
	foodTruck[0] = (char) (foodTruckRating = 3);
		System.out.println(foodTruck[0] + "has a rating of" + (char)(foodTruckRating) + "out of 5 stars");
	}
	if(whatWasInput.equals(foodTruck[1])) {
	foodTruck[1] = (char) (foodTruckRating = 4);
		System.out.println(foodTruck[1] + "has a rating of" + (char)(foodTruckRating) + "out of 5 stars");
	}
	if(whatWasInput.equals(foodTruck[2])) {
	foodTruck[2] = (char) (foodTruckRating = 2);
		System.out.println(foodTruck[2] + "has a rating of" + (char)(foodTruckRating) + "out of 5 stars");
	}
	if(whatWasInput.equals(foodTruck[3])) {
	foodTruck[3] = (char) (foodTruckRating = 1);
		System.out.println(foodTruck[3] + "has a rating of" + (char)(foodTruckRating) + "out of 5 stars");
	}
	if(whatWasInput.equals(foodTruck[4])) {
	foodTruck[4] = (char) (foodTruckRating = 5);
		System.out.println(foodTruck[4] + "has a rating of" + (char)(foodTruckRating) + "out of 5 stars");
	}
	if(whatWasInput.equals(highestRated)) {
		foodTruck[4] = (char) (foodTruckRating = 5);
		System.out.println(foodTruck[4] + "has a rating out of all the food trucks.");
	}
	else if(whatWasInput.equals("Quit") || whatWasInput.equals("quit")){
		System.out.println("Returning to main menu...");
	}
	
	
}
public void averageRating() {
	double average = 0;
	average = (3 + 4 + 2 + 1 + 5) / 5;
	System.out.println("The average rating of the food trucks is" + average);
}
public void menuItems(String[] foodTruck, String whatWasInput) {
	String menuItems = "";
	if(foodTruck[0].equals(menuItems)) {
		System.out.println("Waffles");
	}
	if(foodTruck[1].equals(menuItems)) {
		System.out.println("Sandwiches");
	}
	if(foodTruck[2].equals(menuItems)) {
		System.out.println("Tacos");
	}
	if(foodTruck[3].equals(menuItems)) {
		System.out.println("Fish");
	}
	if(foodTruck[4].equals(menuItems)) {
		System.out.println("Cookies");
	}
	else if(whatWasInput.equals("Quit") || whatWasInput.equals("quit")){
		System.out.println("Returning to main menu...");
	}
}
public void quit() {
	System.out.println("Quitting Application...");
}

}