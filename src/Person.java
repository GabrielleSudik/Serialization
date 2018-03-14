import java.io.Serializable;

// serialization is taking an object into binary data
// deserializing means taking binary data and turning it into an object
// we'll be working with objects of Person class, then serializing them

//you have two main methods in the WO and RO classes.
//java allows more than one main method, but you'll have to say which comes first

//here's just a simple class
//NOTE IMPLEMENTS SERIALIZABLE
//that's what allows it to be serialized
//and import the java.io

public class Person implements Serializable{
//notice the warning sign there?
	//click it and try the generate option.
	//it adds the static final long below.
	/**
	 * 
	 */
	private static final long serialVersionUID = 4801633306273802062L;
	//that constant was created using the eclipse warning menu
	//what is it? some code that makes sure the class that Reads corresponds to the class containing the long.
	//it's a (non-security) safety feature.
	
	//your code:	
	private int id;
	private String name;
	
	public Person(int id, String name){
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}
		
}

//prof says this is a complicated topic, but often in jon interviews.
