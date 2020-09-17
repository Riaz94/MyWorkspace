public class Tamils extends Indians {   //At first it wont allow Indians to extend because there is a abstract method(Incomplete method) in the Indians class.

	public static void main(String[] args) {
		
		/*Indians a = new Indians();
		a.haveBreakfast;  */       //This is because objects cannot be created for the abstract class.
		
		//Indians i = new Tamils();   //As explained by payilagam This is to access normal methods in parent class but its not needed.
		Tamils t = new Tamils();
		t.applyPANcard();         //Normal methods of the Indians class can be accessed just by creating an object and using extends keyword. i.e, class Tamils extends Indians
		t.applyvoterid();          //Same as above
		t.haveBreakfast();         //This abstract method is also accessed because we have created a clear method in this child class as below.
		t.Tamilculture();
	}
	
	void haveBreakfast() {          //After creating method with clear definition in this child class extends Indians will be accepted and the red line will be gone.
		System.out.println("Having Breakfast");   //If this method is not defined clearly then the class should be declared as an abstract. i.e, abstract class Tamils extends Indians.
	}                                           //An abstract class's(Indians) child(Tamils) can be abstract and so no need to define the abstract method declared in the Indians class.
                                                 //This can also be called as method over ride.
	
	void Tamilculture() {           //This method is owned by Tamils class
		System.out.println("Following tamil culture");
	}
}
