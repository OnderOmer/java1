package day02_Variables;

public class Variables  {

    public static void main(String[] args) {

        /*

        decleare variables:
        DataType variableName= Data;
         */

        byte l =4;
        byte w = 2;
        byte area = 8;
        System.out.println(l);
        System.out.println(w);
        System.out.println(area);

        // byte num1 = 130; exceed the range of byte
        // byte num = 2.5; byte, short, int ,long they only accept whole numbers
        // short num2 = 3.5

        short num3 = 1000;
        // short num4 = 40000; exceeds the range of short
        System.out.println(num3); //1000
        System.out.println(12345);// by default compiler takes it as in primitive

        int n1 = 20000;
        int n2 = 1000000000;
        System.out.println(n2);

      //  long n3 = 999999999999; // out of int' range. compiler by default takes it as int
          long n4 = 9999999999l; // forcefully telling the compiler that this is long data number,

        System.out.println( n4);

        System.out.println(9999999999999l);
         long n5 = 19;

         // int num = 7L; larger one cannot be asisgned to smaller on
        // double > float > long > int > short > byte

          short s1 = 10;
         // byte b1 = s1; // short is larger then byte

        int i1 = s1;
        // byte b2 = i1; larger one cannot be asisgned to smaller on


        System.out.println(3.5);

        double d1 = 3.5;
        // float f1 =  4.5; // double primitive is larger than float primitive, cannot assigned

        float f2 = 5.5f;

        System.out.println(f2);

        System.out.println("====================================================");

        float pi = 3.14f;
        double p =3.14f;

         int a1 = 3000;
         double d2 = a1; // 3000.0
        System.out.println(d2);

        long l2 = 40;
        float f3 = l2;





        }









    }

