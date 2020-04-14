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
        //int wordCount = 0, i = 0;
        prompt1();
        Scanner input = new Scanner(System.in);         
        String fileName = input.nextLine();             // takes the 
        
        try{
        File debdash = new File(fileName);
        
        if(debdash.exists() && debdash.canRead()){
            
        Phase1 accute = new Phase1();
        accute.ph(debdash);
        
        }else{
            
            Phase2 starts = new Phase2();
            starts.ph(fileName);
        }
        //    System.out.println("");paroo.readUTF();
        }catch(Exception e){
            System.out.println("Problem 34: "+e);
        }
        
    }
    
}
