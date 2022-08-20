package Abstraction;

public class Dog extends Animal{

	void run()
	{
		System.out.println("Running");
	}
	
	public void eat()
	{
	
		System.out.println("Eating");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a=new Dog();
		a.run();
		a.color();
		
		//or 
		
		Dog d= new Dog();
		d.run();
		d.eat();
		// d.color();
		//d.run();
		
		

	}

}
