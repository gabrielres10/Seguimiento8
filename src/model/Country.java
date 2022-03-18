package model;

public class Country{
	
	public String name;
	public String gold;
	public String silver;
	public String bronze;
	
	public Country(String name, String gold, String silver, String bronze) {
		this.name = name;
		this.gold = gold;
		this.silver = silver;
		this.bronze = bronze;
	}
	
	public void setOnClick(Clickeable c) {
		c.onClick("a", "b");
	}
	
}
