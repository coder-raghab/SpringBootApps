package com.raghab;

//Lazy Singleton Initialization
public class DateUtils {
	private static DateUtils dateUtils=null;
	
	//step-1:: make constructor as private
	private DateUtils() {
		System.out.println("DateUtils::Constructor");
	}
	
	//step-2:: create static method to give same object
	public static DateUtils getInstance() {
		if(dateUtils == null) {
			dateUtils=new DateUtils();
		}
		return dateUtils;
	}
}
