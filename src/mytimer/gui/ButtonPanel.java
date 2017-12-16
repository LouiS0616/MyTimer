package mytimer.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

class ButtonPanel extends JPanel {
    private final ActionListener listener;

    ButtonPanel(ActionListener listener) {
        this.listener = listener;

        MyButton start = new MyButton("Start");
        MyButton stop  = new MyButton("Stop");
        MyButton reset = new MyButton("Reset");

        add(start);
        add(stop);
        add(reset);
    }

    class MyButton extends JButton {
        MyButton(String text) {
            this(text, new Dimension(100, 48));
        }
        MyButton(String text, Dimension buttonSize) {
            super(text);

            setForeground(Color.BLACK);
            setBackground(Color.WHITE);
            setVerticalAlignment(JButton.CENTER);
            setHorizontalAlignment(JButton.CENTER);
            setActionCommand(text);

            setFont(
                    new Font("Arial", Font.PLAIN, 24)
            );
            setPreferredSize(buttonSize);

            addActionListener(listener);
        }
    }
}