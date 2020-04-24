package SelfStudy;

public class ComparisonOperators {

    public static void main(String[] args) {

        int n1 = 57;
        int n2 = 55;
        System.out.println(n1<=n2);


         double price1 = 45.32;
         double price2 = 66.33;

         boolean test = price1 != price2;
        System.out.println(test);

        System.out.println(n1 > price1);


        char letter1 = 'A';
        char letter2 = 'B';

        System.out.println(letter1 > letter2);
        System.out.println(letter2 >letter1);

        int num5= 20;
        int num6= 15;
        System.out.println(num5 != num6);

        System.out.println(10< 11 && 9> 8);

        boolean s = 20 == 20 && true;
        System.out.println(s);

        String drink = "coffee";// false
        boolean cold = true;
        boolean free = true;

        boolean bool = drink.equals("Tea") && cold && free;
        System.out.println(bool);

        bool = 4 > 10 || 4 < 3;
        System.out.println(bool);



        }




    }

