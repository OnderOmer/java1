package day29_Wrapper_Arraylist;

import java.util.Arrays;

public class ValueOfMethods {

    public static void main(String[] args) {
        String str = "123";
         Integer a = Integer.valueOf(str); // Integer, 123

        System.out.println(a);

        double b = Integer.valueOf(str);// unboxing
        // double = Integer
        System.out.println(b);

        String str2 = "15.5";

        double d1 = Double.parseDouble(str2);
        // double = double // none

        double d2 = Double.valueOf(str); // 15.5
            //    double = double // unboxing

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d1 == d2);

        System.out.println("===========================================");

        int z1 = 2000;
       // Long L1 = z1 // does not accept any other primitives except for long

        Short sh1 = 3000;
        int z2 = sh1;

        /*
        "True"
        False ==> to boolean
        "100000000.5" ==> to float
        "123456" ==> to int
        */

     String r1 = "true";
     Boolean t1 = Boolean.valueOf(r1); // Boolean, true
          //Boolean = Boolean // none

        boolean t2 = Boolean.valueOf(r1);

        System.out.println(t1);
        System.out.println(t2);

        System.out.println("===============================================");

        int maxNum = Integer.MAX_VALUE;
        System.out.println(maxNum);

        double maxNum2 = Double.MAX_VALUE;
        System.out.println(maxNum2);

        int minNum = Integer.MIN_VALUE;
        System.out.println(minNum);

        byte maxNum3 = Byte.MAX_VALUE ;
        System.out.println(maxNum3);

        byte minNum2 = Byte.MIN_VALUE;
        System.out.println(maxNum2);

        System.out.println("==================================================");

        Boolean[]  arr2 = new Boolean[3];
        System.out.println(Arrays.toString(arr2));

    }

}

