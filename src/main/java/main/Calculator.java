package main;

import ui.Ui;
import scan.Scan;
public class Calculator {
	
	public static void main(String[] args) {
		Ui calcUi = new Ui();
		calcUi.run();
		Scan.closeScan();
		}
}
			
