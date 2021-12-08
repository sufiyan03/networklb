package networkLabs;

public class First_p {
	static void run() {//static can me call directly where non static should call with the help of object
		System.out.println("hello");
	}
	void run1() {
		System.out.println("bye");
	}
	public static void main(String[] args) {
		run();
		First_p f=new First_p();
		f.run1();

	}

}
