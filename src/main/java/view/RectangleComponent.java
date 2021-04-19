package view;

import java.awt.Rectangle;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

public class RectangleComponent extends JComponent
{
    Rectangle rect;

    public RectangleComponent()
    {
        rect  = new Rectangle(20, 20, 30, 30);
    }

    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        g2.draw(rect);
    }
}