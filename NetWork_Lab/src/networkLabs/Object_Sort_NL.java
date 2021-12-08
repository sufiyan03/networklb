package networkLabs;

import java.util.*;

class Pen implements Comparable<Pen>{
	private String Brand;
	private int Price;
	private String ink;
	@Override
	public String toString() {
		return "Pen [Brand=" + Brand + ", Price=" + Price + ", ink=" + ink + "]";
	}
	public Pen(String brand, int price, String ink) {
		this.Brand = brand;
		this.Price = price;
		this.ink = ink;
	}
	
	@Override
	public int compareTo(Pen p) {
		return Brand.compareTo(p.Brand);
	}

}
public class Object_Sort_NL {

	public static void main(String[] args) {
		Pen p1=new Pen("cello",20,"blue");
		Pen p2=new Pen("butterflow",15,"black");
		Pen p3=new Pen("rorito",25,"red");
		Pen p4=new Pen("flair",10,"blue");
		Pen p5=new Pen("reynolds",5,"green");
		
		List<Pen> l1=new ArrayList<Pen>();
		l1.add(p1);
		l1.add(p2);
		l1.add(p3);
		l1.add(p4);
		l1.add(p5);
		System.out.println(l1);
		Collections.sort(l1);
		System.out.println(l1);

	}

}