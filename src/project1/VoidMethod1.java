package project1;

public class VoidMethod1 {

	void printit() //void method
	{
		System.out.println("This is a void method and doesnt have return type");
	}
   void printName(String Name)
   {
	   System.out.println(Name);
   }
	
	public static void main(String[] args) { //main method: execution starts from here
		VoidMethod1 m = new VoidMethod1();  // creating an object to invoke the method 
		m.printit();  // calling method with object m
		m.printName("Method with Return type : Naresh");		

	}

}
