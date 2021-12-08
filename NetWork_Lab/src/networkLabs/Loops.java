package networkLabs;


interface hello{
	void speak();
	default void greet() {
		System.out.println("mood is bad");
	}
}
public class Loops extends Calculation implements hello {
	@Override
	public void speak() {
		System.out.println("speaking...");
		
	}
	void dowhile() {
		int i=2;
		do {
			System.out.print(" "+i);
			i=i+2;
		}
		while(i<=20);
	}
	void While() {
		int i=22;
		System.out.println();
		while(i<=40) {
			
			System.out.print(" "+i);
			i+=2;
			}
		System.out.println();
	}
	void foreach() {
		String[] names= {"c","c++","python","java","jsp"};
		for(String item:names) {
			System.out.print(" -- "+item);
		}System.out.println();
	}
	void forloop() {
		int sum=0;
		for(int i=11;i<=20;sum+=i++);
		System.out.println("total sum:"+sum);
	}
	void numpat() {
		for(int i=0;i<=4;i++) {
			for(int j=i;j<=5;j++) {
				if(j==4) {
					continue;
				}
				System.out.print(" "+j);
			}System.out.println();
		}
	}

	public static void main(String[] args) {
		Loops l=new Loops();//normal object
		l.speak();
		l.numpat();
		l.greet();
		l.forloop();
		l.foreach();	
		new Loops().dowhile();//anonymous object
		new Loops().While();
		new Calculation().fact(5);
	}
}
