package Wrapper;
import java.util.Scanner;
public class Wrapper1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);   
		      System.out.print("Enter an integer: ");
		     int a = sc.nextInt();

		     if ((a >= 1) && (a <= 255)) {
		    	 String binary = String.format("%8s",Integer.toBinaryString(a)).replace(' ','0');
			        System.out.println("Binary:" + binary);
		           
		     }
		      else {
		    	  System.out.println("Invalid input.");
		     }
		        sc.close();
		   }
		}
