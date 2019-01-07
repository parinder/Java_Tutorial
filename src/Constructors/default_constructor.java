/*
 * A constructor is called "Default Constructor" when it doesn't have any parameter.
 * Rule: If there is no constructor in a class, compiler automatically creates a default constructor.
 
 * Q) What is the purpose of a default constructor?
 * The default constructor is used to provide the default values to the object like 0, null, etc., depending on the type.
 */

package Constructors;

public class default_constructor {

	int integer_ID;
	String Name;

	default_constructor() {

		System.out.println("I'm Default Constructor");
	}

	public void puposeOfDefault() {
		System.out.println(integer_ID + " " + Name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		default_constructor obj = new default_constructor();
		obj.puposeOfDefault();

	}

}