package SelfStudy;

public class Frequency_Practice {


    public static void main(String[] args) {
     String str = "ABB";
     char ch = 'A';

     char[] arr = str.toCharArray(); // [A,A,A]

        int count = 0;
        for(char each :arr){
         if(each == ch){
             count++;
         }
        }
        System.out.println(count);

    }

    public static int frequency(String str, char ch){
        char[] arr = str.toCharArray(); // [A,A,A]

        int count = 0;
        for(char each :arr){
            if(each == ch){
                count++;
            }
        }

     return count;
    }

}