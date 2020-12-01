/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates  
 * and open the template in the editor.
 */

/**
 *
 * @author AADHARSH
 */
package com.mycompany.fire_alarm_system;
import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FileIO {
    
    public String filepath;
    
    public static void WriteToFile(String ser) {
        File file = new File("FireAlarm.log");
        //String filepath = file.getAbsolutePath();
        
        
        try {
            if(!file.exists()){
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file,true);
            BufferedWriter bw=new BufferedWriter(fw);
            String s;
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMM dd, yyyy hh:mm:ss a");  
            LocalDateTime now = LocalDateTime.now();  
            s=dtf.format(now);
            ser="\n"+s+" com.mycompany.fire_alarm_system.LogGenerator <init>\n"+ser;
            bw.write(ser);
            bw.close();
            System.out.println("The data was succesfully written to the log file");
 
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    
}

