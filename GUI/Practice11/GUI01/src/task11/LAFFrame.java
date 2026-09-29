package task11;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public
    class LAFFrame
    extends JFrame {

    public static void main(String[] args) {
//TODO 01
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) { }

        SwingUtilities.invokeLater(() -> {
            LAFFrame frame = new LAFFrame();
            frame.setVisible(true);
        });
    }

    private Random random = new Random();
    private int dialogCount = 0;

//TODO 02
    private Map<String, String> lafMap = new HashMap<>();


    public LAFFrame() {
        setTitle("JOptionPane & ComboBox L&F");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 400);
        setLayout(new BorderLayout(10, 10));

//TODO 03
        UIManager.LookAndFeelInfo[] lafs = UIManager.getInstalledLookAndFeels();
        String[] lafNames = new String[lafs.length];

        for (int i = 0; i < lafs.length; i++) {
            lafNames[i] = lafs[i].getName();
            lafMap.put(lafs[i].getName(), lafs[i].getClassName());
        }

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(
            new BoxLayout(mainPanel, BoxLayout.Y_AXIS)
        );

        JComboBox<String> lafComboBox = new JComboBox<>(lafNames);
        lafComboBox.setMaximumSize(
            new Dimension(300, 30)
        );
        lafComboBox.setAlignmentX(Component.CENTER_ALIGNMENT);

        String currentLaFName = UIManager.getLookAndFeel().getName();
        lafComboBox.setSelectedItem(currentLaFName);


        lafComboBox.addActionListener(
        e -> {
//TODO 05
            String selectedName = (String) lafComboBox.getSelectedItem();
            String className = lafMap.get(selectedName);
            applyLookAndFeel(className);
            }
        );


        JButton showDialogButton = new JButton("Pokaż Dialog");
        showDialogButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        showDialogButton.addActionListener(
        e -> {
//TODO 07
            showJumpingDialog();

            }
        );

        mainPanel.add(
            new JLabel("Select Look & Feel:")
        );
        mainPanel.add(lafComboBox);

        mainPanel.add(showDialogButton);

        add(mainPanel, BorderLayout.CENTER);
        setLocationRelativeTo(null);
    }

//TODO 04
    private void applyLookAndFeel(String className) {
        try {
            UIManager.setLookAndFeel(className);
            SwingUtilities.updateComponentTreeUI(this);
        } catch (Exception exception) {
            JOptionPane.showMessageDialog(this, "  " + exception.getMessage());
        }
    }

//TODO 06
    private void showJumpingDialog() {
        dialogCount++;
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        String[] options = {"Again"};
        JOptionPane optionPane = new JOptionPane(
                "",
                JOptionPane.INFORMATION_MESSAGE,
                JOptionPane.DEFAULT_OPTION,
                null,
                options,
                options[0]
        );
        JDialog dialog = optionPane.createDialog(this, "Dialog " + dialogCount);

        optionPane.setMessage(String.format("Dialog: %d\nCoordinates: (9999, 9999)\nCurrent Stylename: %s", dialogCount, UIManager.getLookAndFeel().getName()));
        dialog.pack();

        int dialogWidth = dialog.getWidth();
        int dialogHeight = dialog.getHeight();

        int maxX = screenSize.width - dialogWidth;
        int maxY = screenSize.height - dialogHeight;

        int x = random.nextInt(Math.max(1, maxX));
        int y = random.nextInt(Math.max(1, maxY));

        optionPane.setMessage(String.format("Dialog: %d\nCoordinates: (%d, %d)\nCurrent Stylename: %s",
                dialogCount, x, y, UIManager.getLookAndFeel().getName()));
        dialog.pack();

        dialog.setLocation(x, y);
        dialog.setVisible(true);

        Object selectedValue = optionPane.getValue();
        if ("Again".equals(selectedValue)) {
            SwingUtilities.invokeLater(() -> showJumpingDialog());
        }
    }

}