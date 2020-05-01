package day28_DateTime;
import java.time.LocalTime;
public class Time {
    public static void main(String[] args) {
        LocalTime time1 = LocalTime.now();

        System.out.println(time1);

        LocalTime time2 = LocalTime.of(23, 50, 30);

        System.out.println(time2);

        LocalTime time3 = LocalTime.of(21,23,45);
        System.out.println(time3);


    }


}
