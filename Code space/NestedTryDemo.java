public class NestedTryDemo{
	public static void main (String args[]){
		int[] arr ={5,10,15};
		try{
			try{
				int res=arr[0] / arr[1];
				System.out.println(res);
			}catch(ArithmeticException ae){
				System.out.println("Inner:"+ae);
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("Inner:"+e);
			}
			System.out.println(arr[5]);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Outer:"+e);
		}catch(Exception e){
			System.out.println("Outer:"+e);
		}
	}
}