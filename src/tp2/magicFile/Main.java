package tp2.magicFile;

import java.io.File;
import java.util.Scanner;

public class Main {

    //Now we want to create a program that takes a file name and prints it s content

    public static void main(String[] args) {
        System.out.println("Give me your file name :)"); //try isi as an input ;)
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        printFileContent(fileName);
    }

    //Here you have 2 methods
    // getFileContent aims to get the content of a file
    // printFileContent that prints it s content otherwise print 'file not found :/'
    // todo : implement the methods and force exception handling in the printFile method

    private static String getFileContent(String fileName) throws FileNotFoundException {
        File file = new File("C:\\Users\\MANNOU1\\Desktop\\3éme\\TP_DAR\\tp2\\magicFile\\" + fileName);
        Scanner reader = new Scanner(file);
        String content = reader.nextLine();
        return content;
    }

   private static void printFileContent(String fileName) {
        try { 
            String data = getFileContent(fileName);
            System.out.println(data);
        }
        catch(FileNotFoundException e){
            System.out.println("file not found");
        }
    }
}
