package ExceptionDemo;

public class ExceptDemo {

	public static void main(String[] args) {
		int x,a;
		try {
			x=0;
			a=22/x;
			System.out.println("This will be bypassed.");
		}
		catch(ArithmeticException e) {
			System.out.println("Division by zero.");
		}
		System.out.println("After catch statement");
	}
}
