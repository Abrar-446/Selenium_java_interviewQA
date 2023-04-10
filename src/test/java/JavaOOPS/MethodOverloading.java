package JavaOOPS;

public class MethodOverloading {

	public static void main(String[] args) {
		Demo demo=new Demo();
		demo.test("Testing");
		demo.test();
		demo.test(10, 'A');
	}

}


class Demo{
	
	public int test(int a,int b) {
		
		System.out.println("Method A:	" +a+"	"+ b);
		return a;
		
	}
	//
	public void test() {
		System.out.println("Default constructor Overloading");
	}
	
	//We cannot use any Return type in Method Overloading
	//Method return type doesn’t matter in case of overloading.
	/*public String test(String s) {
		System.out.println("String is:	"+s);
	}*/
	
	public void test(String s) {
		System.out.println("String is:	"+s);
	}
	
}