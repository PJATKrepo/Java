package task13;

import javax.swing.*;

public class MyListenerPanel extends MyColorPanel implements ColorChangeListener {
    @Override
    public void colorChange(ColorEvent e) {
        SwingUtilities.invokeLater(() -> setBackground(e.getColor()));
    }
}