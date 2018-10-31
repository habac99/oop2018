package week7.task2;
import week7.task1.*;

import java.io.*;

public class Task2 {
    public static void main(String[] args){
        /**
         * NullPointerException
         */
        try{
            Exception e=null ;
            //System.out.println(e);
            e.getMessage();

        }catch (Exception e){
            e.printStackTrace();
        }
        /**
         * ArrayIndexOutOfBoundsException
         */
        try{
            int[] a = new int[20];
            a[20] = 12;

        }catch (Exception e){
            e.printStackTrace();
        }
        /**
         * ArithmeticException
         */
        try{
            int b= 5/0;
        }catch (Exception e){
            e.printStackTrace();
        }
        /**
         * ClassCastException
         */
        try{
            Expression ex1 = new Numeral(2);
            Square sq = (Square) ex1;

        }catch (Exception e){
            e.printStackTrace();
        }


        /**
         * FileNotFoundException
         */
        try{
            BufferedReader readFile = new BufferedReader(new InputStreamReader(new FileInputStream("abc.txt"), "UTF-8"));

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
