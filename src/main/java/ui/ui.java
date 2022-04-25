package ui;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

import operators.Operators;
import scan.Scan;

public class Ui {
		
	private boolean eFlag=false;
	
	public Ui() {
		
	}
	
	public void run() {
		while (eFlag == false) {
			String selectOperation = getOperations();
			Operators operationType = new Operators();
			getResults(selectOperation, operationType);
			
			if (selectOperation.equals("e")) {
				eFlag = true;
			}
			else {
				eFlag = false;
			}
		}
	}
	
	public String getOperations() {
			boolean matchFound = false;
			String selection="";
			
			while (matchFound==false) {
				System.out.println("========================");
				System.out.println("Please select operators");
				System.out.println("========================");
				System.out.println("- (a) Add");
				System.out.println("- (s) Subtract");
				System.out.println("- (m) Multiply");
				System.out.println("- (d) Division");
				System.out.println("- (e) Exit");
				
				selection = Scan.stringScan();
				
				Pattern pattern = Pattern.compile("(a|s|m|d|e|)");
				Matcher matcher = pattern.matcher(selection);
				matchFound = matcher.find();
				
				if (matchFound == false) {					
					System.out.println("Invalid entry, please choose options 'a' or 's' or 'm' or 'd' or 'e' ");
				}
				
			}
				
			return selection;

	}
	
	public double getFirstNum() {
		System.out.println("Enter first number");
		double num = Scan.intScan();
		return num;
		
	}
	
	public double getSecondNum() {
		System.out.println("Enter second number");
		double num = Scan.intScan();
		return num;
	}
	
	public void getResults(String selection, Operators Operation) {
		switch(selection) {
		case "a":
			System.out.println("Results: "+ Operation.add(getFirstNum(), getSecondNum()));
			break;
		case "s":
			System.out.println("Results: "+Operation.subtract(Scan.intScan(), Scan.intScan()));
			break;
		case "m":
			System.out.println("Results: "+Operation.multiply(Scan.intScan(), Scan.intScan()));
			break;
		case "d":
			System.out.println("Results: "+Operation.division(Scan.intScan(), Scan.intScan()));
			break;
			
		case "e":
			System.out.println("Exiting Calculator App");
			break;
		}
	}
	
}
