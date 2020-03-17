package package1;

public class Access2 {

	public static void main(String[] args) {
    
		//default:
		Access1 a = new Access1();
		System.out.println(a.hours);   //if u type a. u will see a blue triangle which represents default.
		System.out.println(a.minutes);
		
		//public:
		Access1 b = new Access1();
		System.out.println(b.hours);   //if u type b. u will see a green circle which represents public.
		System.out.println(b.minutes);
		

		//protected:
		Access1 c = new Access1();
		System.out.println(c.c);  ////if u type c. u will see a yellow diamond which represents protected.
		System.out.println(c.d);

}
}
