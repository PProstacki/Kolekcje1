package kolekcje1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Window2 extends JFrame implements ActionListener{
    
    JTextArea taFileText;
    JScrollPane spTextScroll;
    
    Window2(JFrame parentWindow){
        setTitle("Częstość znaków");
        setSize(265, 340);
        setLocation(parentWindow.getLocation().x + parentWindow.getWidth() + 15, parentWindow.getLocation().y);
        setLayout(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        taFileText = new JTextArea();
        spTextScroll = new JScrollPane(taFileText);
        spTextScroll.setLocation(5, 5);
        spTextScroll.setSize(250, 300);
        add(spTextScroll);
        
    } 

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
}
