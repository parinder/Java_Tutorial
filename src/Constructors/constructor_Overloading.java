/*
 * 
 */


package Constructors;

public class constructor_Overloading {
	
	int id;
	String name;
	String gender;

	//creating two arguments constructor   
	constructor_Overloading(int i, String n){
		
		id=i;
		name=n;
	}
	
	//creating two arguments constructor   
		constructor_Overloading(int i, String n, String g){
			
			id=i;
			name=n;
			gender=g;
		}
	
	//method to display the values
	public void display() {
		System.out.println(id+" "+name+" "+gender);
	} 
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		constructor_Overloading obj1=new constructor_Overloading(0001, "Parinder");
		constructor_Overloading obj=new constructor_Overloading(0001, "Parinder", "Male");
		obj1.display();
		obj.display();

	}

}
