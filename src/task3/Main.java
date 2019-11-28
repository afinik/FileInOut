package task3;

import org.w3c.dom.ls.LSOutput;

import java.io.*;

public class Main {
    static RandomAccessFile randomAccessFile;

    private static int getNumberOfPage(){
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        try {
            return Integer.parseInt(bufferedReader.readLine());
        } catch (IOException e) {
            System.out.println("Вы ввели какую-то фигню или ничего не ввели. А теперь введите число(номер страницы):");
            return getNumberOfPage();
        }
        catch (NumberFormatException ex){
            System.out.println("Это было не число. А теперь введите число(номер страницы):");
            return 0;
        }
    }


    public static void main(String[] args) {
        System.out.println(getNumberOfPage());

/*        try {
            randomAccessFile = new RandomAccessFile("all.txt", "r");
            randomAccessFile.seek();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }*/
    }
}
