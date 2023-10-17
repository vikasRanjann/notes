class Program{
    public static void main(String[] args) {
        String name = args[ 0 ];
        int empid = Integer.parseInt( args[ 1 ] );
        float salary = Float.parseFloat( args[ 2 ] );

        System.out.println("Name    :   "+name);
        System.out.println("Empid    :   "+empid);
        System.out.println("Salary    :   "+salary);
    }
}