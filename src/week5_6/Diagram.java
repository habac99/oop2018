package week5_6;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Diagram  {
    public static void main(String[] a){

        JFrame mainFrame = new JFrame("Week 5");
        Layer layer = new Layer();
        Layer layer2 = new Layer();
        layer.removeTriangle();
        mainFrame.add(layer);

        mainFrame.setVisible(true);


        mainFrame.setSize(600,600);
        mainFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

}
