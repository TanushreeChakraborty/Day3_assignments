package com.training2.imp;

import com.training2.RentalAgency;

public class Furniture implements RentalAgency {
	
	int days;

	@Override
	public double getRentalValue() {
		// TODO Auto-generated method stub
		return 54329.00;
	}
	
	public void setDays(int days) {
		this.days=days;
		
	}

	@Override
	public int getDays() {
		// TODO Auto-generated method stub
		return this.days;
	}

}
