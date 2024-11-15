package in.raghab.beans;

import in.raghab.beans.service.IPrinter;

public class HPPrinter implements IPrinter {
	public HPPrinter() {
		super();
		System.out.println("HPPrinter::Constructor");
	}
	@Override
	public void print() {
		System.out.println("HPPrinter Printing...");
	}
}
