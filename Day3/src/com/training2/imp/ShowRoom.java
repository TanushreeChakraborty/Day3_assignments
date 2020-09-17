package com.training2.imp;

import com.training2.Automobile;

public class ShowRoom {
	
	//factory method
	public Automobile getProduct(int key) {
		
		switch(key) {
		case 1:
			return new Bike();
		case 2:
			return new Car();
		default:
				return null;
		
		}
		
	}
	
	//polymorphism
	
	public void printEstimate(Automobile polyAuto) {
		
		System.out.println(polyAuto.getColor());
		System.out.println(polyAuto.getModel());
		
	}

}
