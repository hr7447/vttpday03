package day03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.HashSet;
import java.util.Set;

public class RemoveStopWords {
    public static void main(String[] args) throws FileNotFoundException, IOException {

        String inputFile = args[0];
        String stopWordsFile = args[1];
        String outputFile = args[2];

        Set<String> stopWords = new HashSet<>();
        Reader swReader = new FileReader(stopWordsFile);
        BufferedReader swBufferedReader = new BufferedReader(swReader);
        String swLine = "y";
        while((swLine = swBufferedReader.readLine()) != null) {
            stopWords.add(swLine.toLowerCase().trim());
        }
        swBufferedReader.close();
        
        //Open inputFile for reading
        Reader reader = new FileReader(inputFile);
        BufferedReader bufferedReader = new BufferedReader(reader);

        //Open file for writing
        Writer writer = new FileWriter(outputFile);
        BufferedWriter bufferedWriter = new BufferedWriter(writer);

        while ((swLine = bufferedReader.readLine()) != null) {
            String[] words = swLine.split(" ");
            for (String word : words) {
                word.toLowerCase().trim();
                if (!stopWords.contains(word)) {
                    bufferedWriter.write(word + " ");
                }
            }
            bufferedWriter.newLine();

        }

        //Close the files
        bufferedReader.close();
        reader.close();

        //Flush remaining data to file
        bufferedWriter.flush();
        writer.flush();
        writer.close();

    }
}
