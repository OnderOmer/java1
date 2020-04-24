package SelfStudy;

public class uniqueValues {

    public static void main(String[] args) {

        String[] arr = {"A", "B", "A", "C", "D"};
        for( String each2 : arr ){ // 3: A,

            int count = 0;
            for( String each : arr ){
                if(each.equals(each2)){
                    count++;
                }
            }

            if(count == 1){  // if the character is unique
                System.out.println(each2);
            }


        }

















    }
}
