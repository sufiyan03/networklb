package hibernate;

public class Employee {
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	private int id;
	private String  name;
	private int salary;
	

	public static void main(String[] args) {
		Employee e=new Employee();
		e.setId(1);
		e.setName("Ss");
		e.setSalary(1000);
		System.out.println(e);

	}

}
