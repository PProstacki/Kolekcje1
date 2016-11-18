package kolekcje1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javafx.scene.layout.Border;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Window extends JFrame implements ActionListener{

    JTextArea taFileText;
    JButton bOpen, bClose, bShowCharFrequency;
    JScrollPane spTextScroll;
    
    Window(){
        setTitle("Zliczanie znaków w pliku tekstowym");
        setSize(600, 500);
        setLocation(500, 500);
        setLayout(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        taFileText = new JTextArea();
        spTextScroll = new JScrollPane(taFileText);
        spTextScroll.setLocation(5, 50);
        spTextScroll.setSize(500, 310);
        add(spTextScroll);
        
        bOpen = new JButton("Otwórz");
        bOpen.setLocation(510, 50);
        bOpen.setSize(80, 100);
        bOpen.addActionListener(this);
        add(bOpen);
        
        bClose = new JButton("Zamknij");
        bClose.setLocation(510, 155);
        bClose.setSize(80, 100);
        bClose.addActionListener(this);
        add(bClose);
        
        bShowCharFrequency = new JButton("<html>Pokaż<br />częstość</html>");
        bShowCharFrequency.setLocation(510, 260);
        bShowCharFrequency.setSize(80, 100);
        bShowCharFrequency.addActionListener(this);
        add(bShowCharFrequency);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        File currentFile;
        CharCounting cc = new CharCounting();
            
        if(source == bOpen){
            JFileChooser jfc = new JFileChooser();
            if(jfc.showOpenDialog(null) == JFileChooser.APPROVE_OPTION){
            currentFile = jfc.getSelectedFile();
            cc.getTextFromFile(currentFile);
            taFileText.setText(cc.getTextFromFile());
            }
        }else if(source == bClose){
            taFileText.setText("");
        }else if(source == bShowCharFrequency){
            Window2 w2 = new Window2(this);
            w2.setVisible(true);
        }
        
    }
    
}
