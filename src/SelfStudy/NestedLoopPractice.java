package SelfStudy;

import java.util.Arrays;
import java.util.Scanner;


public class NestedLoopPractice {
    public static void main(String[] args) {

        /*
        Warm up task:
	1. write a program that can return the unique characters from a string
		Ex:  "AABCC" ==> "B"
	2. write a program that can return the frequency of the characters ina string
		Ex: "AABCBCA" ==> "A3B2C2"
	Hint: You need nested loops
         */
            Scanner scan =new Scanner(System.in);
            String str = scan.nextLine();

           String [] stringsArr = str.split("");

              String result = "";


        for (int i=0; i<stringsArr.length;i++){

            int count =0;

          for (int j=0; j<stringsArr.length;j++){

              if(stringsArr[i].equals(stringsArr[j])){
                  count++;

              }

          }
          if(count==1){

              result +=stringsArr[i];
          }
      }

        System.out.println(result);

//===================================================================
        System.out.println("=========================");
            String unique ="";
        for (int i=0; i<stringsArr.length;i++){
            if (!unique.contains(stringsArr[i])) {

                unique+=stringsArr[i];
               }
            }
        String res= "";
        for (int i=0; i<unique.length();i++){
            int count =0;
            for (int j=0; j<str.length();j++ ){
                if(unique.charAt(i)==str.charAt(j)){
                    count++;
                }

            }
            res += ""+unique.charAt(i)+count;



        }


        System.out.println(res);



    }
}
