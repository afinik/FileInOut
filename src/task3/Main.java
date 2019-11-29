package task3;

import java.io.*;

public class Main {
    static RandomAccessFile randomAccessFile;

    public static int numberOfSymbol;

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
        Byte[] b = new Byte[1800];
        numberOfSymbol = b.length * getNumberOfPage();
        System.out.println(getNumberOfPage());

        try {
            randomAccessFile = new RandomAccessFile("all.txt", "r");
            try {
                randomAccessFile.seek(numberOfSymbol);
                randomAccessFile.readFully(b);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
