package reversingstring;
import javax.swing.*;
import java.awt.event.*;

public class ReversingString extends WindowAdapter {
    public static void main(String[] args) { 
        JFrame frame = new JFrame();
        String text = JOptionPane.showInputDialog(frame, "Text for reverse:");
        //StringBuilder allow us shortcut the way
        StringBuilder sb = new StringBuilder(text);
        //Using the function "reverse" rather than do a for loop
        JOptionPane.showMessageDialog(frame, sb.reverse().toString());
    }
    
}
