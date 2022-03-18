package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CountryData {
	public ArrayList<Country> countries;

	public CountryData() {
		countries = new ArrayList<>();
		
		Country A = new Country("USA","10","15","17");
		Country B = new Country ("Rusia","10","21","17");
		Country C = new Country("China","1","4","4");
		Country D = new Country("Colombia","2","3","6");
		
		countries.add(A);
		countries.add(B);
		countries.add(C);
		countries.add(D);
	}

	public void print() {
		for (Country a : countries) {
			System.out.println(a.name + " " + a.gold + " " + a.silver + " " + a.bronze);
		}
	}

	public void sortByGold() {
		Collections.sort(countries, new Comparator<Country>() {

			@Override
			public int compare(Country A, Country B) {
				return A.gold.compareTo(B.gold);
			}
		});
	}

	public void sortByMedals() {
		Collections.sort(countries, new Comparator<Country>() {
			
			@Override
			public int compare(Country A, Country B) {
				return A.silver.compareTo(B.silver);
			}
		});
	}


}
