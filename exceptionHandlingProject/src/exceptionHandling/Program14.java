package exceptionHandling;

import java.util.Scanner;

public class Program14 {
	public static void main(String[] args) {
		System.out.println("Program starts");
		Scanner sc=new Scanner(System.in);
		int[] a= {12,0,24,36};
		System.out.println("Enter 1st index:");
		int indx1=sc.nextInt();
		System.out.println("Enter 2nd index:");
		int indx2=sc.nextInt();
		try {
			System.out.println(a[indx1]);
			System.out.println(38/a[indx2]);
			System.out.println("try block ends");
		}catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {  // we can declare multiple exception on single catch block using pipeline symbol(|)
			System.out.println("Arithmetic Exception or Array index out of bound exception occured!");
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		
		System.out.println("Program ends...!");
	}

}
