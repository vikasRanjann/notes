import java.io.Console;
import java.time.LocalDate;
class Date{
    private int day, month, year;
    public Date( ){
        LocalDate ld = LocalDate.now();
        this.day = ld.getDayOfMonth();
        this.month = ld.getMonthValue();
        this.year = ld.getYear();
    }
    public int getDay( ){
        return this.day;
    }
    public void setDay( int day ){
        this.day = day;
    }
    public int getMonth() {
        return this.month;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public int getYear() {
        return this.year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void acceptRecord( ){
        Console console = System.console();
        System.out.print("Day   :   ");
        this.day = Integer.parseInt(console.readLine());
        System.out.print("Month :   ");
        this.month = Integer.parseInt(console.readLine());
        System.out.print("Year  :   ");
        this.year = Integer.parseInt(console.readLine());
    }
    public void printRecord( ){
        System.out.println(this.day+"/"+this.month+"/"+this.year);
    }
    public String toString(){
        return this.day+"/"+this.month+"/"+this.year;
    } 
}
class Program{
    public static void main(String[] args) {
        Date dt = new Date();
        int day = dt.getDay( );
        int month = dt.getMonth();
        int year = dt.getYear();
        System.out.println("Date    :   "+day+"/"+month+"/"+year);
        //dt.printRecord();
    }
    public static void main2(String[] args) {
        Date dt = new Date();
        dt.setDay( 23 );
        dt.setMonth( 5 );
        dt.setYear( 1996 );
        System.out.println(dt.toString());
    }
    public static void main1(String[] args) {
        Date dt = new Date( );
        //String str =  dt.toString();
        //System.out.println(str);

        //System.out.println(dt.toString());
        System.out.println(dt);
    }
}