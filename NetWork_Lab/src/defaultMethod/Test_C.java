package defaultMethod;

interface Test1_I{
	default void greet() {
		System.out.println("interface 1..");
	}
}


interface Test2_I{
	default void greet() {
		System.out.println("interface 2..");
	}
}
class Test_C implements Test1_I,Test2_I{
	@Override
	public void greet() {
		//Test2_I.super.greet();
		Test1_I.super.greet();
	}

	public static void main(String[] args) {
		Test_C c1=new Test_C();
		c1.greet();
	}
}
