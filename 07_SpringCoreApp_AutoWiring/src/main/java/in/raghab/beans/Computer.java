package in.raghab.beans;

import in.raghab.beans.service.IPrinter;

public class Computer {
	private IPrinter printer;
	
	
	public Computer() {
		System.out.println("Computer::Constructor");
	}
	public void setPrinter(IPrinter printer) {
		this.printer = printer;
	}
	public void printRequest() {
		System.out.println("Pdf printing requesting...");
		printer.print();
	}
	
	
}
