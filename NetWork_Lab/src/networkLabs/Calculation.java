package networkLabs;

public class Calculation {
	void fact(int n) {
		int f=1;
		for(int i=1;i<=n;i++) {
			f=f*i;
		}System.out.println("factorial is:"+f);
	}
	static int refac(int n) {
		if(n==1||n==0)
			return 1;
		else
			return n*refac(n-1);
	}

	public static void main(String[] args) {
		new Calculation().fact(5);//calling object with anonymous object(in this thr is no specific name for object)
		System.out.println("factorial of a num is:"+refac(6));
		new Calculation().fact(4);
	}

}
