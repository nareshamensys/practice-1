package interface1;

public class Interface2 implements Interface {

	@Override
	public void car() {              // must implement the unimplemented methods 
		
		System.out.println("volvo");
	}

	@Override
	public void carColor() {
		
		System.out.println("Red");
	}
	public static void main(String[] args) {
		Interface2 obj = new Interface2();
		System.out.print("Name of the car:" );
		obj.car();
		System.out.print("Color: ");
		obj.carColor();
		
		
	}

}