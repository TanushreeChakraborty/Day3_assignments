package com.training2.imp;

import com.training2.Automobile;

public class Bike implements Automobile {

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "blue";
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "Pulsor";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 105000.00;
	}

}
