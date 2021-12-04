
package activity1ifelsestatement;
import java.io.*;
import java.util.Scanner;


public class Activity1ifelsestatement {

    
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
       
        
        System.out.print("Enter your Password: ");
        String str = s.nextLine();
        
        //convert first string into array
        char[] arrayInput = str.toCharArray();
        int i =0;
        
         if (Character.isUpperCase(arrayInput[i]))
         {
             System.out.println("\nYour password is granted: " + str);
         }
           else {
             System.out.println("\nYour password is denied: " + str);
         }
          System.out.println("\n\n");
}
}

