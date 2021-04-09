package model;
public class Person {
	//Attributes
	private String id = "";
	//Relations
	private Type types;
	//Methods
	public Person(String pId) {
		id = pId;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
}
