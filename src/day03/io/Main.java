package day03.io;

import java.nio.file.Path;
import java.io.File;
import java.nio.file.Paths;


public class Main {
    
    public static void main(String[] args) {
        //Referece to a file
        Path p = Paths.get("catinthehat.txt");
        System.out.printf("toString: %s\n", p.toString());

        //Get the file
        File f = p.toFile();

        //Information on the file
        System.out.printf("get absolute path: %s\n", f.getAbsolutePath());
        System.out.printf("get name: %s\n", f.getName());

        //Use file
        //File cat = new File("src/day03/io/Main.java");

    }
}
