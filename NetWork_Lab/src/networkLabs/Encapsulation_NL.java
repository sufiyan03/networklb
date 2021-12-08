package networkLabs;

public class Encapsulation_NL {
	private String name;
	private int reg_no;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getReg_no() {
		return reg_no;
	}

	public void setReg_no(int reg_no) {
		this.reg_no = reg_no;
	}
	@Override
	public String toString() {
		return "name=" + name + ", reg_no=" + reg_no + "";
	}

	public static void main(String[] args) {
		Encapsulation_NL e1=new Encapsulation_NL();
		e1.setName("sufyan");
		e1.setReg_no(10);
		System.out.println(e1.getReg_no());
		System.out.println(e1.getName());
		System.out.println(e1.toString());
		
		
	}

}
