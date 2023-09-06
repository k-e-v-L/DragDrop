import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class DragPanel extends JPanel {

    ImageIcon image = new ImageIcon("Naeratus.png");
    final int WIDTH = image.getIconWidth(); //final beacause we are not planning on changing the size
    final int HEIGHT = image.getIconHeight(); //final beacause we are not planning on changing the size
    Point imageCorner;
    Point previousPt;
    DragPanel(){

        imageCorner = new Point(0,0);
        ClickListener clickListener = new ClickListener();
        DragListener dragListener = new DragListener();
        this.addMouseListener(clickListener);
        this.addMouseMotionListener(dragListener);
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        image.paintIcon(this,g, (int) imageCorner.getX(), (int) imageCorner.getY());

    }
    private class ClickListener extends MouseAdapter{

        public void mousePressed(MouseEvent e) {
            previousPt = e.getPoint(); //updates the previous point to whereever we clicked
        }

    }
    private class DragListener extends MouseMotionAdapter{

        public void mouseDragged(MouseEvent e){

            Point currentPt = e.getPoint(); //Where our mouse currently is

            imageCorner.translate(
                    (int) ((currentPt.getX()) - previousPt.getX()),
                    (int) ((currentPt.getY()) - previousPt.getY())
            );
            previousPt = currentPt;
            repaint();
        }

    }
}
