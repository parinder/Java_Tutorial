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

public class this_refer_current_class_instance_variable {

	int id;
	String name;
	String companyName;

	this_refer_current_class_instance_variable(int id, String name, String companyName) {
		
          // The this keyword can be used to refer current class instance variable. 
		 //  If there is ambiguity between the instance variables and parameters, this keyword resolves the problem of ambiguity.
		
		//NOTE: If local variables(formal arguments) and instance variables are different,
		//there is no need to use this keyword like in the following program:
		
		this.id = id;
		this.name = name;
		this.companyName = companyName;

	}

	public void display() {

		System.out.println(id + " " + name + "" + companyName);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		this_refer_current_class_instance_variable obj = new this_refer_current_class_instance_variable(0001,
				"Parinder", "Google");
		this_refer_current_class_instance_variable obj1 = new this_refer_current_class_instance_variable(0002, "Neet",
				"IBM");

		obj.display();
		obj1.display();

	}

}
