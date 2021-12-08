package networkLabs;
public class Switch {
	void vowel() {
		char ch='a';
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
			System.out.println("vowel");
		}else {
			System.out.println("consonent");
		}
	}

	public static void main(String[] args) {
		char ch='h';
		switch(ch) {
		case 'o'-> System.out.println("vowel");
		case 'O'-> System.out.println("vowel");
		case 'a'-> System.out.println("vowel");
		case 'A'-> System.out.println("vowel");
		case 'i'-> System.out.println("vowel");
		case 'I'-> System.out.println("vowel");
		case 'e'-> System.out.println("vowel");
		case 'E'-> System.out.println("vowel");
		case 'U'-> System.out.println("vowel");
		case 'u'-> System.out.println("vowel");
		default -> System.out.println("consonent");
		}
		new Switch().vowel();
	}

}
