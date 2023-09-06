import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseMotionAdapter;

public class DragPanel extends JPanel {

    ImageIcon image = new ImageIcon("Naeratus.png");
    final int WIDTH = image.getIconWidth(); //final beacause we are not planning on changing the size
    final int HEIGHT = image.getIconHeight(); //final beacause we are not planning on changing the size
    DragPanel(){
    }
    public void paintComponent(Graphics g) {

    }
    private class ClickListener extends MouseAdapter{

    }
    private class DragListener extends MouseMotionAdapter{

    }
}
