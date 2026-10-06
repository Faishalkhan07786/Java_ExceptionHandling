package exceptionHandling;

public class Program9 {
	public static void main(String[] args) {
		System.out.println("Program Start");
		try {
			System.out.println(12/0);
			//System.out.println();
		}catch(ArithmeticException a) {  //we can use multiple catch with one try
			System.out.println("Arithmetic Exception");
			System.out.println(a.getMessage());
			
		}catch(RuntimeException r) {
			System.out.println("Runtime Exception");
			System.out.println(r.getMessage());
			
		}catch(Exception e) {
			System.out.println("Exception");
			System.out.println(e.getMessage());
		}
	}

}
