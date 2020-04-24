package day16_ForLoop;

public class Continue_Practice {

    public static void main(String[] args) {

        for(char ch = 'Z'; ch >= 'A'; ch--){
            if(ch == 'Y' || ch== 'H' || ch== 'J'||ch== 'D'){
                continue;

                            }
            System.out.println(ch+"");

        }




    }
}
