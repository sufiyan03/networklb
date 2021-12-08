package networkLabs;

public class enumuration {
	public enum Day {Sun,Mon,Tue,Wed,Thu,Fri,Sat};
	public enum color {Re,Blu,Gr,Or,Bla,Yel};
	public enum season {Win,Sum,Spr,Mon,Aut};
	public enum sub{Css,Sql,Py,Ja,Html,Jsp};
	public enum dir{No,So,Ea,We};
	
	
	void Colour() {
		System.out.println("-------Colours-------");
		color[] colrs=color.values();
		for(color now:colrs) {
			switch(now) {
				case Re -> System.out.println("Red");
				case Blu -> System.out.println("Blue");
				case Gr -> System.out.println("Green");
				case Or -> System.out.println("Orange");
				case Bla -> System.out.println("Black");
				case Yel -> System.out.println("Yellow");
				
			}
		}
	}
	void Week() {
		System.out.println("---------Days--------");
		Day[] daynow=Day.values();
		for(Day now:daynow) {
			switch(now) {
				case Sun -> System.out.println("Sunday");
				case Mon -> System.out.println("Monday");
				case Tue -> System.out.println("Tuesday");
				case Wed -> System.out.println("Wednesday");
				case Thu -> System.out.println("Thursday");
				case Fri -> System.out.println("Friday");
				case Sat -> System.out.println("Saturday");
				
			}			
		}
	}
	void Season() {
		System.out.println("--------Seasons---------");
		season[] s=season.values();
		for(season now:s) {
			switch(now) {
				case Win -> System.out.println("Winter");
				case Spr -> System.out.println("Spring");
				case Sum -> System.out.println("Summer");
				case Aut-> System.out.println("Autumn");
				case Mon -> System.out.println("Monsoon");
				
			}
		}
	}
	void Subject() {
		System.out.println("-------Subjects--------");
		sub[] s=sub.values();
		for(sub now:s) {
			switch(now) {
				case Css -> System.out.println("Cascading Style Sheets");
				case Sql-> System.out.println("Structured Query Language");
				case Py -> System.out.println("Python");
				case Ja-> System.out.println("Java");
				case Jsp -> System.out.println("Java Script");
				case Html -> System.out.println("Hyper Text Markup Language ");
				
			}
		}
	}
	void Direction() {
		System.out.println("-------Directions-------");
		dir[] d=dir.values();
		for(dir now:d) {
			switch(now) {
				case No -> System.out.println("North");
				case So -> System.out.println("South");
				case Ea -> System.out.println("East");
				case We-> System.out.println("West");
				
			}
		}
	}
	public static void main(String[] args) {
		enumuration e1=new enumuration();
		e1.Week();
		e1.Colour();
		e1.Subject();
		e1.Season();
		e1.Direction();
	}

}
