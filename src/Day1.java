import java.io.IOException;
import java.util.ArrayList;

public class Day1 {
    public static int Part1() throws IOException {

        int incr_counter = 0;
        int[] arr = Methods.readInputintoArray("./input_Files/Day1.txt");

        for(int i = 1; i < arr.length; i++){
            if(arr[i] >= arr[i-1] ){
                incr_counter++;
            }
        }
        return incr_counter;
    }

    public static int Part2() throws IOException {

        int incr_counter = 0;
        int[] arr = Methods.readInputintoArray("./input_Files/Day1.txt");

        for(int i = 2; i < arr.length-1; i++){
            if(arr[i]+arr[i-1]+arr[i-2] < arr[i-1]+arr[i]+arr[i+1] ){
                incr_counter++;
            }
        }
        return incr_counter;
    }
}
