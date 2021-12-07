import java.io.IOException;
import java.util.ArrayList;

public class Day3 {
    public static int Part1() throws IOException {

        String[] string = Methods.readInputIntoStringList("./input_Files/Day3.txt");

        String gamma = "";
        String epsilon = "";

        int[] arr0 = new int[12];
        int[] arr1 = new int[12];

        for (String s : string) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '1') {
                    arr1[i]++;
                } else if (s.charAt(i) == '0') {
                    arr0[i]++;
                }
            }
        }

        for (int j = 0; j < 12; j++) {
            if (arr0[j] > arr1[j]) {
                gamma += "0";
                epsilon += "1";
            } else if (arr0[j] < arr1[j]) {
                gamma += "1";
                epsilon += "0";
            }
        }

        int gammaDez = Integer.parseInt(gamma, 2);
        int epsilonDez = Integer.parseInt(epsilon, 2);

        System.out.println("Gamma: " + gamma + " = " + gammaDez);
        System.out.println("Epsilon: " + epsilon + " = " + epsilonDez);

        return gammaDez * epsilonDez;
    }

    public static int Part2() throws IOException {

        String[] string = Methods.readInputIntoStringList("./input_Files/Day3.txt");
        
        int[] arr0 = new int[12];
        int[] arr1 = new int[12];

        String oxygr = "";
        String CO2r = "";

        int counter = 0;

        //oxygen

        for (int i = 0; i < 12; i++) {

            for (String s : string) {
                if (s.charAt(i) == '1') {
                    arr1[i]++;
                } else if (s.charAt(i) == '0') {
                    arr0[i]++;
                }
            }

            if (arr0[i] > arr1[i]) {
                oxygr += "0";

                String[] temp = new String[arr0[i]];

                for (String s : string) {
                    if (s.charAt(i) == '0') {
                        temp[counter] = s;
                        counter++;
                    }
                }
                string = temp;
                counter = 0;
            } else if (arr0[i] <= arr1[i]) {
                oxygr += "1";

                String[] temp = new String[arr1[i]];

                for (String s : string) {
                    if (s.charAt(i) == '1') {
                        temp[counter] = s;
                        counter++;
                    }
                }
                string = temp;
                counter = 0;
            }
            if(string.length == 1){
                oxygr = string[0];
                break;
            }
        }

        //CO2

        string = Methods.readInputIntoStringList("./input_Files/Day3.txt");
        arr0 = new int[12];
        arr1 = new int[12];

        for (int j = 0; j < 12; j++) {

            for (String s : string) {
                if (s.charAt(j) == '1') {
                    arr1[j]++;
                } else if (s.charAt(j) == '0') {
                    arr0[j]++;
                }
            }

            if (arr0[j] > arr1[j]) {
                CO2r += "1";

                String[] temp = new String[arr1[j]];

                for (String s : string) {
                    if (s.charAt(j) == '1') {
                        temp[counter] = s;
                        counter++;
                    }
                }
                string = temp;
                counter = 0;
            } else if (arr0[j] <= arr1[j]) {
                CO2r += "0";

                String[] temp = new String[arr0[j]];

                for (String s : string) {
                    if (s.charAt(j) == '0') {
                        temp[counter] = s;
                        counter++;
                    }
                }
                string = temp;
                counter = 0;
            }
            if(string.length == 1){
                CO2r = string[0];
                break;
            }
        }
        //---------------------

        System.out.println(oxygr);
        System.out.println(CO2r);

        int oxyDez = Integer.parseInt(oxygr, 2);
        int CO2Dez = Integer.parseInt(CO2r, 2);

        System.out.println("Oxygen:   " + oxygr + " = " + oxyDez);
        System.out.println("CO2: " + CO2r + " = " + CO2Dez);

        return oxyDez * CO2Dez;
    }
}
