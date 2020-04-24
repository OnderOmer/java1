package Practice_04_22_2020;

public class void_Method {

    public static void main(String[] args) {
        print();
        System.out.println("===============================================");
         boolean USCitizen = true;
         int age = 21;
         Vote(age,USCitizen);
    }

    public static void print() {

        System.out.println("Hello Batch 18");
        System.out.println("Hello Batch 18");
        System.out.println("Hello Batch 18");
        System.out.println("Hello Batch 18");
        System.out.println("Hello Batch 18");
    }

    public static void Vote(int age, boolean USCitizen) {
        boolean eligibleToVote = age >= 18 && USCitizen == true;

        if (eligibleToVote) {
            System.out.println("You are eligible to vote");
        } else {
            System.out.println("You are not eligible to vote yet");
        }

    }

    public static void EligibleToBuCig (int age){
        if(age > 18){
            System.out.println("Eligible to but");
        }else{
            System.out.println("Not eligible to buy");
        }
        }
    }
