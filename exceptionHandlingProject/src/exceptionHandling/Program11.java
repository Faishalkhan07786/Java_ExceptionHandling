package exceptionHandling;

import java.util.Scanner;

public class Program11 {
	public static void main(String[] args) {
		System.out.println("Program Start");
		Scanner sc=new Scanner(System.in);
		int[] a= {12,0,24,36};
		int indx1=sc.nextInt();
		int indx2=sc.nextInt();
		try {
			System.out.println(a[indx1]/a[indx2]);
			//System.out.println();
		}catch(ArithmeticException ae) {  //we can use multiple catch with one try
			System.out.println("Arithmetic Exception");
			System.out.println(ae.getMessage());
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index out of bound Exception");
			System.out.println(e.getMessage());
		}catch(RuntimeException r) {
			System.out.println("Runtime Exception");
			System.out.println(r.getMessage());
			
		}catch(Exception e) {
			System.out.println("Exception");
			System.out.println(e.getMessage());
		}
		sc.close();
	}

}
