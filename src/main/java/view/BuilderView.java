package view;

import controller.UmlDiagram;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BuilderView extends JPanel {
    public void dropView() {

        JButton btonClass =  new JButton("Class");
        btonClass.setBounds(330,450,80,30);

        JButton btonRelationship =  new JButton("Relation");
        btonRelationship.setBounds(400,450,80,30);
        JFrame jFrame = new JFrame("UML example");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setResizable(true);
        jFrame.add(new JPanel() {
            @Override
            public void paintComponents(Graphics g) {
                super.paintComponent(g);
                g.setFont(getFont().deriveFont(Font.CENTER_BASELINE, 24f));
                String nameClass = "example";

                }
            @Override
            public Dimension getPreferredSize() {
                return new Dimension(500, 340);
            }


        });
        jFrame.setPreferredSize(new Dimension(500,300));
        jFrame.setSize(500,600);
        jFrame.add(btonClass);
        jFrame.add(btonRelationship);
        btonClass.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RectangleComponent r = new RectangleComponent();
                r.setLocation(100,80);
                jFrame.add(r);
                jFrame.revalidate();
            }

        });
        jFrame.setLayout(new BorderLayout());
        jFrame.setVisible(true);

    }

    public static void main(String[] args) {
        new BuilderView().dropView();
    }
}
