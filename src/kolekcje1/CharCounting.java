package kolekcje1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CharCounting {
    
    private String textFromFile;
    Map<Character, Integer> charCount = new HashMap<Character, Integer>();
    
    void getTextFromFile(File file){
        String buffer = "";
        String line = "";
        
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            while((line = br.readLine()) != null){
            buffer += line + "\n";
            }
            br.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        textFromFile = buffer;
    }

    public String getTextFromFile() {
        return textFromFile;
    }
    
}
