package doubles_and_booleans;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
 String Nickels=JOptionPane.showInputDialog(null, "HOW MANY NICKELS DO YOU HAVE?");
		// Convert their answer to an into using Integer.parseInt()
Integer.parseInt(Nickels);
		// Ask the user how many dimes they have, and convert their answer
String Dimes=JOptionPane.showInputDialog(null, "HOW MANY DIMES DO YOU HAVE?");
int dimes=Integer.parseInt(Dimes);
		// Ask the user how many quarters they have, and convert their answer
String Quarter=JOptionPane.showInputDialog(null, "HOW MANY QUARTERS DO YOU HAVE?");
		
int quarter=Integer.parseInt(Quarter);
//Calculate how much money the user has and save it in a double variable 
		// Tell the user how much money they have
     double money;
     money=0.05*Integer.parseInt(Nickels)+0.1*dimes+0.25*quarter;
     System.out.println(money);
	}
}

