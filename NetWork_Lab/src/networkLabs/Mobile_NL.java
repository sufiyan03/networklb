package networkLabs;

class Mobile{
	private String display;
	private String processor;
	private String RAM;
	
	public String getDisplay() {
		return display;
	}

	public void setDisplay(String display) {
		this.display = display;
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	public String getRAM() {
		return RAM;
	}

	public void setRAM(String rAM) {
		RAM = rAM;
	}
}
class Nokia extends Mobile{
	void run() {
		System.out.println(getRAM());
		System.out.println(getProcessor());
		System.out.println(getDisplay());
	}
}
	public class Mobile_NL {
	public static void main(String[] args) {
		Mobile m1=new Mobile();
		m1.setDisplay("amoled display");
		m1.setProcessor("Qualcomm 720G");
		m1.setRAM("4GB");
		System.out.println(m1.getDisplay());
		System.out.println(m1.getProcessor());
		System.out.println(m1.getRAM());

		
	}

}