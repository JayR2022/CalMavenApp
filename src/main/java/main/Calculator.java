package main;

import ui.ui;
import scan.Scan;
public class Calculator {
	
	public static void main(String[] args) {
		ui calcUi = new ui();
		calcUi.run();
		Scan.closeScan();
		}
}
			
