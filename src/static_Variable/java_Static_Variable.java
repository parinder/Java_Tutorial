/*
 * If you declare any variable as static, it is known as a static variable.
 * 
 * The static variable can be used to refer to the common property of all objects (which is not unique for each object), 
   for example, the company name, college name, etc.
   
 * The static variable gets memory only once in the class area at the time of class loading.
 * It makes your program memory efficient (i.e., it saves memory).
 */

package static_Variable;

public class java_Static_Variable {

	int id;
	String name;
	static String companyName = "Google";

	java_Static_Variable(int i, String n) {

		id = i;
		name = n;

	}
	
	public void display() {
		
		System.out.println(id+" "+name+" "+companyName);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		java_Static_Variable obj0=new java_Static_Variable(0001,"Parinder");
		java_Static_Variable obj1=new java_Static_Variable(0002,"Neet");
		obj0.display();
		obj1.display();
	}

}
