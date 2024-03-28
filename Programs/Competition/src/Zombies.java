import java.util.Scanner;

public class Zombies {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int runs = scan.nextInt();
		String stotal = "";
		for(int i = 0; i < runs; i++) {
			
			int num = scan.nextInt();
			int total = 0;
			if(num == 1) {
				stotal += 2;
			}
			if(num == 2) {
				stotal += 3;
			}
			else {
				for(int j = 1; j < num; j++) {
					total += (num/j)*j;
				}
				stotal += total;
				
			}
			stotal += "\n";
			
		}
		System.out.println(stotal);
	}

}
