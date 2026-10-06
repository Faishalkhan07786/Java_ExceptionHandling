package exceptionHandling;

public class Program10 {
	public static void main(String[] args) {
			System.out.println("Program Start");
			try {
				System.out.println(12/0);
				//System.out.println();
			}catch(Exception e) { //we cannot use exception in first catch coz every exception is handled by it and all other catch exception will become unreachable and it will cause error
				System.out.println("Exception");
				System.out.println(e.getMessage());
			}
			/*catch(ArithmeticException a) { 
				System.out.println("Arithmetic Exception");
				System.out.println(a.getMessage());
				
			}catch(RuntimeException r) {
				System.out.println("Runtime Exception");
				System.out.println(r.getMessage());	
			}*/
	}

}
