package forecast.algorithms.gui;

import javax.swing.JFrame;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;

public class JFrameWithTwoJButtons {
        public static void main(String[] args) {
                /*JFrame frame = new JFrame("Adding Component to JFrame");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                JButton closeButton = new JButton("Close");
                JButton helpButton = new JButton("Help");
                Container contentPane = frame.getContentPane();
                contentPane.add(closeButton);
                contentPane.add(helpButton);
                frame.pack();
                frame.setVisible(true);*/
                
                JFrame frameX = new JFrame("Flow Layout Test");
                frameX.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                Container contentPaneX = frameX.getContentPane();
                contentPaneX.setLayout(new FlowLayout());

                for(int i = 1; i <= 3; i++) {
                        contentPaneX.add(new JButton("Button " + i));
                }

                frameX.pack();
                frameX.setVisible(true);
        }
}