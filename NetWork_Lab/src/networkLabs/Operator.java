package networkLabs;

public class Operator {

	public static void main(String[] args) {
		int x=10;
		int a=10,b=12,c=20;
		System.out.println(x++);//value still 10 but increment to 11
		System.out.println(++x);//value is 12 here because it first assign the value
		System.out.println(x--);//value here is 12 only but decrement to 11
		System.out.println(--x);//here value is 10
		System.out.println(a*b);
		System.out.println(a%b);
		System.out.println(a/b);
		System.out.println(a^b);//XOR gate(same is 0 diff is 1)
		System.out.println(a|b);//OR gate
		System.out.println(a&b);//AND gate
		System.out.println(a<b&a<c);//true or false
		
	}

}
