import static java.lang.System.out;
import static java.lang.Math.*;
public class Program {
    public static void main(String[] args) {
        float radius = 10;
        float area = (float)(PI * pow(radius, 2));
        out.println("Area    :   "+area);
    }
    public static void main1(String[] args) {
        float radius = 10;
        float area = (float)(Math.PI * Math.pow(radius, 2));
        System.out.println("Area    :   "+area);
    }
}