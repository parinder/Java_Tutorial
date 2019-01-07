/*
 Parameters used in First Java Program:
 
Let's see what is the meaning of class, public, static, void, main, String[], System.out.println().

class keyword is used to declare a class in java.

public keyword is an access modifier which represents visibility. It means it is visible to all.

static is a keyword. If we declare any method as static, it is known as the static method. The core advantage of the static method is that
there is no need to create an object to invoke the static method. The main method is executed by the JVM, so it doesn't require to create an 
object to invoke the main method. So it saves memory.

void is the return type of the method. It means it doesn't return any value.

main represents the starting point of the program.

String[] args is used for command line argument.

System.out.println() is used to print statement. Here, System is a class, out is the object of  PrintStream class, println() is the method of 
PrintStream class. 

*/

package Basic_Concepts;

public class first_Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hello Parinder, Welcome to java world !!!");

	}

}
