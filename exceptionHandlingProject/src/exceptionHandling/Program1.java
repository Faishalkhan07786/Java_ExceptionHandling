package exceptionHandling;

public class Program1 {
	public static void main(String[] args) {
		int res=getBiggest(56, 56);
		System.out.println(res);
	}
	public static int getBiggest(int a, int b) {
		if(a>b)
			return a;
		else if(b>a)
			return b;
		
		//use exception
		throw new RuntimeException("No biggest value is found");
	}

}
