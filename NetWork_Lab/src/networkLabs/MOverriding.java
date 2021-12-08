package networkLabs;

class Car{
	void speed() {
		System.out.println("maximum speed is: 150");
	}
}
class tata extends Car{
	void speed() {
		System.out.println("max speed :200");
	}
}
class F1 extends Car{
	void speed() {
		System.out.println("max speed :500");
	}
}
class Nano extends Car{
	void speed() {
		System.out.println("max speed :50");
	}
}
public class MOverriding {

	public static void main(String[] args) {
		Car c=new Nano();
		c.speed();
		new F1().speed();
		new Car().speed();

	}

}
