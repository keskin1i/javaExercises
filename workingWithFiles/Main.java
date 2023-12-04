package workingWithFiles;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //createFile();
        //getFileInfo();
       // readFile();
        //writeFile();
    }
    public static void createFile() {
        File file = new File("C:/Users/MUHAMMED/Desktop/btk-javae-xams/src/javaDemos/students.txt");
        try {
            file.createNewFile();
            if (file.createNewFile()) {
                System.out.println("File created");
            }else{
                System.out.println("File already exists");
            }
        } catch (Exception e) {
            System.out.println(" File not created : "+e.getMessage());
        }
    }
    public static void getFileInfo(){

        File file = new File("C:/Users/MUHAMMED/Desktop/btk-javae-xams/src/javaDemos/students.txt");
        if (file.exists()) {
            System.out.println("File name: " + file.getName());
            System.out.println("Absolute path: " + file.getAbsolutePath());
            System.out.println("Writeable: " + file.canWrite());
            System.out.println("Readable: " + file.canRead());
            System.out.println("File size in bytes: " + file.length());
        }
    }
    public static void readFile(){
        File file = new File("C:/Users/MUHAMMED/Desktop/btk-javae-xams/src/javaDemos/students.txt");
        try {
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                System.out.println(data);
            }
           reader.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
   public static void writeFile(){
       try {
           BufferedWriter writer = new BufferedWriter(new FileWriter("C:/Users/MUHAMMED/Desktop/btk-javae-xams/src/javaDemos/students.txt",true));
           writer.newLine();
           writer.write("Hello");
           System.out.println("File written successfully");
           writer.close();
       } catch (IOException e) {
           throw new RuntimeException(e);
       }

   }
}
