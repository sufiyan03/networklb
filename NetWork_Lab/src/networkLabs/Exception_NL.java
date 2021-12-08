package networkLabs;

public class Exception_NL {

	public static void main(String[] args) {
		try {
			int a=10,b=0;
			int c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException e) {
			System.out.println("divided by zero not allowed");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("------");
		}
		catch(Exception e) {
			System.out.println("----------");
		}
		finally {
			System.out.println("execute some how");
		}
	}

}
