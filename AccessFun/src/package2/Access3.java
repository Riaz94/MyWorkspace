package package2;

import package1.Access1;   //this is to bring the code from package 1(auto generated)

public class Access3 extends Access1 {   //Access 3 is the sub class of Access1

	public static void main(String[] args) {
		
	//public example in another package

		Access1 b = new Access1();
		System.out.println(b.a);   //if u type b. u will see a green circle which represents public.
		System.out.println(b.b);
		
		//protected:
		Access3 c = new Access3();   //Access1 has to be changed to Access3
		System.out.println(c.c);   
		System.out.println(c.d);

		
	}

}
