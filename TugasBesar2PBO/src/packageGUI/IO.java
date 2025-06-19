/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package packageGUI;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class IO {
    public static ArrayList<String> readFile(String source) {
        ArrayList<String> data = new ArrayList<>();
        try {
            FileReader fr = new FileReader(source);
            BufferedReader br = new BufferedReader(fr);
            String s;
            while ((s = br.readLine()) != null) {
                data.add(s);
            }
        } catch (FileNotFoundException ex) {
            writeFile(source, new ArrayList<String>());
        } catch (IOException ex) {
            
        }
        return data;
    }
    public static void writeFile(String source, ArrayList<String> data) {
        FileWriter fw;
        try {
            fw = new FileWriter(source, true);
            for (String line: data) {
                fw.write(line);
                fw.write("\n");
            }
            fw.close();
        } catch (IOException ex) {
            
        }
    }
}
