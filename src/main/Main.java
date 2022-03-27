package main;

import model.CountryData;

public class Main {
	public static void main(String [] args) {
		
		CountryData data = new CountryData();
		
		System.out.println("Masculino");
		data.sortByMaleMedals();
		data.print1();
		System.out.println("----------");
		
		System.out.println("Femenino");
		data.sortByFemaleMedals();
		data.print2();
		System.out.println("----------");
		
		System.out.println("Combinado");
		data.sortByCountryMedals();
		data.print3();
		
	}
	
	
	
}
