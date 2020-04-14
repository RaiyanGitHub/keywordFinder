/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keywordfinder;

import java.io.File;
import java.util.Scanner;
import static keywordfinder.KeywordFinder.prompt2;

/**
 *
 * @author U.S.E.R
 */
public class Phase2 {
    public void ph(String fileName){
        Scanner input = new Scanner(System.in);
        prompt2();      int wordCount=0,i=0;
            String filePath = input.nextLine();
            File secondTry = new File(filePath+"\\"+fileName);  
            if(secondTry.exists()&&secondTry.canRead())
            //    System.out.println("yes!");
            //    System.out.println("Filepath is: "+filePath);
                System.out.println("What word do you want to search?");
                String searchKey = input.next();
                try{
                Scanner myReader = new Scanner(secondTry);
                while(myReader.hasNext()){
                    String data = myReader.next();
                    wordCount++;
                    if(data.equals(searchKey)){
                        i++;
                        
                    }
                
                }
                System.out.println("The word you searched for came in the document "+i+" times"+"\n"
                        + "While the document itself has "+wordCount
                        +" number of words.");

                }catch(Exception e){
                    
                }
                                
    }
}
