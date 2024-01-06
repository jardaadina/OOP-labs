import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DragDemo {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame window = new JFrame();
            window.setTitle("Drag Demo");
            window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            window.setContentPane(new DragBallPanel());
            window.pack();
            window.setVisible(true);
        });
    }
}
