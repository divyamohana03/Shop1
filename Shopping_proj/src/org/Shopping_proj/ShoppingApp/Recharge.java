package org.Shopping_proj.ShoppingApp;

import java.util.Scanner;
class Recharge
{
	public static void Rchge() 
	{		Scanner sc=new Scanner(System.in);
			int Amount;
			System.out.println("Enter the amount to be recharged!");
			Amount=sc.nextInt();
			System.out.println("Your card is recharged.Acount Balance="+Amount);
	}
}