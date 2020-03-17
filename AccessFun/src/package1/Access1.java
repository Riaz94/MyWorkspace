//Access modifiers or encapsulation-Data protection or Data hiding.
//Encapsulation is achieved through various access specifiers or modifiers.
package package1;

public class Access1 {

	//default,public,private,protected
	
	//default:  or package level access specifier
	int hours = 3;
	int minutes = 47;
	
	//public:
	public int a = 3;
	public int b = 4;
	
	//Private:
	//As soon as u change public to private error occurs in Access2 and if u type b. a int and b int wont be shown as it is private. 
	
	//Protected:
	//If it is protected it gives access only to the same package unlike public and it will be in yellow diamond shaped.
	//But the other way to access in different package is (extends Access1)
	
	protected int c = 3;
	protected int d = 4;
	
	//Another example with methods
	
	public int getHours() {
		return hours;
	}

}
