package exceptionHandling;

import java.util.Scanner;

public class Program12 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Enter a: ");
			int a=sc.nextInt();
			System.out.println("Enter b: ");
			int b=sc.nextInt();
			System.out.println(a+"+"+b+"="+(a+b));
			System.out.println(a+"-"+b+"="+(a-b));
			System.out.println(a+"/"+b+"="+(a/b));
			System.out.println(a+"*"+b+"="+(a*b));
		}catch(Exception e) {
			System.out.println("Wrong Input Entered");
		}
		System.out.println("Program ends...!");
	}

}
