import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class Methods {

    static int[] readInputintoArray(String pathName) throws IOException {

        Path fileName = Path.of(pathName);
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
}
