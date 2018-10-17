package week5_6;


import javax.swing.*;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

public class MainFrame extends JPanel implements ActionListener {
    public Timer t = new Timer(5, this);
    public double x = 0, y = 0, velX = 2, velY = 2,x1 = 3, y1 =6,velX1  = 3,velY1 = 4;

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
       // Circle c= new Circle(40,0,0);

        Ellipse2D circle = new Ellipse2D.Double(x,y,60,60) ;
        Rectangle2D rec    = new Rectangle2D.Double(x1, y1,30,40);
        g2.fill(circle);
        g2.fill(rec);
        t.start();
    }
    public void actionPerformed(ActionEvent e){
        if(x<0 || x>540){
            velX = -velX;
        }
        if(y<0 || y > 340){
            velY = -velY;
        }
        if(x1<0 || x1>540){
            velX1 = -velX1;
        }
        if(y1 <0 || y1 > 340){
            velY1 = -velY1;
        }
        x1+=velX1;
        y1 +=velY1;

        x += velX;
        y += velY;


        repaint();
    }
    public static  void main(String[] a){
        MainFrame mF = new MainFrame();
        JFrame F = new JFrame();
        F.add(mF);
        F.setVisible(true);
        F.setTitle("Test");
        F.setSize(600, 400);
        F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);




    }






}
