package org.launchcode.java.studios.charcount;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class charCount {
    public static void main(String[] args) {
        String str = "" ;
        try{
            File myobj = new File("./src/org/launchcode/java/studios/charcount/string.txt");
            Scanner myReader = new Scanner(myobj);
            while(myReader.hasNextLine()){
                String data = myReader.nextLine();
                str += data;
            }
        }catch(FileNotFoundException e){
            System.out.println("An Error Occurred.");
            e.printStackTrace();
        }
        Map<Character, Integer> charCount = new HashMap<>();
        str = str.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        char[] character = str.toCharArray();
        for (char letter : character) {
            if (charCount.containsKey(letter)) {
                charCount.put(letter, charCount.get(letter) + 1);
            } else {
                charCount.put(letter, 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

