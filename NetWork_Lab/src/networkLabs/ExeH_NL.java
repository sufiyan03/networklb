package networkLabs;

@SuppressWarnings("serial")
class Myexp extends Exception{
	Myexp(String s){
		super(s);
	}
	
}



public class ExeH_NL {
	public static void main(String[] args) {
		try {
			for(int i=0;i<100;i++) {
				System.out.print(" "+i);
				if(i>=10) {
					Myexp m1=new Myexp("MemoryFullException");
					throw m1;
				}
			}
			
		}
		catch(Myexp e) {
			e.printStackTrace();
		}
	}

}
