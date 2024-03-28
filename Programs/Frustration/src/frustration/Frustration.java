/*
    This is fun and amusement.
 */
package frustration;
import java.util.*;
import java.io.*;

public class Frustration 
{
    public static void main(String[] args) throws IOException
    {
        Scanner KBin = new Scanner(System.in);
        System.out.println("Hello!\nIf you are a new member enter x and we will sign you up.");
        System.out.println("If you already are a member hit enter and sign in.");
        char answer = KBin.next().charAt(0);
        String username;
        String password;
        if(answer == 'x' || answer == 'X')
        {
            System.out.println("Please enter a username:");
            username = KBin.next();
            FileWriter fw = new FileWriter(new File("Usernames.txt"), true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            pw.append(username + "\n");
            
            System.out.println("Please enter a password:");
            password = KBin.next();
            FileWriter fwp = new FileWriter(new File("Passwords.txt"), true);
            BufferedWriter bwp = new BufferedWriter(fwp);
            PrintWriter pwp = new PrintWriter(bwp);
            pwp.append(password + "\n");
            
            pw.flush();
            pw.close();
            bw.close();
            fw.close();
            
            pwp.flush();
            pwp.close();
            bwp.close();
            fwp.close();
        }
        
        System.out.println("You have three attempts to put in your correct credentials.");
        int count = 1;
        while(count <= 2)
        {
            Scanner usernames = new Scanner(new File("Usernames.txt"));
            Scanner passwords = new Scanner(new File("Passwords.txt"));
            System.out.println("Username: ");
            username = KBin.next();
            System.out.println("Password: ");
            password = KBin.next();
            
            if(passwords.equals(password) && usernames.equals(username))
            {
                System.out.println("Welcome.");
                break;
            }
            else
            {
                System.out.println("That was attempt " + count + ". Please try again.");
            }
            count++;
            }

            if(count <= 2)
            {
                System.out.println("You made it.");
            }
            else
            {            
                System.out.println("Username: ");
                username = KBin.next();
                System.out.println("Password: ");
                password = KBin.next();

            if(password.equals("password") && username.equals("username"))
            {
                System.out.println("Welcome.");
            }
            else
            {
                System.out.println("That was attempt 3, your last try. Goodbye.");
                System.exit(0);
            }
        }
        KBin.close();
    } 
}
