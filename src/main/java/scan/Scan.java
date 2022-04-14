package scan;

import java.util.Scanner;

public class Scan {
	
	private static Scanner myScan = new Scanner(System.in);
	
	public static void closeScan() {
		myScan.close();
	}
	
	public static double intScan() {
		return myScan.nextInt();
	}
	
	public static String stringScan() {
		return myScan.nextLine().toLowerCase();
		
	}
}
