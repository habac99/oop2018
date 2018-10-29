package week5_6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

/**
 * class layer kế thừa JPanel
 */

public class Layer extends JPanel implements  ActionListener {
    public Timer t = new Timer(5, this);
    public final int shapeCount = 25;
    public ArrayList<Shape> layer = new ArrayList<>();
    private boolean visible;
    /**
     * khỏi tạo layer
     */
    public Layer(){
        int i = 0;
        Random ran = new Random();
        while(i<= shapeCount){
            int j = ran.nextInt(4);
            if(j == 3){
                layer.add(new Rectangle());
            }
            else if(j== 2){
                layer.add(new Square());
            }
            else if(j== 1){
                layer.add(new Circle());
            }
            else if(j==0){
                layer.add(new Triangle());
            }
            i++;
        }
        visible = true;


    }

    /**
     * vẽ hình
     * @param g
     */
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        for (Shape sh : layer) {
            if (sh instanceof Circle) {

                    Circle c = (Circle) sh;
                    g.setColor(c.getColor());
                    g.fillOval(c.coord.getX(), c.coord.getY(), c.getRadius(), c.getRadius());


                } else if (sh instanceof Rectangle) {

                        if (sh instanceof Square) {
                            Square s = (Square) sh;
                            g.setColor(s.getColor());
                            g.fillRect(s.coord.getX(), s.coord.getY(), s.getSize(), s.getSize());
                        } else {
                            Rectangle r = (Rectangle) sh;
                            g.setColor(r.getColor());
                            g.fillRect(r.coord.getX(), r.coord.getY(), r.getLength(), r.getWidth());

                        }
                    }
                    else if(sh instanceof Triangle){
                        Triangle t = (Triangle) sh;
                        g.setColor(t.getColor());
                        g.fillPolygon(new int[]{t.getP1().getX(),t.getP2().getX(),t.getP3().getX()},
                                new int[]{t.getP1().getY(),t.getP2().getY(),t.getP3().getY()},3);

                }
            }








        t.start();


    }

    /**
     * hiện hình di chuyển
     */

    public void actionPerformed(ActionEvent e){
        for(Shape sh : layer){
            sh.move();
        }
        repaint();

    }
    public void removeTriangle(){
        int i ;
        for(i=0;i<layer.size();i++){

            if(layer.get(i) instanceof Triangle){
                 layer.remove(i);
                 i--;
            }
        }

    }

    /**
     * hàm xoá hình tròn
     */
    public void removeCircle(){
        int i ;
        for(i=0;i<layer.size();i++){

            if(layer.get(i) instanceof Circle){
                layer.remove(i);

                i--;
            }
        }

    }
    /**
     * hàm trả về layer
     */
    public ArrayList<Shape> getLayer(){
        return layer;

    }

    @Override
    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    @Override
    public boolean isVisible() {
        return visible;
    }

    public void RemoveDuplicate(){
        int i,j;
        for( i = 0;i<layer.size();i++){
            for(j=i+1;j<layer.size();j++) {
                if (layer.get(i) instanceof Circle && layer.get(j) instanceof Circle) {
                    Circle c1 = (Circle) layer.get(i);
                    Circle c2 = (Circle) layer.get(j);
                    if (c1.getRadius() == c2.getRadius() && c1.coord.getX() == c2.coord.getX() && c1.coord.getY() == c2.coord.getY()) {
                        layer.remove(j);
                        j--;
                    }
                }
            }
        }
    }


}



