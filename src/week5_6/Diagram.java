package week5_6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Diagram  {
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
        Layer layer = new Layer();
        Layer layer2 = new Layer();
        System.out.println("Số hình ban đầu là :"  + layer.layer.size());
        layer.removeTriangle();
        System.out.println("Số hình sau khi xoá tam giác là: " +  layer.layer.size());
        //layer.removeCircle();
        removeCircle2(layer.getLayer());
        System.out.println("Số hình sau khi xoá hình tròn là : " + layer.layer.size());
        mainFrame.setBackground(Color.blue);


        mainFrame.add(layer);

        mainFrame.setVisible(true);


        //mainFrame.setSize(600,600);
        mainFrame.setBounds(400,20,600,600);
        mainFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

}
