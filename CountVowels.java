package countvowels;
import javax.swing.*;
import java.awt.event.*;

public class CountVowels {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        int count = 0;
        String text = JOptionPane.showInputDialog(frame, "Type a text:");
        
        for (int i=0; i<text.length(); i++){
            //Assigns each char in the String to a char variable
            char ch = text.charAt(i);
            //Maybe it is better to put all vowels (capital letter or not) in the first if statement
            //If in the char variable there a,e,i,o or ou the we can count 
            if(ch == 'a' ||  ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }else if(ch == 'A' ||  ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
                count++;
            }
        }
        JOptionPane.showMessageDialog(frame, "Number of vowels in the given sentence is "+count);
    }
    
}
