//Abstraction means incomplete.
abstract class Indians {  //Even if one method is abstract the class should also be abstract.

	//abstract int no;   //Abstract cannot be used for variables but can be used for methods.
	
abstract void haveBreakfast();   //Definition cannot be given for this particular abstract method because breakfast may differ in different states in india.To give a correct definition to this abstract method i.e {}, the responsibility will be taken by the child class. 

void applyvoterid() {   
	System.out.println("voter id applied");
}

void applyPANcard() {
	System.out.println("PAN card applied");
}



}
