package task2;

import javax.naming.CompoundName;
import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    private static String strong;
    private static Boolean weNeverWriteToAllFile = true;

    private static String nameOfAllFile = "all";

    public static void readFromFile(String fileName){
        strong = "";
        LinkedList<Character> s = new LinkedList<>();

        try(InputStream in = new FileInputStream(fileName)){
            int x = 0;

            while((x = in.read()) != -1){
                s.add((char)x);
            }

            int i = 0;

            for (int j = 0; j < s.size(); j++){
                writeIntoFile(nameOfAllFile + ".txt", s.get(j));
                System.out.print(s.get(j));
            }
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    public static void writeIntoFile(String fileNameToRecord, Character s){
        try(OutputStream out = new FileOutputStream(fileNameToRecord, true)) {
            int i = 0;
            out.write(s);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        while (new File(nameOfAllFile + ".txt").exists()){
            nameOfAllFile = nameOfAllFile + "1";
            System.out.println("The file " + nameOfAllFile + ".txt is exist");
        }
        readFromFile("test.txt");
        readFromFile("test2.txt");
        readFromFile("test3.txt");
        readFromFile("test4.txt");
        readFromFile("test5.txt");
/*        writeIntoFile("all.txt", "test.txt");
        writeIntoFile("all.txt", "test2.txt");
        writeIntoFile("all.txt", "test3.txt");
        writeIntoFile("all.txt", "test4.txt");
        writeIntoFile("all.txt", "test5.txt");*/
    }

}
