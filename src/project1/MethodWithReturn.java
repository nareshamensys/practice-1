package project1;

public class MethodWithReturn{ // always start class name with capital letter
	String printString()
	{
		return "returning Hard coded value";
	}
	
	int printInt()
	{
		int i = 20; //Variable scope is within method only
		return i; // returning through value
	}

	double printDouble(double d) // return type with parameter
	{
		return d;
	}
	float printfloat()
	{
		float f = 5.2f; // a float value should always end with f 
		return f;
	}
	
	public static void main(String[] args) {
		 MethodWithReturn m = new MethodWithReturn(); // creating an object to access the methods
		 String val = m.printString(); // as printString method returns a value, Created value to store the returned value
		 System.out.println(val);
		 System.out.println(m.printInt()); // can be printed directly
		 double d = 2.9773;
		 System.out.println(m.printDouble(d));
		 System.out.println(m.printfloat());// return float value

	}

}
