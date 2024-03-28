import java.util.Scanner;

public class Letter_Substitution {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		scan.nextLine();
		for(int i = 0; i<num;i++) {
			String phrase1 = scan.nextLine();
			String phrase2 = scan.nextLine();
			phrase2 = phrase2.toLowerCase();
			char [] p1 = phrase1.toCharArray();
			char [] p2 = phrase2.toCharArray();
			char [] or = phrase1.toCharArray();
			
			
			if(phrase2.length()%2 != 0) {
				System.out.print("Wut");
			}
			else {
			for(int j = 0; j<p1.length;j++) {
				for(int k = 0; k<p2.length-1;k = k+2) {
					
					if(Character.isUpperCase(p1[j]) == true) {
						if(p1[j] == p2[k] || Character.toUpperCase(p2[k]) == p1[j]) {
							if(p1[j]==or[j]) {
								p1[j] = Character.toUpperCase(p2[k+1]);
							}
						}
					}
					if(p1[j] == p2[k] || Character.toUpperCase(p2[k]) == p1[j]) {
						if(p1[j]==or[j]) {
							p1[j] = p2[k+1];
						}
					}
				}
			}
			System.out.println(p1);
		}
		}
	}

}
