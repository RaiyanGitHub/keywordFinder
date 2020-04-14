
package keywordfinder;

import java.io.File;

/**
 *
 * @author ASUS
 */
public class FileInformation {//example code from youtube
    public static void main(String[] args) {
        File myObj = new File ("D:\\4th sem\\oop\\FileHandling\\build\\classes\\Filef1.txt");
        if (myObj.exists())
        {
            System.out.println("File name:" + myObj.getName());
            System.out.println("Absolute path:"+ myObj.getAbsolutePath());
                System.out.println("Writeable:"+ myObj.canWrite());
                System.out.println("Readable" + myObj.canRead() );
                System.out.println("File size in bytes" + myObj.length());
    }
        else {
            System.out.println("This file is not exist.");
        }
}
}