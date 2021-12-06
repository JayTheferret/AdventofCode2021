import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class methods {

    static int[] readInputintoArray(String Path_Name) throws IOException {

        Path fileName = Path.of(Path_Name);
        String input_as_string = Files.readString(fileName);

        String[] string = input_as_string
                .replaceAll(" ","")
                .replaceAll("\"","")
                .replaceAll("\r","")
                .split("\n");

        int[] arr;
        arr = new int[string.length];

        for(int i = 0; i < string.length; i++){
            //System.out.println(string[i]);
            arr[i] = Integer.parseInt(string[i]);
        }
        return arr;


        /*Scanner scanner = new Scanner(new File(Path));
        List<Integer> list = new ArrayList<Integer>();
        while(scanner.hasNextInt()){
            list.add(scanner.nextInt());
        }
        return (Integer[]) list.toArray();*/
        /*String temp;

        BufferedReader reader = new BufferedReader(new FileReader(Path));

        while(reader.readLine() != null){
            temp = reader.readLine();
            arr = Integer.parseInt(temp);
        }/*

        return arr;*/
    }

    public static int day1() throws IOException {

        System.out.println("Day1: ");

        int incr_counter = 0;

        int[] arr = readInputintoArray("./input_Files/Day1.txt");

        for(int i = 1; i < arr.length; i++){
            if(arr[i] >= arr[i-1] ){
                incr_counter++;
            }
        }
        return incr_counter;

       /*
        System.out.println("Day1");
        var arr = readInputintoArray("./input_Files/Day1.txt");
        int incr_counter = 0;

        for(int i = 0; i <= readInputintoArray("./input_Files/Day1.txt").length-1; i++){
            System.out.println(arr[i]);
           // if(arr[i] <= arr[i+1]){}
        }

        return 1;*/
    }
}
