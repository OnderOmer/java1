package SelfStudy;

public class NestedIfStatement {
    public static void main(String[] args) {

        int hourOfDay = 9;
        if(hourOfDay < 12){
            System.out.println("Good Morning!");
        }else{
            if(hourOfDay < 17){
                System.out.println("Good afternoon!");
            }else{
                System.out.println("Good Night!");
            }


        }

        System.out.println("=====================================");


        int typeSelection = 1;
        int drinkSelection = 1;
        double price;
        String drink;
        if(typeSelection == 1){
            System.out.println("Hot Drinks: 1 - Tea. 2 - coffee");
            if(drinkSelection == 1) {
                price = 2.0;
                drink = "tea";
            }else if (drinkSelection ==2) {
                price = 4.0;
                drink = "coffee";
            }else{
                System.out.println("Invalid hot drink Selection");

            }
        }







    }
}
