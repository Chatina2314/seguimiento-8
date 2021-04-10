package model;
public class Person {
	//Attributes
	private String id = "";
	//Relations
	private Type types;
	//Methods
	public Person(String pId,int pTypes) {
		id = pId;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Type getType() {
		return types;
	}
	public void setType(int pTypes) {
		if(pTypes==1) {
    		types = Type.TI;
    	}
    	else if(pTypes==2) {
    		types = Type.CC;
    	}
    	else if(pTypes==3) {
    		types = Type.PP;
    	}
    	else if(pTypes==4) {
    		types = Type.CE;
    	}
	}
}
