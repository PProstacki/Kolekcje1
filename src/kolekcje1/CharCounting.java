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
    
    void readTextFromFile(File file){
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
    
    void fillMapFrequency(){
        char sign = ' ';
        for(int i = 0;i < textFromFile.length();i++){
            sign = textFromFile.charAt(i);
            
            if(charCount.containsKey(sign)){
                charCount.put(sign, charCount.get(sign) + 1);
            }else{
                charCount.put(sign, 1);
            }
        }        
    }
    
    String getCountedChars(){ //mozna przerobic dla tab enter, spacja
        String buffer = "";
        
        for(Character key: charCount.keySet()){
            buffer += key + " = " + charCount.get(key) + "\n";
        }
        
        return buffer;
    }
    
}
