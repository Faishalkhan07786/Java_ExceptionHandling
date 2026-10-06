package exceptionHandling;

public class Program8 {
	public static void main(String[] args) {
		System.out.println("Program start");
		try {
			System.out.println(12/0);  
			System.out.println(12+2);   //we do not need to write the code inside the try block which cannot cause any exception coz when any line cause error then control transfer to the catch block so the further line will not executed which does not have any error
			System.out.println(12-2);
			System.out.println(12*2);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		System.out.println("Program ends...!");
	}

}
