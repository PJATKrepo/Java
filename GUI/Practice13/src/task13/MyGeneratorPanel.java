package task13;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class MyGeneratorPanel extends MyColorPanel implements Runnable  {
    private List<ColorChangeListener> listeners = new ArrayList<>();

    public MyGeneratorPanel() {
        new Thread(this).start();
    }

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
    public void run() {
        while (true) {
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
            Color newColor = new Color(random.nextInt(256), 0, random.nextInt(256));
            SwingUtilities.invokeLater(() -> setBackground(newColor));
            fireColorChanged(newColor);
        }
    }
}