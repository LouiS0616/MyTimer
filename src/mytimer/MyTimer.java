package mytimer;

import mytimer.gui.GUI;
import javax.swing.SwingUtilities;

public class MyTimer {
    private MyTimer() {
        GUI gui = new GUI("My timer");
        gui.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(MyTimer::new);
    }
}
