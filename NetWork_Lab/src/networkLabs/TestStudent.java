package networkLabs;
public class TestStudent {
	void greet() {
		System.out.println("hle");
	}
	static {
		System.out.println("static class");
		TestStudent t1=new TestStudent();
		t1.greet();
		Student s1=new Student();
		s1.display();
		
	}

	public static void main(String[] args) {
		System.out.println("Collge name before:"+Student.college);
		Student.change();
		Student s1=new Student();//accessing this from Student class(have to be inside same package)
		s1.run(12);
		System.out.println(s1.id);
		System.out.println(s1.name);
		s1.id=100;
		s1.name="Sufyan";
		System.out.println("slno."+s1.id+"\n  Name:"+s1.name);
		System.out.println("Collge name before:"+Student.college);
		Student.change1();
	}

}
