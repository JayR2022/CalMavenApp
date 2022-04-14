package ui;


import operators.Operators;
import scan.Scan;

public class ui {
	
	public void run() {
		String selectOperation = getOperations();
		Operators Operation = new Operators();
		getResults(selectOperation, Operation);
		
	}
	
	public String getOperations() {
		
		try {
			System.out.println("========================");
			System.out.println("Please select operators");
			System.out.println("========================");
			System.out.println("- (a) Add");
			System.out.println("- (s) Subtract");
			System.out.println("- (m) Multiply");
			System.out.println("- (d) Division");
			
			return Scan.stringScan();
			
		} catch (Exception e) {
			System.out.println("Exception has occurred. Please refer to message -> "+e.getMessage());
		}
		return "";

	}
	
	public void getResults(String selectOperation, Operators Operation) {
		switch(selectOperation) {
		case "a":
			System.out.println("Results: "+ Operation.add(Scan.intScan(), Scan.intScan()));
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
		}
	}

}
