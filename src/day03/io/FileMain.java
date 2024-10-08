package day03.io;

import java.io.File;

public class FileMain {

    public static void main(String[] args) {
        
        //System.out.printf("args.length = %d\n", args.length);

    //     for (int i=0; i<args.length; i++) {
    //         System.out.printf("%d. %s\n", i, args[i]);
    //         System.out.println(">>>>");
    //     }

    //     for (String s: args)
    //         System.out.printf(">>>> %s\n", value);
    // }
    
        if (args.length <= 0) {
            System.err.println("Please provide a file name");
            System.exit(1);
        }

        //Loop through the file and print their info
        for (String a: args) {
            System.out.printf(">>> Processing %s\n", a);
            File file = new File(a);
            System.out.printf("path: %s\n", file.getAbsolutePath());
            System.out.printf("is file: %s\n", file.isFile());
            System.out.printf("exists: %s\n", file.exists());
            System.out.printf("write: %s\n", file.canWrite());
        }
    }

}
