/*
 * If you apply static keyword with any method, it is known as static method.

A static method belongs to the class rather than the object of a class.

A static method can be invoked without the need for creating an instance of a class.

A static method can access static data member and can change the value of it.

 */

package static_Variable;

public class static_method {

	int id;
	String name;
	static String companyName = "Google";

	static_method(int i, String n) {

		id = i;
		name = n;

	}

	// static method to change the value of static variable
	// A static method can access static data member and can change the value of it.
	public static void change() {

		static_method.companyName = "NTT Data Service";
	}

	public void display() {

		System.out.println(id + " " + name + " " + companyName);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// A static method can be invoked without the need for creating an instance of a
		// class.
		static_method.change();

		static_method obj0 = new static_method(0001, "Parinder");
		static_method obj1 = new static_method(0002, "Neet");
		obj0.display();
		obj1.display();
	}

}
