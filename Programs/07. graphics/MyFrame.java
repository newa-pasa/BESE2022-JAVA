
import java.awt.*; 
import java.awt.event.WindowAdapter; 
import java.awt.event.WindowEvent; 
  
public class MyFrame extends Frame { 
    public MyFrame() 
    { 
        setVisible(true); 
        setSize(300, 200); 
        addWindowListener(new WindowAdapter() { 
            @Override
            public void windowClosing(WindowEvent e) 
            { 
                System.exit(0); 
            } 
        }); 
    } 
    public void paint(Graphics g) 
    { 
        g.drawRect(50, 60, 50, 20); 
        g.drawRoundRect(50, 90, 50, 20, 10, 10); 
        g.fillRect(50, 120, 50, 20); 
        g.fillRoundRect(50, 150, 50, 20, 10, 10); 
    } 
  
    public static void main(String[] args) 
    { 
        new MyFrame(); 
    } 
}