package main;

import java.util.Scanner;

import model.Country;
import model.CountryData;

public class Main {
	public static void main (String [] args) {
		
		Scanner sc = new Scanner(System.in);
		CountryData maleData = new CountryData();
		CountryData femaleData = new CountryData();
		int n = sc.nextInt();
		/*
		for(int i = 0; i<n;i++) {
			String input = sc.next();
			String [] info = input.split(";");
			String name = info[0];
			String goldMale = info[1];
			String silverMale = info[2];
			String bronzeMale = info[3];
			
			maleData.countries.add(new Country(name, goldMale, silverMale, bronzeMale));
			maleData.sortByGold();
		}*/
		maleData.sortByGold();
		maleData.print();
		

		
	
	}
	

}
