package exceptionHandling;

import java.util.Scanner;

public class Program13 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Program start");
		try {
			System.out.println("Enter a: ");
			int a=sc.nextInt();
			System.out.println("Enter b: ");
			int b=sc.nextInt();
			System.out.println(a+"+"+b+"="+(a+b));
			System.out.println(a+"-"+b+"="+(a-b));
			try { //nested try catch block (try catch inside try catch)
				System.out.println(a+"/"+b+"="+(a/b));
			}catch(ArithmeticException e) {
				System.out.println(a+"/"+b+"="+"Infinity");
			}
			System.out.println(a+"*"+b+"="+(a*b));
		}catch(Exception e) {
			System.out.println("Wrong input Entered");
		}
		System.out.println("Program ends...!");
	}

}
