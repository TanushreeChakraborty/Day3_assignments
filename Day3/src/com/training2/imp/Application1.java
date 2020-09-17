package com.training2.imp;

import com.training2.RentalAgency;

public class Application1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Items item=new Items();
		int key=Integer.parseInt(args[0]);
		RentalAgency selected=item.getProduct(key);
		selected.setDays(5);
		double cost=item.getCost(selected.getDays(), selected.getRentalValue());
		System.out.println("total cost:"+cost);

	}

}
