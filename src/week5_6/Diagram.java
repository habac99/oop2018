package week5_6;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Diagram  {
    public static void main(String[] a){
//        ArrayList<Layer> layer = new ArrayList<>();
//        layer.add(new Layer());
        JFrame mainFrame = new JFrame("Test");
        Layer layer = new Layer();


        mainFrame.add(layer);
        //layer.get(0).Show();

        mainFrame.setVisible(true);

        mainFrame.setSize(600,600);
        mainFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

}
