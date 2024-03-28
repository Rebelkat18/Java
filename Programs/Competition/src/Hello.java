import java.util.Scanner;

public class Hello {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.next();
		 while(!input.equals("quit")) {
			 System.out.println("Hello, " + input);
			 input = scan.next();
		 }
	}
}
