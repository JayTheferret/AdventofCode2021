import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class Day4 {

    static ArrayList<int[][]> getCards() throws IOException {

        var cards = new ArrayList<int[][]>();
        int singleCard[][] = new int[5][5]; //[row]->[column]^

        Path fileName = Path.of("./input_Files/Day4.txt");
        String input_as_string = Files.readString(fileName);

        var reader = new BufferedReader(new FileReader("./input_Files/Day4.txt"));
        var DrawString = reader.readLine();

        String[] string = input_as_string
                .replaceAll(DrawString,"")
                .replaceAll("\r","")
                .replaceAll("\n","")
                .split(" ");

       // for(String s: string) {
         //   if(!s.equals("")) {

        int index = 0;
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < 5; j++) {
                        if(!string[index].equals("")) {
                            singleCard[i][j] = Integer.parseInt(string[index]);
                        }
                        if(i == 4){
                            cards.add(singleCard);
                            singleCard = new int[5][5];
                        }
                        index++;
                    }
                }
       //     }
      //  }

        return cards;
    }

    static String[] getDraws() throws IOException {

        var reader = new BufferedReader(new FileReader("./input_Files/Day4.txt"));

        var DrawString = reader.readLine();
        String[] Draws = DrawString.split(",");

        return Draws;
    }

    public static int Part1() throws IOException {

        var bingoCards = getCards();
        String[] draws = getDraws();

        return 0;
    }
}
