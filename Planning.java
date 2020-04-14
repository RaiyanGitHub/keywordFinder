/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keywordfinder;

/**
 *
 * @author U.S.E.R
 */
public interface Planning {
    
    //1.     <<------- Take input from user : What fileName do you want to open?
    //                 Take File name
    //2.      -------->> Open the file              // File not Found <problem>         //3. Where is the file?
    //3.      <<------ Take input what word do you want to search?  //Word not found in file  //4. Not found
    //
    //4.      ------->>  Here are the occurences of your word in the file.
    //
    //5. exit
    
    
    public abstract void dataGen();   
}
