import java.io.Console;

class Circle{
    private float area;
    private float radius;
    public void acceptRecord(  ){
        Console console = System.console();
        System.out.print("Radius    :   ");
        //radius = Float.parseFloat(console.readLine());
        this.radius = Float.parseFloat(console.readLine());
    }
    public void calculateArea( ){
        //area = (float)( 3.14 * radius * radius );
        this.area =  3.14f * this.radius * this.radius;
    }
    //Complex this = c1
    public void printRecord( ){
        //System.out.println("Area    :   "+area);
        System.out.println("Area    :   "+this.area);
    }
}
class Program{
    public static void main(String[] args) {
        Circle c1 = null; //c1 is null object
        c1 = new Circle();
        c1.printRecord(); //NullPointerException
    }
    public static void main4(String[] args) {
        Circle c1 = null; //c1 is null object
        c1.printRecord(); //NullPointerException
    }
    public static void main3(String[] args) {
        //Circle c1 = new Circle();   //OK

        Circle c1;
        c1 = new Circle();   //OK
        c1.printRecord();
    }
    public static void main2(String[] args) {
        //Circle c1; //error: variable c1 might not have been initialized
        //c1.printRecord();
    }
    public static void main1(String[] args) {
        Circle c1 = new Circle( );
        c1.acceptRecord( );
        c1.calculateArea( );
        c1.printRecord( );   
    }
}