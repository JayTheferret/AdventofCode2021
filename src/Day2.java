import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Day2 {
    public static int Part1() throws IOException {

   // forward X increases the horizontal position by X units.
   // down X increases the depth by X units.
   // up X decreases the depth by X units.

        String[] string = Methods.readInputIntoStringList("./input_Files/Day2.txt");

        int horizontalPosition = 0;
        int depth = 0;

        String sString = new String();
        String iString = new String();
        int value;

            for (String s : string) {
                iString = s.replaceAll("[^0-9]","");
                sString = s.replaceAll("[^A-Za-z]","");

                value = Integer.parseInt(iString);

                if(sString.equals("forward")){
                    horizontalPosition += value;
                }
                if(sString.equals("down")){
                    depth += value;
                }
                else if(sString.equals("up")){
                    depth -= value;
                }
                //System.out.println("sString: " + sString);
                //System.out.println("iList: " + value);
            }

        return horizontalPosition*depth;
    }
    public static int Part2(){
        return 0;
    }
}
