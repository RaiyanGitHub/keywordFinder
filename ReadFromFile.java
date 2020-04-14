
package keywordfinder;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class ReadFromFile {//example code from youtube
    public static void main(String[] args) {
        boolean flow = true;
        while(flow){
        
        }
        
        try{
            File myObj = new File("D:\\4th sem\\oop\\FileHandling\\build\\classes\\Filef1.txt");
            Scanner myReader = new Scanner (myObj);
            while (myReader.hasNextLine()){
                String data = myReader.nextLine();
                //System.out.println(data);
            }
            myReader.close();
    }
    catch (FileNotFoundException e)
    {
        System.out.println("An error Occcured");
        e.printStackTrace();
    }
}
}