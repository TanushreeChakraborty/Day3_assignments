package com.training2.imp;

import com.training2.Automobile;

public class ShowRoomNew extends ShowRoom {
	
	//factory method
		public Automobile getProduct(int key) {
			
			if(key==3)
				return new Tracktor();
			else
				return super.getProduct(key);
			//return null;
			
		}
		
		/*public void printEstimate(Automobile polyAuto) {
			
			System.out.println(polyAuto.getColor());
			System.out.println(polyAuto.getModel());
			
		}
*/

}
