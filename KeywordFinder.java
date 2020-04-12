/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keywordfinder;
import java.io.DataInputStream;
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
        System.out.println("Where is the file inside your PC [Enter file path]?");
    }
    public static void main(String[] args) {
        prompt1();
        Scanner input = new Scanner(System.in);
        String fileName = input.nextLine();
        //System.out.println("Filename is: "+fileName);
        try{
        FileInputStream debdash = new FileInputStream(fileName);
        DataInputStream paroo = new DataInputStream(debdash);
        
        paroo.readUTF();
        }catch(Exception e){
            System.out.println("Problem 34: "+e);
        }
        
                              
        prompt2();
        String filePath = input.nextLine();
        
        //System.out.println("Filepath is: "+filePath);
        
        
    }
    
}
