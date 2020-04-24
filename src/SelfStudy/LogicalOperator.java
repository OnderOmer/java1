package SelfStudy;

public class LogicalOperator {
    public static void main(String[] args) {

        System.out.println(true && true);
        System.out.println(false && true);
        System.out.println(true && false);
        System.out.println(false && false);

        System.out.println(2 < 4 && 4 < 6);

        boolean b = 10 ==10 && false;
        System.out.println(b);


        String drink = "tea"; // if chanced to tea it will be false
        boolean hot = true;
        boolean free= true;
        boolean bool = drink.equals("coffe")&& hot && free;

        System.out.println(bool);

        // & &&. // && is faster then &..

        bool = drink.equals("coffe") & hot;
        bool = drink.equals("coffe") && hot;

        System.out.println(bool);


        System.out.println("=================================================");




        System.out.println(true && true);
        System.out.println(false && true);
        System.out.println(true && false);
        System.out.println(false && false);

        bool = 4 > 10 || 4 < 5;

        System.out.println(bool);


        bool = drink.equals("water")|| drink.equals("tea");

        System.out.println(bool);

        String model = "bmw"; //audi
        bool = model.equals("bmw") || model.equals("audi");
        System.out.println(bool);

        System.out.println(!false);

        bool = !true;
        System.out.println(bool);

         // ^ Exclusive or;


        System.out.println(true ^ true);//false
        System.out.println(false ^ true);// true
        System.out.println(true ^ false);//true
        System.out.println(false ^ false);// false

        hot = true;
        free= true;
        System.out.println(hot ^ free);

        /////////////////////////////////////////////////////////////////

        /*
        // Precedence of logical operators
        ! is evaluated first
        && is evaluated second
        || is evaluated third

        */
                                 // false
        System.out.println(!(true)&& true|| false);


                  //true   true   true
        bool = !(1<8 && (5>2 || 3<5));
        System.out.println(bool);

    }
}
