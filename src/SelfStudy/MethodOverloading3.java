package SelfStudy;

public class MethodOverloading3 {

    public static void main(String[] args) {
        sum(10, 20);
        sum(1.5,2.5);

     double num1 =  sum(10,15.5);
        System.out.println(num1);

        //25L,30L

      double num2 =   sum(25L,30L);


       }

    public static void sum(int a, int b){
        System.out.println(a+b);
    }

   public static double sum(double a, double b){
     return a+b;
   }
}
