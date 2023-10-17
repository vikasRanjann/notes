package test;

enum Day{
	//SUN=0, MON=1, TUES=2, WED=3
	SUN( "SunDay" ) , MON( "MonDay" ) , TUES( "TuesDay" );
	private String dayName;
	private Day( String dayName ) {
		this.dayName = dayName;
	}
	public String getDayName() {
		return dayName;
	}
}
public class Program {
	public static void main(String[] args) {
		Day[] days = Day.values();
		for (Day day : days) {
			String name = day.name();
			int ordinal = day.ordinal();
			String dayName = day.getDayName();
			System.out.println(name+"	"+ordinal+"	"+dayName);
		}
	}
}
