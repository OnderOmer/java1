package SelfStudy;

public class MethodsOverloading2 {

    public static void main(String[] args) {
        //10,5
        sum2Numbers(10,5);

        // 10,5,15
        sum3Numbers(10,5,15);
        //10,20,30,5

        sum4Number(10,20,30,5);





    }


    public static void sum2Numbers(int a, int b){
        System.out.println(a+b);
    }

    public static void sum3Numbers (int a, int b, int c){
        System.out.println(a+b+c);
    }
    public static void sum4Number (int a, int b, int c, int d){
        System.out.println(a+b+c+d);
    }

}

