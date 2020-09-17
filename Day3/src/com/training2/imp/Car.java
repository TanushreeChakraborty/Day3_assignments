package com.training2.imp;

import com.training2.Automobile;

public class Car implements Automobile {

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "red";
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "dash";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 1234.00;
	}

}
