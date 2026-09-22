class YourThread extends Thread{
	public void run(){
		System.out.println("Thread Name: "+Thread.currentThread().getName());
		System.out.println("Thread Priority:"+Thread.currentThread().getPriority());
		for(int i=1;i<6;i++){
			System.out.println(i);
		}
	}
}
class Thread1{
	public static void main(String args[]){
		System.out.println("Thread Name: "+Thread.currentThread().getName());
		System.out.println("Thread Priority:"+Thread.currentThread().getPriority());
		YourThread t1 =new YourThread();
		t1.start();
		t1.setName("CSM C");
		t1.setPriority(8);
		YourThread t2=new YourThread();
		t2.start();
		
	}
}