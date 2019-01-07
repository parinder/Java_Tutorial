/*
 * There can be a lot of usage of java this keyword. In java, this is a reference variable that refers to the current object.
 
 * this can be used to refer current class instance variable    
 * this can be used to invoke current class method (implicitly)
 * this() can be used to invoke current class constructor.
 * this can be passed as an argument in the method call.
 * this can be passed as argument in the constructor call.
 * this can be used to return the current class instance from the method.
 
 */

package this_Keyword;

public class this_invoke_current_class_method {

	int id;
	String name;
	String companyName;

	this_invoke_current_class_method(int id, String name, String companyName) {

		this.id = id;
		this.name = name;
		this.companyName = companyName;

	}

	public void invoke() {

		System.out.println(id + " " + name + "" +" "+companyName);
	}
	
	//You may invoke the method of the current class by using the this keyword.
	//If you don't use the this keyword, compiler automatically adds this keyword while invoking the method.
	
	public void callmethod() {
		this.invoke();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		this_invoke_current_class_method obj = new this_invoke_current_class_method(0001, "Parinder", "Google");
		this_invoke_current_class_method obj1 = new this_invoke_current_class_method(0002, "Neet", "IBM");

		obj.callmethod();
		obj1.callmethod();

	}

}
