package mytimer.gui;

import mytimer.util.TimeCount;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

class TimePanel extends JPanel {
    private Timer timer;
    private TimeCount timeCount = new TimeCount();

    private JLabel timeLabel;

    TimePanel() {
        timeLabel = new JLabel(
                timeCount.toString()
        );
        timeLabel.setFont(
                new Font("Arial", Font.BOLD, 80)
        );
        add(timeLabel);

        timer = new Timer(1000, e -> {
            timeCount.countUpSeconds(1);
            update();
        });
    }

    private void update() {
        timeLabel.setText(timeCount.toString());
        repaint();
    }

    void resetTimer() {
        timeCount = new TimeCount();
        update();
    }
    void startTimer() {
        timer.start();
    }
    void stopTimer() {
        timer.stop();
    }
}
