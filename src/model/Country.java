package model;

public class Country implements Comparable<Country> {
	public String name;
	public Integer maleGold;
	public Integer maleSilver;
	public Integer maleBronze;
	public Integer femaleGold;
	public Integer femaleSilver;
	public Integer femaleBronze;
	public Integer goldMedals;
	public Integer silverMedals;
	public Integer bronzeMedals;
	

	public Country(String name, Integer maleGold, Integer maleSilver, Integer maleBronze, Integer femaleGold,
			Integer femaleSilver, Integer femaleBronze) {
		this.name = name;
		this.maleGold = maleGold;
		this.maleSilver = maleSilver;
		this.maleBronze = maleBronze;
		this.femaleGold = femaleGold;
		this.femaleSilver = femaleSilver;
		this.femaleBronze = femaleBronze;
		this.goldMedals = femaleGold + maleGold;
		this.silverMedals = femaleSilver + maleSilver;
		this.bronzeMedals = femaleBronze + maleBronze;
	}
	
	public Country() {}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getMaleGold() {
		return maleGold;
	}

	public void setMaleGold(Integer maleGold) {
		this.maleGold = maleGold;
	}

	public Integer getMaleSilver() {
		return maleSilver;
	}

	public void setMaleSilver(Integer maleSilver) {
		this.maleSilver = maleSilver;
	}

	public Integer getMaleBronze() {
		return maleBronze;
	}

	public void setMaleBronze(Integer maleBronze) {
		this.maleBronze = maleBronze;
	}

	public Integer getFemaleGold() {
		return femaleGold;
	}

	public void setFemaleGold(Integer femaleGold) {
		this.femaleGold = femaleGold;
	}

	public Integer getFemaleSilver() {
		return femaleSilver;
	}

	public void setFemaleSilver(Integer femaleSilver) {
		this.femaleSilver = femaleSilver;
	}

	public Integer getFemaleBronze() {
		return femaleBronze;
	}

	public void setFemaleBronze(Integer femaleBronze) {
		this.femaleBronze = femaleBronze;
	}
	
	public Integer getGoldMedals() {
		return goldMedals;
	}

	public void setGoldMedals(Integer goldMedals) {
		this.goldMedals = goldMedals;
	}

	public Integer getSilverMedals() {
		return silverMedals;
	}

	public void setSilverMedals(Integer silverMedals) {
		this.silverMedals = silverMedals;
	}

	public Integer getBronzeMedals() {
		return bronzeMedals;
	}

	public void setBronzeMedals(Integer bronzeMedals) {
		this.bronzeMedals = bronzeMedals;
	}

	@Override
	public int compareTo(Country t) {
		// TODO Auto-generated method stub
		if (this.femaleGold == t.getFemaleGold()) {
			if (this.femaleSilver == t.getFemaleSilver()) {
				if (this.femaleBronze == t.getFemaleBronze()) {
					return name.compareTo(t.getName());
				} else {
					if (this.femaleBronze > t.getFemaleBronze()) {
						return 1;
					} else {
						return -1;
					}
				}
			} else {
				if (this.femaleSilver > t.getFemaleSilver()) {
					return 1;
				} else {
					return -1;
				}
			}
		} else {
			if (this.femaleGold > t.getFemaleGold()) {
				return 1;
			} else {
				return -1;
			}
		}
	}
}
