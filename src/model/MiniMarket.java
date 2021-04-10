package model;
import java.time.LocalDate;
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
	public Person searchPerson(String id){
		Person searchPerson = null;
	    boolean find = false;
	    for (int i=0;i<persons.size()&&!find==false;i++){
			Person person = persons.get(i);
			if (person.getId().equals(id)){
				searchPerson = persons.get(i);
				find = true;
			}
		}
			return searchPerson;
	}
	
}