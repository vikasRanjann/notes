import java.io.Console;
class Circle{
    private float area;
    private float radius;
    public void acceptRecord( ){
        Console console = System.console();
        System.out.print("Radius    :   ");
        this.radius = Float.parseFloat( console.readLine());
    }
    public void calculateArea( ){
        this.area = ( float )(Math.PI * Math.pow( this.radius, 2));
    }
    public void printRecord( ){
        System.out.println("Area    :   "+this.area);
    }
}
public class Program {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.acceptRecord();
        c.calculateArea();
        c.printRecord();
    }
}