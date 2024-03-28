import java.util.Scanner;

public class Beesanese {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int runs = scan.nextInt();
		
		String output = "";
		int count = 0;
		for(int i = 0; i < runs; i++) { // each word
			boolean test = true;
			String word = scan.next();
			for(int j = 0; j < word.length(); j++){ // each letter
				if(word.charAt(j) == 'a' || word.charAt(j) == 'e' || word.charAt(j) == 'i' || word.charAt(j) == 'o' || word.charAt(j) == 'u') {
					output += "Buzz!Buzz!";
				}	
				
				else if(word.charAt(j) == 'z') {
					output += "bzz";
					count++;
				}
				else {
					output += "Buzz!";
				}
			}
			while(count != 0) {
				output += "Buzz!";
				count--;
			}
			output += "\n";
		}
		System.out.println(output);
	}
}
