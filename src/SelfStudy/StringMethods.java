package SelfStudy;

public class StringMethods {

    public static void main(String[] args) {




        System.out.println("===============================================");

        //concat (str) concatenation

        String str2 = "Ozgur";
                str2 =  str2.concat(" Kucuk"); // Ozgur Kucuk

        System.out.println(str2);


        String str3 = "Ozgur";

        str3 = str3.concat(" is fun ");

        System.out.println(str3);

        String str5 = "Sleep Inn Hotel";

         str5 =  str5.concat(" is cheap");
        System.out.println(str5);


        String str6 = "Turkey";
               str6 = str6.concat(" is very far");
        System.out.println(str6);

        String str7 = "Omer";
               str7 = str7.concat(" is a smart boy");
        System.out.println(str7);

        String str8 = "Onder";
            str8 =      str8.concat(" is playing football");
        System.out.println(str8);


        System.out.println("===============================================");


       String str9 = "OZGUR KUCUK";
          str9 =     str9.toLowerCase();
        System.out.println(str9);

        String str1 = "ozgur kucuk";
           str1=     str1.toUpperCase();
        System.out.println(str1);



        String str4 ="       Ozgur";
           str4 =          str4.trim();

           System.out.println(str4);
           System.out.println(str4.length());

           String str10 = "     Java";
            str10 =            str10.trim();
        System.out.println(str10);
        System.out.println(str10.length());


        String str11 = "           ";
        str11 =              str8.trim();
        System.out.println(str11.length());

        String sentence1 = "I like Java";

        String word1 = sentence1.substring(7, sentence1.length()-1+1);
        String word2 = sentence1.substring(2,6);
        String word3 = sentence1.substring(2,6) + sentence1.substring(7, sentence1.length());


        System.out.println(word3);
        System.out.println(word2);
        System.out.println(word1);

        String sentence2 = "I like to learn java";

        String r1 = sentence2.substring (10);
        System.out.println(r1);


    }
}
