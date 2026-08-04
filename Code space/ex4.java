abstract class Animal{
	String name;
	Animal(String name){
		this.name=name;
	}
	void eat(){
		System.out.println(name+"is eating");
	}
	abstract void makeSound();

}
class Dog extends Animal{
	Dog(String name){
		super(name);
	}
	void eat(){
		System.out.println(name+"is eating");
	}
	void makeSound(){
		System.out.println("Bow wow...");
	}
}
class ex4{
	public static void main(String args[]){
		Dog obj=new Dog("Tommy");
		obj.eat();
		obj.makeSound();
	}
}