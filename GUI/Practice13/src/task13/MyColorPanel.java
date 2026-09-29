package task13;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

class MyColorPanel extends JPanel {
    Random random = new Random();

    public MyColorPanel() {
        setPreferredSize(new Dimension(80, 80));
        setBackground(new Color(random.nextInt(256), 0, random.nextInt(256)));
    }
}