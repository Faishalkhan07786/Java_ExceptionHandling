package exceptionHandling;

public class Program2 {
		public static void main(String[] args) {
			try {
				int res=getBiggest(56,56);
				System.out.println("Biggest is: "+res);
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
			System.out.println("Program ends....!");
		}
		public static int getBiggest(int a, int b) {
			if(a>b)
				return a;
			else if(b>a)
				return b;
			
			//use exception
			throw new RuntimeException("No biggest value found");
		}
}
