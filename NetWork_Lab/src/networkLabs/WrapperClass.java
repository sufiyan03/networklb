package networkLabs;

public class WrapperClass {

	public static void main(String[] args) {
		int a=10;
		@SuppressWarnings("removal")
		Integer obj=new Integer(a);
		System.out.println(obj);
		
		//Covert String to int,double,float,boolean
		String num="100";
		num=num+1;
		System.out.println("String:"+num);
		
		int c=Integer.parseInt(num);
		c=c+1;
		System.out.println("integer:"+c);
		
		double d=Double.parseDouble(num);
		d=d+5;
		System.out.println("double:"+d);
		
		float f=Float.parseFloat(num);
		f=f+10;
		System.out.println("float:"+f);
		
		boolean b=Boolean.parseBoolean(num);
		b=true;
		System.out.println("boolean:"+b);
	}

}
