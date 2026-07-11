import java.util.Scanner;
public class ElectricityBill{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		int units=sc.nextInt();
		int bill=0;
		for(int i=1;i<=units;i++){
			if(i<=100){
				bill+=5;
			}
			else if(i<=200){
				bill+=7;
			}
			else{
				bill+=10;
			}
		}
		System.out.println("Bill = "+bill);
	}
}