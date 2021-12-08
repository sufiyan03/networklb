
package networkLabs;

public class Student {
	int id=11;				//field or instance variable(are not local variable)
	String name="cws";
	int rollno;
	static String college="GEC";
	static void change() {
		college="MIT";
		System.out.println(college);
	}
	static void change1() {
		college="NIT";
		System.out.println(college);
	}
	void run(int id) {
		this.id=id;
		System.out.println(id+22);
	}
	int greet() {
		int id=10;
		return id;
	}
	void insert(int r,String n) {
		rollno=r;
		name=n;
	}
	void display() {
		System.out.println(rollno+" "+name);
	}

	public static void main(String[] args) {//new->opertaor used to allocate memory at runtime
		Student s=new Student();	//object instantiation
		System.out.println(s.id);//accessing members through reference variable 
		System.out.println(s.name);
		s.run(111);//calling void method taking id from instance vaiable 
		System.out.println(s.greet());//calling method inside that thr is local variable same as instance variable
		s.insert(22,"suf");
		s.display();
		System.out.println(college);
	
	
	}
	

}
