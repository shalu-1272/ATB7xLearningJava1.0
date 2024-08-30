package ex_08172024.exceptionhandling;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab173 {
    public static void main(String[] args) throws FileNotFoundException {
        readFile();
    }
        public static void readFile() throws FileNotFoundException {

            String path = "C://https.login";
            File file = new File(path);
            FileReader file1 = new FileReader(file);
        }

    }
