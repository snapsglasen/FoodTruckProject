package com.skilldistillery.foodtruck.entities;

public class FoodTruck {

private int ID;
private String name;
private String foodType;
private int rating;
private static int nextTruckID = 0;

	
	public FoodTruck (String name, String foodType, int rating) {
		this.ID = ++nextTruckID;
		this.name = name;
		this.foodType = foodType;
		this.rating = rating;
	}
	public FoodTruck() {
		
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFoodType() {
		return foodType;
	}
	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "FoodTruck [ID: " + ID + ", Name: " + name + ", Food type: " + foodType + ", Rating: " + rating + "]";
	}
	
	


}
