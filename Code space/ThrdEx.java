class Students extends Thread{
	private String name;
	public Students(String name){
		this.name=name;
	}
	public void run(){
		for(int i=1;i<=10;i++){
			System.out.println(name +" writing page"+i);
		}
		System.out.println(name+" completed writing");
	}
}
class ThrdEx{
	public static void main(String args[]){
		Students t1=new Students("Aishwarya");
		t1.start();
		Students t2=new Students("Sindhu");
		t2.start();
	}
}