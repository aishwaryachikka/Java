import java.util.Scanner;
public class exception{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Numerator:");
		int a=sc.nextInt();
		System.out.println("Enter denominator:");
		int b=sc.nextInt();
		try{
			int res=a/b;
			System.out.println("Result:"+res);
		}
		catch(ArithmeticException e){
			System.out.println("Error:Cannot divide by zero");
		}
		finally{
			System.out.println("Execution Completed");
		}
	}
}