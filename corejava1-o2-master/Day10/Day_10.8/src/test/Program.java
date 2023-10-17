package test;

enum Day{
	//SUN=0, MON=1, TUES=2, WED=3
	SUN( 1 ) , MON( "MonDay" ) , TUES( 2, "TuesDay" );
	private int dayNumber;
	private String dayName;
	private Day( String dayName ) {
		this.dayName = dayName;
	}
	private Day( int dayNumber ) {
		this.dayNumber = dayNumber;
	}
	private Day( int dayNumber, String dayName ) {
		this.dayNumber = dayNumber;
		this.dayName = dayName;
	}
	public String getDayName() {
		return dayName;
	}
	public int getDayNumber() {
		return dayNumber;
	}
	@Override
	public String toString() {
		return this.dayNumber+"	"+this.dayName;
	}
}
public class Program {
	public static void main(String[] args) {
		Day[] days = Day.values();
		for (Day day : days) {
			String name = day.name();
			int ordinal = day.ordinal();
			String dayName = day.getDayName();
			int dayNumber = day.getDayNumber();
			//System.out.println(name+"	"+ordinal+"	"+dayName+"	"+dayNumber);
			System.out.println(name+"	"+ordinal+"	"+day.toString());
		}
	}
}
