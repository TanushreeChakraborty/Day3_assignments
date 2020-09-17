package com.training2.imp;

import com.training2.Automobile;
import java.util.*;

public class Application {

	public static void main(String[] args) {


Scanner sc=new Scanner(System.in);
int done=sc.nextInt();
 
while(done==1) {

	System.out.println("please give key\n");
	
	ShowRoom saiCars1=new ShowRoomNew();
int key=sc.nextInt();
Automobile selected=saiCars1.getProduct(key);

if(selected!=null)
saiCars1.printEstimate(selected);
else
	System.out.println("Invalid");

System.out.println("enter: 0 to terminate");
int entry =sc.nextInt();
done=entry;
}


 sc.close();
	}

}
