import java.util.Scanner;
public class ArrayEx{
	public static void main(String args[]){
		int num[][]=new int[3][3];
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<num.length; i++){
			for(int j=0; j<num.length;j++){
				num[i][j]=sc.nextInt();
			}
		}
		System.out.println("Printing 2D Array");
		for(int[] val:num){
			for(int value:val){
				System.out.print(value+" ");
			}
			System.out.println();
		}
	}
	
}
