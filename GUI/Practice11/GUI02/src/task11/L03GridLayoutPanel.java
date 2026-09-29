package task11;

import javax.swing.*;
import java.awt.*;

public
    class L03GridLayoutPanel
    extends MyPanel {

    public L03GridLayoutPanel() {
        JPanel demoContainer = new JPanel(new GridLayout(1, 2, 10, 10));

        JPanel calc = createDemoPanel();
        calc.setLayout(new BorderLayout(5, 5));
        calc.setBorder(BorderFactory.createTitledBorder("Calc - GridLayout (4,4)"));

        JTextField display = new JTextField("0");
        display.setFont(new Font("Arial", Font.BOLD, 24));
        display.setHorizontalAlignment(JTextField.RIGHT);
        calc.add(display, BorderLayout.NORTH);

        JPanel buttons = new JPanel(new GridLayout(4, 4, 3, 3));
        String[] calcButtons = {"7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-", "0", ".", "=", "+"};

        for (int i = 0; i < calcButtons.length; i++) {
            buttons.add(createStyledButton(calcButtons[i], i));
        }
        calc.add(buttons, BorderLayout.CENTER);

        JPanel colors = createDemoPanel();
        colors.setLayout(new GridLayout(3, 3, 5, 5));
        colors.setBorder(BorderFactory.createTitledBorder("Palette - GridLayout(3,3)"));

        for (int i = 0; i < 9; i++) {
            JPanel colorPanel = new JPanel();
            colorPanel.setBackground(this.colors[i]);
            colorPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            colors.add(colorPanel);
        }

        demoContainer.add(calc);
        demoContainer.add(colors);

        add(demoContainer, BorderLayout.CENTER);
    }

}
