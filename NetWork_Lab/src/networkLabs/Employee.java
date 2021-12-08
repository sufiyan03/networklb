package networkLabs;

public class Employee {
	int id;
	String name;
	float Salary;
	int length;
	int width;
	void insert(int i,String n,float s) {
		id=i;
		name=n;
		Salary=s;
	}
	void display() {
		System.out.println(id+" "+name+" "+Salary);
		System.out.println("area of rectangle:"+length*width);
	}
	void area(int l,int w) {
		length=l;
		width=w;
	}

	public static void main(String[] args) {
		Employee e1=new Employee();
		Employee e2=new Employee();
		e1.area(5, 5);
		e2.area(77, 8);
		e1.insert(101, "suf", 10000);
		e2.insert(102,"s",9000);
		e1.display();
		e2.display();
	}

}
