import java.io.IOException;

public class Day3 {
    public static int Part1() throws IOException {

        String[] string = Methods.readInputIntoStringList("./input_Files/Day3.txt");
        
        String gamma = "";
        String epsilon = "";

        int[] arr0 = new int[12];
        int[] arr1 = new int[12];

        for(String s: string){
            for(int i = 0; i< s.length(); i++){
                if(s.charAt(i) =='1'){
                    arr1[i] ++;
                }
                else if(s.charAt(i) == '0'){
                    arr0[i] ++;
                }
            }
        }

        for(int j = 0; j < 12; j++){
            if(arr0[j] > arr1[j]){
                gamma += "0";
                epsilon += "1";
            }
            else if (arr0[j] < arr1[j]){
                gamma += "1";
                epsilon += "0";
            }
        }

        int gammaDez = Integer.parseInt(gamma,2);
        int epsilonDez = Integer.parseInt(epsilon,2);

        System.out.println("Gamma: " + gamma + " = " + gammaDez);
        System.out.println("Epsilon: " + epsilon + " = " + epsilonDez);

        return gammaDez*epsilonDez;
    }
}
