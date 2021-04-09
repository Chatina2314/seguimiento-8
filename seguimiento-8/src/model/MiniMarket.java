package model;
import java.time.LocalDate
import java.util.ArrayList;

public class MiniMarket {
	//Attributes
	private String name = "";
	//Relations
	private ArrayList<Person> persons;
	//Methods
	public MiniMarket(String pName) {
		name = pName;
		persons = new ArrayList<Person>();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}