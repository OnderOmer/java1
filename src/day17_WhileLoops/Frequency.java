package day17_WhileLoops;

public class Frequency {
    public static void main(String[] args) {


        String str = "Java is fun, Java is coll"; //


        int count = 0; //+1
        while (str.contains("Java")){
            count++;

        str = str.replaceFirst("Java","");// after counting the firs "JAva, we need to remove it from

        }
        System.out.println(count);
    }
}
