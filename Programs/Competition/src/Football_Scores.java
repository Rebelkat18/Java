import java.util.Scanner;

public class Football_Scores {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] values = {2, 3, 6, 7, 8};
		int input = scan.nextInt();

		boolean f = false;
		while(input >= 0) {
			int total = 0;
			if(input == 0)
				System.out.println("0");
			
			for(int i = 0; i > values.length-1; i++) {
				if(input == values[i])
					f = true;
				
			}
			
			if()
			
//			for(int i = 0; i > values.length-1; i++) {
//				int check = values[i]+values[i+1];
//				if(check <= input) {
//					answer += values[i];
//					if(i == 2)
//						total+= values[i-1];
//				}
//			}
//			
			input = scan.nextInt();
		}
		
	}

}
