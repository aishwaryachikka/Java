class Students implements Runnable{
	private String name;
	public Students(String name){
		this.name=name;
	}
	public void run(){
		for(int i=1;i<=5;i++){
			System.out.println(name+ " writing page"+i);
		}
		System.out.println(name+ " completed wriiting");
	} 
}
class ThreadEx{
	public static void main(String args[]){
		Students r1= new Students("Priya");
		Thread t=new Thread(r1);
		t.start();
		Students r2= new Students("Pinky");
		Thread t1=new Thread(r2);
		t1.start();
	}
	
}