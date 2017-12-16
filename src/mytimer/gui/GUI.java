package mytimer.gui;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class GUI extends JFrame {
    private TimePanel timePanel;

    public GUI(String title) {
        super(title);

        setLayout(new BorderLayout());
        add(
            new ButtonPanel(new ButtonListener()),
            BorderLayout.CENTER
        );
        add(
            timePanel = new TimePanel(),
            BorderLayout.SOUTH
        );

        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    class ButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            switch(e.getActionCommand().toLowerCase()) {
            case "start":
                timePanel.startTimer();
                break;
            case "stop":
                timePanel.stopTimer();
                break;
            case "reset":
                timePanel.resetTimer();
                break;
            default:
                System.out.println(e);
            }
        }
    }
}

