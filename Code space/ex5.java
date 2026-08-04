class A{
	int i=10;
	A(){}
	A(int i){
		this.i=i;
		System.out.println("Parent class i="+i);
	}
	void show(){
	System.out.println("show() in parent");
}
}
class B extends A{
	int i=20;
	B(int i){
		super(i);
		System.out.println("child class i="+this.i);
	}
	void show(){
		System.out.println("show() in child");
		super.show();
	}
}
class ex5{
	public static void main(String args[]){
		B obj=new B(40);
		obj.show();
	}
	
}