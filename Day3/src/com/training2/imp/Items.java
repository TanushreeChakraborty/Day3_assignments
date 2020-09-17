package com.training2.imp;

import com.training2.RentalAgency;

public class Items {
	
	public RentalAgency getProduct(int key) {
		

		switch(key) {
		case 1:
			return new Computers();
		case 2:
			return new Furniture();
		default:
				return null;
		
		}
		
	}
	
	public double getCost(int days, double price) {
		double totalCost= days*price;
		return totalCost;
		
	}

}
