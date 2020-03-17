
abstract class Dog{
	
	String breed = "Doberman";
	
	
	public void bark() {
		System.out.println("Bark");
	}
	
	//creating abstract method//semicolon indicates incomplete
	public abstract void run();
}

class wolf extends Dog{   //create a normal class and extend with abstract class so that object can be created and the actions of the dog can be accessed.
	
	public void run() {
		System.out.println("Dog running");
	}
}

public class AbstractTutorial {

	public static void main(String[] args) {
		
		//Dog d = new Dog();   //An object cannot be created for abstract class 
		
		wolf w = new wolf();
		
		w.bark();
		System.out.println(w.breed);
		w.run();

	}

}
