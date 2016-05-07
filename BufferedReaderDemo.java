// package com.tutorialspoint;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class BufferedReaderDemo {
   public static void main(String[] args) throws Exception {
      
      String currentUsersHomeDir = System.getProperty("user.home");
      String towary_fn = currentUsersHomeDir + File.separator + "Towary.txt";

      String  thisLine = null;
      try {
         // open input stream test.txt for reading purpose.
         BufferedReader br = new BufferedReader(new FileReader(towary_fn));
         while ((thisLine = br.readLine()) != null) {
            System.out.println(thisLine);
         }       
      }catch(Exception e){
         e.printStackTrace();
      }
   }
}
