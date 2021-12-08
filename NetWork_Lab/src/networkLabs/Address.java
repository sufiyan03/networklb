package networkLabs;

public class Address {

	public static void main(String[] args) {
		String address="delh noda india";
		if(address.endsWith("india")) {
			if(address.contains("delhi")) {
				System.out.println("my city is mysore");
			}
			else if(address.contains("noida")) {
				System.out.println("my city is noida");
			}
			else {
				System.out.println(address.split(" ")[0]);
				System.out.println(address.split(" ")[1]);
				System.out.println(address.split(" ")[2]);
			}
		}

	}

}
