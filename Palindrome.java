package palindrome;
import javax.swing.*;
import java.awt.event.*;

public class Palindrome {
    
    //Function to check if the string is a palindrome or not
    static boolean PalindromeCheck(String str){
        //An index (i) pointing to the begining of our String 
        //and a variable that will receive the length of our String and subtract one; pointing to the end of our String
        int i = 0, j = str.length() - 1;
        //While there are caracters
        while(i < j){
            //check if characters in i is different of j
            if (str.charAt(i) != str.charAt(j))
                return false; //return an it's not a palindrome
            //increment i and decrement j 
            i++;
            j--;
        }
        //Giving an it's a palindrome
        return true;
    }
    
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        String text = JOptionPane.showInputDialog(frame, "Type a text:");
        
        if(PalindromeCheck(text))
            JOptionPane.showMessageDialog(frame, "It's a palindrome!");
        else
            JOptionPane.showMessageDialog(frame, "It's not a palindrome!");
    }
}
