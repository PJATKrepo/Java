package task13;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class MyFrame extends JFrame {
    public MyFrame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(640, 480);

        JPanel container = new JPanel();
        setContentPane(container);

        MyColorPanel mcp1 = new MyColorPanel();
        container.add(mcp1);

        MyGeneratorPanel mgp1 = new MyGeneratorPanel();
        container.add(mgp1);

        MyListenerPanel mlp1 = new MyListenerPanel();
        container.add(mlp1);

        MyListenerPanel mlp2 = new MyListenerPanel();
        container.add(mlp2);

        mgp1.addColorChangeListener(mlp1);
        mgp1.addColorChangeListener(mlp2);

        MyGenListPanel mglp1 = new MyGenListPanel();
        container.add(mglp1);

        MyGenListPanel mglp2 = new MyGenListPanel();
        container.add(mglp2);

        MyGenListPanel mglp3 = new MyGenListPanel();
        container.add(mglp3);

        mglp1.addColorChangeListener(mglp2);
        mglp2.addColorChangeListener(mglp3);
        mglp3.addColorChangeListener(mglp1);

        JButton start = new JButton("start");
        start.addActionListener(e -> mglp1.triggerCycle());
        container.add(start);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(MyFrame::new);
    }
}