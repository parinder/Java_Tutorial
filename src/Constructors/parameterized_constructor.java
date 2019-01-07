/*
 * A constructor which has a specific number of parameters is called a parameterized constructor.
 * The parameterized constructor is used to provide different values to the distinct objects. However, you can provide the same values also.
 */


package Constructors;

public class parameterized_constructor {
	
	int id;
	String name;
	
	//creating a parameterized constructor  
	parameterized_constructor(int i, String n){
		
		id=i;
		name=n;
	}
	
	//method to display the values
	public void display() {
		System.out.println(id+" "+name);
	} 
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		parameterized_constructor obj=new parameterized_constructor(0001, "Parinder");
		obj.display();

	}

}
