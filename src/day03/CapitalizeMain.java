package day03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class CapitalizeMain {
    public static void main(String[] args) throws FileNotFoundException, IOException {

        String inputFile = args[0];
        String outputFile = args[1];
        
        //Open inputFile for reading
        Reader reader = new FileReader(inputFile);
        BufferedReader bufferedReader = new BufferedReader(reader);

        //Open file for writing
        Writer writer = new FileWriter(outputFile);
        BufferedWriter bufferedWriter = new BufferedWriter(writer);

        String line = "x";
        while (line != null) {
            //Read a line
            line = bufferedReader.readLine();
            
            //If line is null, we have reach the end of file
            if(null == line)
                break;

            //System.out.printf(">>>> line: %s\n", line.toUpperCase());
            String transformed = line.toUpperCase();
            
            //Write to file
            bufferedWriter.write(transformed + "\n");
        }

        //Close the files
        reader.close();

        //Flush remaining data to file
        bufferedWriter.flush();
        writer.flush();
        writer.close();

    }
}
