package task13;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class MyGenListPanel extends MyColorPanel implements ColorChangeListener {
    private final List<ColorChangeListener> listeners = new ArrayList<>();

    public void addColorChangeListener(ColorChangeListener listener) {
        listeners.add(listener);
    }

    public void fireColorChanged(Color c) {
        ColorEvent event = new ColorEvent(this, c);
        for (ColorChangeListener listener : listeners) {
            listener.colorChange(event);
        }
    }

    @Override
    public void colorChange(ColorEvent e) {
        new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
            Color newColor = new Color(random.nextInt(256), 0, random.nextInt(256));
            SwingUtilities.invokeLater(() -> setBackground(newColor));
            fireColorChanged(newColor);
        }).start();
    }

    public void triggerCycle() {
        Color newColor = new Color(random.nextInt(256), 0, random.nextInt(256));
        setBackground(newColor);
        fireColorChanged(newColor);
    }
}