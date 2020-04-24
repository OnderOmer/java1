package SelfStudy;

import javax.xml.crypto.dom.DOMCryptoContext;

public class TypeCasting {

    public static void main(String[] args) {
        int i = (int) 3.9;
        System.out.println(i);
        //IMLICIT CASTING
        // BYTE > SHORT > int > long > float> double
        double d1 = 200;
        long l = i;
        System.out.println(d1);
        // EXPLICIT CASTING
        byte b1 = 5;
        short sh1 = 400;
        b1 = (byte) sh1;

       double price = 200.55;
       int iPrice = (int)price;
        System.out.println(iPrice);

        int int1 = (int) (5/2.0);

        String str = "10";
       // int n1= (int)str;// we cannot cast it!



    }
}
