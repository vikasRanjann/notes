package test;

enum Day{
	//SUN=0, MON=1, TUES=2, WED=3
	SUN( 1 ) , MON( 2 ) , TUES( 3 );
	private int dayNumber;
	private Day( int dayNumber ) {
		this.dayNumber = dayNumber;
	}
	public int getDayNumber() {
		return dayNumber;
	}
}
public class Program {
	public static void main(String[] args) {
		Day[] days = Day.values();
		for (Day day : days) {
			String name = day.name();
			int ordinal = day.ordinal();
			int dayNumber = day.getDayNumber();
			System.out.println(name+"	"+ordinal+"	"+dayNumber);
		}
	}
}
