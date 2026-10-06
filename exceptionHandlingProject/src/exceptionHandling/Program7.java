package exceptionHandling;

public class Program7 {
	public static void main(String[] args) {
		System.out.println("Program 7 starts");
		try {
			System.out.println(12/3);
		}catch(Exception e) {   //if there is no exception in program then catch block will not execute
			System.out.println(e.getMessage());
		}
		System.out.println("Program Ends...!");
	}

}
