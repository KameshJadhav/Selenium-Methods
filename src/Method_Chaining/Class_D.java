package Method_Chaining;

public class Class_D {

	public static void main(String[] args) {
		
		Class_A k = new Class_A();
		
		Class_B b = k.demo1();
		
		Class_C c = b.demo2();
		
		c.Maximize();
		c.Minimize();
	
		
		k.demo1().demo2().Maximize();
		k.demo1().demo2().Minimize();

	}

}
