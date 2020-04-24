package day23_methods;

public class Methods_WithParameters {

    public static void main(String[] args) {
        EligibleToBuyAlcohol(45);// explicit casting
    }
    public static void EligibleToBuyAlcohol(int age){
      if(age >= +21){
          System.out.println("Eligible to buy alcohol");
      }else{
          System.out.println("Eligible to buy milk");
      }

    }


}
