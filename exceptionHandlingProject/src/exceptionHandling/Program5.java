package exceptionHandling;

public class Program5 {
	public static void main(String[] args) {
		int a=12;
		int b=0;
		System.out.println(a+"+"+b+"="+(a+b));
		System.out.println(a+"-"+b+"="+(a-b));
		try {
		System.out.println(a+"/"+b+"="+(a/b)); 
		}catch(Exception e) {
			System.out.println(a+"/"+b+" = Infinity");
			System.out.println(e.getMessage());
		}
		System.out.println(a+"*"+b+"="+(a*b));
		System.out.println("Program ends....!");
	}

}
