package ui;


import operators.Operators;
import scan.Scan;

public class ui {
	
	
	private String selectOperation = "";
	private boolean eFlag=false;
	
	public void run() {
		
		while (eFlag == false) {
			selectOperation = getOperations();
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
		
			System.out.println("========================");
			System.out.println("Please select operators");
			System.out.println("========================");
			System.out.println("- (a) Add");
			System.out.println("- (s) Subtract");
			System.out.println("- (m) Multiply");
			System.out.println("- (d) Division");
			System.out.println("- (e) Exit");
			
			return Scan.stringScan();

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
