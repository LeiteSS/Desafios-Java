/*
 * Simple Text Editor Write in Java
 * Based on: https://www.youtube.com/watch?v=qFvFIMU8btY
 */
package texteditor;
import javax.swing.JFrame;
import javax.swing.JTextPane;

public class TextEditor extends JTextPane {
    
    private static final long serialVersionUID = 1L;
    public final static String Version = "Apprendice";
    public final static double VersionNumber = 1.0; 
    
    public static void main(String[] args) {
        TextEditorFrame frame = new TextEditorFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    
}
