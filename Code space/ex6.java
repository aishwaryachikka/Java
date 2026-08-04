class Animal{
	String color;
	Animal (String c){
		color=c;
	}
	public void eat(){
		System.out.println("Every animal eats food");
	}
}
class Dog extends Animal{
	int height;
	Dog(String c,int ht){
		super(c);
		height=ht;
	}
	public void bark(){
		System.out.println("Dog is barking..");
	}
}
class BabyDog extends Dog{
	int weight;
	BabyDog(String c,int ht,int wt){
		super(c,ht);
		weight=wt;
	}
	public void stay(){
		System.out.println("Animal stay in jungle");
	}
}
class ex6{
	public static void main(String args[]){
		BabyDog obj=new BabyDog("Brown",19,80);
		System.out.println(obj.color);
		System.out.println(obj.height);
		System.out.println(obj.weight);
		obj.eat();
		obj.bark();
		obj.stay();
	}
}