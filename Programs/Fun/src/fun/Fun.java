/*
    This is fun and amusement.
 */
package fun;
import java.util.*;
import java.io.*;

public class Fun 
{
    public static void main(String[] args) throws FileNotFoundException
    {
        PrintStream output = new PrintStream(new File("Fun\\User_Data.csv"));
        output.println("test");
//        System.out.println("Hi! You have three attempts to put in your correct credentials.");
//        Scanner console = new Scanner(System.in); 
//        int count = 1;
//        
//        while(count <= 2)
//        {
//            System.out.println("Username: ");
//            String username = console.next();
//            System.out.println("Password: ");
//            String password = console.next();
//
//            if(password.equals("password") && username.equals("username"))
//            {
//                System.out.println("Welcome.");
//                break;
//            }
//            else
//            {
//                System.out.println("That was attempt " + count + ". Please try again.");
//            }
//            count++;
//        }
//        
//        if(count <= 2)
//        {
//            System.out.println("You made it.");
//        }
//        else
//        {            
//            System.out.println("Username: ");
//            String username = console.next();
//            System.out.println("Password: ");
//            String password = console.next();
//
//            if(password.equals("password") && username.equals("username"))
//            {
//                System.out.println("Welcome.");
//            }
//            else
//            {
//                System.out.println("That was attempt 3, your last try. Goodbye.");
//                System.exit(0);
//            }
//        }
    } 
}
