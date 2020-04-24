package Practice_04_08_2020;

public class ForLoops_Practice {
    public static void main(String[] args) {


    /*

    for( initialization; condition; iterator){

    iterator: co-related to your condition

     execution order:
     1. initialization
     2. condition
            if true:
                 statements
                 then Iterator

                 if false:
                 stops loop
                    */


        for (int i = 1; i <= 5; i+=2){  // i: 0,1,2,3,4,5
            System.out.println("Hello World "  +i);

        }
        System.out.println("=========================================");

        for(int i =1; i <= 5; i++){
            System.out.println(i);
        }



    }


}
