import java.io.Console;
import java.util.Calendar;
public class Date {
    private int day;
    private int month;
    private int year;
    //Parameterless Constructor
    public Date( ){
        System.out.println("public Date( )");
        Calendar c = Calendar.getInstance();
        this.day = c.get( Calendar.DAY_OF_MONTH );
        this.month = c.get( Calendar.MONTH ) + 1;
        this.year = c.get( Calendar.YEAR );
    }
    //Parameterized Constructor
    public Date( int day, int month, int year ){
        System.out.println(" public Date( int day, int month, int year )");
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public void acceptRecord( ){
        Console console = System.console();
        System.out.print("Day   :   ");
        this.day = Integer.parseInt(console.readLine());
        System.out.print("Month   :   ");
        this.month = Integer.parseInt(console.readLine());
        System.out.print("Year   :   ");
        this.year = Integer.parseInt(console.readLine());
    }
    public void printRecord( ){
        System.out.println(this.day+" / "+this.month+" / "+this.year);       
    }
}