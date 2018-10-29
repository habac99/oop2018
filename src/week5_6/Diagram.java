package week5_6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Random;

import static java.awt.Color.blue;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Diagram  {
    private static int numOfLayer = 5;
    public static void  removeCircle2(ArrayList<Shape> layer){
        int i ;
        for(i=0;i<layer.size();i++){

            if(layer.get(i) instanceof Circle){
                layer.remove(i);
                i--;
            }
        }

    }
    public static void main(String[] a){

        JFrame mainFrame = new JFrame("Week 5");
//        Layer layer = new Layer();
//        Layer layer2 = new Layer();
        ArrayList<Layer> layers = new ArrayList<>();
        for(int i = 0;i<numOfLayer;i++){
            Layer test = new Layer();
            layers.add(test);
        }
        for(int i = 0;i<numOfLayer;i++){
            Random ran = new Random();
            int j = ran.nextInt(2);
            if(j==0  ) layers.get(i).setVisible(false);
            else {
               // layers.get(i).setVisible(true);
                mainFrame.add(layers.get(i));

            }
        }



        mainFrame.setBackground(blue);


        mainFrame.setVisible(true);



        mainFrame.setBounds(400,20,600,600);
        mainFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

}
