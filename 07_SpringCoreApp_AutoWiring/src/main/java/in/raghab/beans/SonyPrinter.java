package in.raghab.beans;

import in.raghab.beans.service.IPrinter;

public class SonyPrinter implements IPrinter {

	public SonyPrinter() {
		super();
		System.out.println("SonyPrinter::Constructor");
	}
	@Override
	public void print() {
		System.out.println("SonyPrinter Printing...");
	}
	
}
