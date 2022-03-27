package model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CountryData {
	private ArrayList<Country> countries;

	public CountryData() {
		countries = new ArrayList<>();
		loadData();
	}
	
	public void loadData() {
		try {

			FileInputStream is;
			is = new FileInputStream(new File("data/countries.txt"));
			BufferedReader reader = new BufferedReader(new InputStreamReader(is));
			String line;
			line = reader.readLine();

			while ((line = reader.readLine()) != null) {
				String[] data = line.split(";");

				int[] medal = new int[6];
				for (int i = 1; i < data.length; i++) {
					medal[i - 1] = Integer.parseInt(data[i]);
				}
				countries.add(new Country(data[0], medal[0], medal[1], medal[2], medal[3], medal[4], medal[5]));
			}

		} catch (Exception e) {
			System.out.println("El archivo no existe");
		}
	}

	public void print1() {
		for (Country a : countries) {
			System.out.println(a.name + " " + a.getMaleGold() + " " + a.getMaleSilver() + " " + a.getMaleBronze());
		}
	}
	
	public void print2() {
		for (Country a : countries) {
			System.out.println(a.name + " " + a.getFemaleGold() + " " + a.getFemaleSilver() + " " + a.getFemaleBronze());
		}
	}
	
	public void print3() {
		for (Country a : countries) {
			System.out.println(a.name + " " + a.getGoldMedals() + " " + a.getSilverMedals() + " " + a.getBronzeMedals());
		}
	}

	public void sortByMaleMedals() {
		Collections.sort(countries, new Comparator<Country>() {

			@Override
			public int compare(Country A, Country B) {
				if(A.maleGold.compareTo(B.maleGold) == 0) {
					if(A.maleSilver.compareTo(B.maleSilver) == 0) {
						if(A.maleBronze.compareTo(B.maleBronze) == 0) {
							return A.name.compareTo(B.name);
						}else {
							if(A.maleBronze.compareTo(B.maleBronze) == 1) {
								return -1;
							}else {
								return 1;
							}
						}
					}else {
						if(A.maleSilver.compareTo(B.maleSilver) == 1) {
							return -1;
						}else {
							return 1;
						}
					}
				}else {
					if(A.maleGold.compareTo(B.maleGold) == 1) {
						return -1;
					}else {
						return 1;
					}
				}
			}
			
		});
	}
	
	public void sortByFemaleMedals() {
		Collections.sort(countries);
	}
	
	//BubbleSort adaptation
	public void sortByCountryMedals() {
		for(int j = 0; j<countries.size(); j++) {
			for (int i = 0; (i+1)<countries.size(); i++) {
				Country forward = countries.get(i+1);
				Country backward = countries.get(i);			
				if (forward.getGoldMedals() == backward.getGoldMedals()) {
					if (forward.getSilverMedals() == backward.getSilverMedals()) {
						if (forward.getBronzeMedals() == backward.getBronzeMedals()) {
							if(forward.getName().compareTo(backward.getName()) < 0) {
								//Swap when the forward name shall be before the backward name
								countries.set(i, forward);
								countries.set(i+1, backward);
							}
						} else {
							if (forward.getBronzeMedals() > backward.getBronzeMedals()) {
								//Swap when forward bronze medals > backward bronze medals
								countries.set(i, forward);
								countries.set(i+1, backward);
							}
						}
					} else {
						if (forward.getSilverMedals() > backward.getSilverMedals()) {
							//Swap when forward silver medals > backward silver medals
							countries.set(i, forward);
							countries.set(i+1, backward);
						}
					}
				} else {
					if (forward.getGoldMedals() > backward.getGoldMedals()) {
						//Swap when forward gold medals > backward gold medals
						countries.set(i, forward);
						countries.set(i+1, backward);
					}
				}
			}
		}
	}
	
}
