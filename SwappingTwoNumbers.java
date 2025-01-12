package Testing1;

public class SwappingTwoNumbers {

	public static void main(String[] args) {
		// swapping two numbers without 3rd Variables
		int x = 12;
		int y = 13;
	System.out.println("Numbers declared before Swapping : "+x +" "+y);
	x = x + y; //x=25
	y = x - y; //y=12
	x = x - y; //x=13
	System.out.println("Numbers displayed after swapping : "+x+" "+y);
	}

}
