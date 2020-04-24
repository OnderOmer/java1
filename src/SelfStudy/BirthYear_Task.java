package SelfStudy;

public class BirthYear_Task {
    public static void Age(int birthYear){ // 2000

        int currentYear = 2020;
        int age = currentYear - birthYear;
        if(age>0 && birthYear >1900){
            System.out.println(age);
        }else{
            System.out.println("You are not born yet");
        }

    }

    public static void main(String[] args) {

        printHelloCybertek();
        Age(2000 );
    }

    public static void printHello(){
        System.out.println("Hello");
    }
    public static void printCybertek(){
        System.out.println("Cybertek");
    }
    public static void printHelloCybertek(){
        printHello();
        printCybertek();

    }
}
