package countingwordsinastring;
import javax.swing.*;
import java.awt.event.*;

public class CountingWordsInAString {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        String text = JOptionPane.showInputDialog(frame, "Type a text:");
        int count = 0;
        
        for (int i=0; i<text.length(); i++){
            char ch = text.charAt(i);
            count++;
        }
        JOptionPane.showMessageDialog(frame, "The number of word in this text is "+count);
    }
    
}
