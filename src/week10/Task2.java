package week10;

import java.util.Random;
import java.math.*;

public class Task2 {
    public static void BubbleSort(){
        double[] arr = new double[1000];
        Random ran = new Random();
        int i,j;
        for(i=0;i<1000;i++){
             arr[i] = ran.nextDouble() * 500;


        }
        double temp  = 0.0;
        for(i = 0;i<999;i++){
            for(j = 0;j<999 - i;j++){
                if(arr[j] > arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
        }
        for(i=0;i<1000;i++){
            System.out.println(arr[i]);
        }

    }
    public  static void main(String[] args){
        BubbleSort();
    }
}
