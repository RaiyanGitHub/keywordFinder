
package keywordfinder;

import java.io.File;// Import the File class 
import java.io.IOException;//import the IOExeption class to handle errors
/**
 *
 * @author ASUS
 */
public class CreateFile {
    public static void main(String[] args)  {
        try
        {
            File myObj = new File ("D:\\4th sem\\oop\\FileHandling\\build\\classes\\Filef1.txt");
            if (myObj.createNewFile())
            {
                System.out.println("File created :" +  myObj.getName());
               
            }
            else
            {
                System.out.println("File already exists.");   
            }
        }
            catch(IOException e)
                    {
                    System.out.println("An error occurred.");
                    e.printStackTrace();
                    }
        }
    }

