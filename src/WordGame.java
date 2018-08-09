import java.io.*;
import java.util.*;

public class WordGame {

    private final String FilePath = "src/resources/sowpods.txt";

    private int wordLength = 4;

    public ArrayList<String> fetchWords() {
        ArrayList<String> words=new ArrayList<String>();

        try{
        File file =
                new File(FilePath);
        Scanner sc = new Scanner(file);

        while (sc.hasNextLine()){
            String temp = sc.nextLine();

            if(temp.length() == wordLength){
                words.add(temp);
            }
        }
        }
        catch(IOException e){
            System.out.println(e);
        }

        return words;
    }

}
