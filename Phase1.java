/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keywordfinder;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author U.S.E.R
 */
public class Phase1 {
    public void ph(File debdash) throws FileNotFoundException{
        Scanner input = new Scanner(System.in);
        int wordCount =0, i=0;
        
        System.out.println("What word do you want to search?");
                String searchKey = input.next();
                
                Scanner myReader = new Scanner(debdash);
                while(myReader.hasNext()){
                    String data = myReader.next();
                    wordCount++;
                    if(data.equals(searchKey)){
                        i++;
                        
                    }
                
                }
                System.out.println("The word you searched for came in the document "+i+" times"+"\n"
                        + "While the document itself has "+wordCount+" number of words.");
        
    }
}
