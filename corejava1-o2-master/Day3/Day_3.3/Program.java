class Program{
    public static void main(String[] args) {
        System.out.print("Hello World\n");
        System.out.println("Hello World");
        System.out.printf("%s\n","Hello World");
     }
    public static void main2(String[] args) {
       // System.out.print("Hello");
       // System.out.print("World!!!");

        System.out.println("Hello");
        System.out.println("World!!!");
    }
    public static void main1(String[] args) {
        String name = "Prashant Papal"; 
        int empid = 11;
        float salary = 35000.50f;
        //System.out.println(name+"   "+empid+"   "+salary);
        System.out.printf("%-20s%-5d%-10.2f\n",name, empid, salary);

        name = "Amit Pol"; 
        empid = 101;
        salary = 125000.50f;       
        //System.out.println(name+"   "+empid+"   "+salary);
        System.out.printf("%-20s%-5d%-10.2f\n",name, empid, salary);
    }
}