package forecast.algorithms.gui;

import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class HandlingMouseEvent extends JFrame {
    JButton mouseButton = new JButton("No Mouse Movement Yet!");

    public HandlingMouseEvent() {
            super("Handling Mouse Event");
            this.initFrame();
    }

    private void initFrame() {
            this.setDefaultCloseOperation(EXIT_ON_CLOSE);
            this.setLayout(new FlowLayout());
            this.getContentPane().add(mouseButton);

            // Add a MouseListener to the JButton
            mouseButton.addMouseListener(new MouseListener() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                    }
                    @Override
                    public void mousePressed(MouseEvent e) {
                    }

                    @Override
                    public void mouseReleased(MouseEvent e) {
                    }

                    @Override
                    public void mouseEntered(MouseEvent e) {
                             mouseButton.setText("Mouse has entered!");
                    }

                    @Override
                    public void mouseExited(MouseEvent e) {
                             mouseButton.setText("Mouse has exited!");
                    }
            });
    }
    public static void main(String[] args) {
        HandlingMouseEvent frame = new HandlingMouseEvent();
        frame.pack();
        frame.setVisible(true);
    }
}