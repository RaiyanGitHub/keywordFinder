/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keywordfinder;
import java.io.*;
import java.io.FileInputStream;
import java.util.Scanner;
/**
 *
 * @author U.S.E.R
 */
public class KeywordFinder {

    /**
     * @param args the command line arguments
     */
    
    public static void prompt1(){
        System.out.println("What is the file name?");
    }
    public static void prompt2(){
        System.out.println("Sorry! your file was not located in the workspace. \n"
                + "Where is the file inside your PC [Enter file path]?");
    }
    public static void main(String[] args) {
        int wordCount = 0, i = 0;
        prompt1();
        Scanner input = new Scanner(System.in);         
        String fileName = input.nextLine();             // takes the 
        
        try{
        File debdash = new File(fileName);
        //DataInputStream paroo = new DataInputStream(debdash);
        if(debdash.exists() && debdash.canRead()){
            
            if(debdash.exists()&&debdash.canRead())
            //    System.out.println("yes!");
            //    System.out.println("Filepath is: "+filePath);
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
        }else{
            
            prompt2();
            String filePath = input.nextLine();
            File secondTry = new File(filePath+"\\"+fileName);  
            if(secondTry.exists()&&secondTry.canRead())
            //    System.out.println("yes!");
            //    System.out.println("Filepath is: "+filePath);
                System.out.println("What word do you want to search?");
                String searchKey = input.next();
                
                Scanner myReader = new Scanner(secondTry);
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
        //    System.out.println("");paroo.readUTF();
        }catch(Exception e){
            System.out.println("Problem 34: "+e);
        }
        
                              
       
        
        
    }
    
}
