class Program{
    public static void main(String[] args) {
        double num1 = 10.5d;
        int num2  = ( int )num1; //Narrowing
        //int num2  = num1; //Error
        System.out.println("Num2    :   "+num2);
    }
    public static void main9(String[] args) {
        int num1 = 10;
        //double num2 = ( double )num1;   //OK : Widening
        double num2 = num1;   //OK : Widening
        System.out.println("Num2    :   "+num2);
    }
    public static void main8( String[] args ){
        int num1 = 10;
        String strNumber = String.valueOf(num1);//Boxing
        System.out.println(strNumber);

        double num2 = 20.5;
        strNumber = String.valueOf(num2);//Boxing
        System.out.println(strNumber);

        float num3 = 10.5f;
        strNumber = String.valueOf(num3);
        System.out.println(strNumber);//Boxing
     }
    public static void main7( String[] args ){
        int num1 = 10;
        String strNumber = Integer.toString(num1);
        System.out.println(strNumber);

        double num2 = 20.5;
        strNumber = Double.toString(num2);
        System.out.println(strNumber);

        float num3 = 10.5f;
        strNumber = Float.toString(num3);
        System.out.println(strNumber);
     }
    public static void main6( String[] args ){
        String str = "SunBeam";
        char ch = str.charAt(3);
        System.out.println("Character   :   "+ch);
     }
    public static void main5( String[] args ){
        String str = "Hello World";
        int number = Integer.parseInt(str);
        //Output : NumberFormatException
     }
    public static void main4( String[] args ){
       String str = "125";
       int num1 = Integer.parseInt(str);//UnBoxing
       System.out.println("Num1 :   "+num1);

       str = "3.14f";
       float num2 = Float.parseFloat(str);  //UnBoxing
       System.out.println("Num2 :   "+num2);

       str = "3.142d";
       double num3 = Double.parseDouble(str);//UnBoxing
       System.out.println("Num3 :   "+num3);
    }
    public static void main3( String[] args ){
        System.out.println("Result   :   "+ 10 + 20 );
        //Result   :   1020

        System.out.println("Result   :   "+ ( 10 + 20 ) );
        //Result   :   1020
    }
    public static void main2( String[] args ){
        int num1 = 10;
        //printf("Num1  :   %d\n",num1);
        //cout"Num1  :   "<<num1<<endl;
        System.out.println( "Num1   :   "+num1 );
    }
    public static void main1( String[] args ){
        int num1 = 10, num2;
        num2 = 20;
        System.out.println( num1 );
        System.out.println( num2 );
    }
}