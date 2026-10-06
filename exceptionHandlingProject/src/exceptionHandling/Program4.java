package exceptionHandling;

public class Program4 {
		public static void main(String[] args) {
			int a=12;
			int b=0;
			System.out.println(a+"+"+b+"="+(a+b));
			System.out.println(a+"-"+b+"="+(a-b));
			System.out.println(a+"/"+b+"="+(a/b)); //here exception occur coz divide by 0 so we have to handle it
			System.out.println(a+"*"+b+"="+(a*b));
			System.out.println("Program ends....!");
		}
}
