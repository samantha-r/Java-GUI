/*
 * Author: Samantha Reizes
 * File Name: SlideShow.java
 * Purpose: A simple GUI for Discussion Week 4, CMSC 335
 * Date: September 10, 2020
 */
 
import java.awt.*;
import javax.swing.*; 
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
 
public class SimpleGUI extends JPanel implements ActionListener {
    
    static JFrame frame = new JFrame("A Quote from a Song");
    int counter = 0; 
    JButton clickForward;
    JButton clickBackward;
    String labelText = "Click forward for song lyrics:                        ";    
    JLabel myLabel = new JLabel(labelText); 
 
    public SimpleGUI() {
        super(new GridLayout(8,1,10,10));
        clickForward = new JButton(">");        
        add(clickForward);
        add(myLabel);                
        clickForward.addActionListener(this);      
    }
       
    @Override
    public void actionPerformed(ActionEvent e) {
        
        String [] someLyrics = new String [6];
        someLyrics [0] = "It's bitter, baby,";
        someLyrics [1] = "And it's very sweet.";
        someLyrics [2] = "I'm on a rollercoaster,";
        someLyrics [3] = "But I'm on my feet.";
        someLyrics [4] = "--Red Hot Chili Peppers, 'Soul to Squeeze'";
        someLyrics [5] = "   "; 
        
        labelText = someLyrics[counter];
        JTextField myTextField = new JTextField(labelText); 
        add(myTextField);
        frame.setVisible(false);
        frame.setVisible(true);
        counter++;
        while (counter > 5){                       
            frame.dispose();
            System.exit(0);
        }      
    }
    
    private static void createAndShowGUI() {
                
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        //Create and set up the content pane.
        JComponent newContentPane = new SimpleGUI();
        newContentPane.setOpaque(true);
        frame.setContentPane(newContentPane);
 
        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }
 
    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}