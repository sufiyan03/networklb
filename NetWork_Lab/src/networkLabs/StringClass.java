package networkLabs;

public class StringClass {

	public static void main(String[] args) {
		String name="Sufyan";
		String name1=new String("Sufyan");
		if(name==name1) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		if(name.equals(name1)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		StringBuffer s=new StringBuffer(name);
		s.append(" is good boy");
		System.out.println(s);
		s.reverse();
		System.out.println(s);

	}

}
