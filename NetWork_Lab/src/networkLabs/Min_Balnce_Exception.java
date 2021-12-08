package networkLabs;

@SuppressWarnings("serial")
public class Min_Balnce_Exception extends Exception {
	private static int accnt[]= {101,102,103,104,105};
	private static String name[]= {"sufyan","haram","uyaz","suhaib","tanveer"};
	private static double balance[]= {1000,9919,2999,999,9800};
	
	Min_Balnce_Exception(String s) {
		super(s);
	}
	public static void main(String[] args) {
		try {
			System.out.println("Account_number:"+"\t"+"Customer-Name:"+"\t"+"Balance:");
			for(int i=0;i<5;i++) {
				System.out.println(accnt[i]+"\t\t"+name[i]+"\t\t"+balance[i]);
				if(balance[i]<100) {
					Min_Balnce_Exception m1=new Min_Balnce_Exception("MinimumBalanceException");
					throw m1;
				}
			}
		}
		catch(Min_Balnce_Exception e) {
			e.printStackTrace();
		}
	}

}

