package week9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Utils {
    public static String readContentFromFile(String path){
        File F = new File(path);
        Scanner scanner = null;
        try {
            scanner = new Scanner(F);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // đọc file theo dòng
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
           System.out.println(line);

        }
        return path;
    }
    public static void writeContentToFile(String path)  {
        File F = new File(path);
        try {
            FileWriter fw = new FileWriter(F);
            fw.write("ha van bac"+ "\n");
            fw.close();
        }catch (IOException e){
            e.printStackTrace();
        }



    }
    public static void writeContentToFile2(String path){
        File F= new File(path);
        try {
            FileWriter fw = new FileWriter(F, true);
            fw.write("ha van bac"+"\n");
            fw.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }



    }
    public static File FindFileByName(String folderPath, String fileName){
        File F = new File(folderPath);
        File[] Fs = F.listFiles();
        for(File F2 : Fs){
            if (F2.getName().equals(fileName)) return F2;
        }
        return null;

    }
    public static void main(String[] args){
        String path = "src/week9/test.txt";
        String folderPath= "src/week9";
        System.out.println("Ban đầu");
        readContentFromFile(path);

        System.out.println("Sau khi ghi lần 1");
        writeContentToFile(path);
        readContentFromFile(path);

        System.out.println("Sau khi ghi lần 2");
        writeContentToFile2(path);
        readContentFromFile(path);
        System.out.println("Tìm tệp trong thư mục");
        File F = FindFileByName(folderPath,"test4.txt");
        readContentFromFile(F.getAbsolutePath());







    }
}
