package task11;

import javax.swing.*;
import java.awt.*;

public
    class L02BorderLayoutPanel
    extends MyPanel {

    public L02BorderLayoutPanel() {
        JPanel demo = createDemoPanel();
        demo.setLayout(new BorderLayout(10, 10));

        JButton northBtn = createStyledButton("NORTH head", 0);
        northBtn.setPreferredSize(new Dimension(0, 50));

        JButton southBtn = createStyledButton("SOUTH bottom", 1);
        southBtn.setPreferredSize(new Dimension(0, 50));

        JButton eastBtn = createStyledButton("<html>E<br>A<br>S<br>T</html>", 2);
        eastBtn.setPreferredSize(new Dimension(80, 0));

        JButton westBtn = createStyledButton("<html>W<br>E<br>S<br>T</html>", 3);
        westBtn.setPreferredSize(new Dimension(80, 0));

        JButton centerBtn = createStyledButton("<html>CENTER</html>", 4);

        demo.add(northBtn, BorderLayout.NORTH);
        demo.add(southBtn, BorderLayout.SOUTH);
        demo.add(eastBtn, BorderLayout.EAST);
        demo.add(westBtn, BorderLayout.WEST);
        demo.add(centerBtn, BorderLayout.CENTER);

        add(demo, BorderLayout.CENTER);
    }

}
