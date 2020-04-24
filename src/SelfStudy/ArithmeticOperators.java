package SelfStudy;

public class ArithmeticOperators {


    public static void main(String[] args) {

        int n1 = 20;
        int n2 = 10;

        int sum = n1 + n2;
        int substraction = n1 - n2;
        int division = n1 / n2;
        int multiplication = n1 * n2;
        int remainder = n1 % n2;

        System.out.println(sum+","+substraction+","+division+","+multiplication+","+remainder);


        int num1 = 4 + 3 * 2;
        System.out.println(num1);

        num1 = 4 + 3 * 2;
        System.out.println(num1);

       // num1 = (4 + 3) * 2 + 4 / 2; //whatever is in parenthesis will calculated it first
         num1 = 4 + 3 * 2 + 4 / 2; // 12
        System.out.println(num1);



        byte b = 10;
        short sh = 20;

        // short total = b + sh ; will not compile
        int total = b + sh;
        System.out.println(total);


        sh = 100 + 2;

        double d = 10.5;
        int i = 4;
        double j = d * i;
        System.out.println(j);

        double d2 = 3.4;
        double d3 = d - d2;
        System.out.println(d3);







        }



    }

