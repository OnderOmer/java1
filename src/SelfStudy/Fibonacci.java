package SelfStudy;

public class Fibonacci {

    public static void main(String[] args) {
     // Fibonacci :
    // 1 1 2 3 5 8 13 21
    // a b c
    //   a b c
    //     a b c
         int a = 1;
         int b = 1;
         int c  ;
        System.out.println(a);
        System.out.println(b);
         for(int i = 0; i < 10; i++){
             c=a+b;
             a=b;
             b=c;
             System.out.println(c);
         }


    }
}
