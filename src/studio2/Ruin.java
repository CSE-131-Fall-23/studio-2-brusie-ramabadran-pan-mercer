package studio2;
import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your starting Amount: ");
		double startAmount = in.nextDouble();
		double j = startAmount;
		System.out.println("Enter win chance: ");
		double winChance = in.nextDouble();
		System.out.println("Enter win limit: ");
		double winLimit = in.nextDouble();
		System.out.println("Enter amount of days: ");
		int day = in.nextInt();

		int count = 0;

		for(int i = 0; i < day; i++) {
			System.out.println("Day " + i + " :");
			startAmount = j;
			count = 0;
			while(startAmount < winLimit && startAmount > 0) {
				if(winChance <= Math.random()) {
					startAmount--;
				}
				else {
					startAmount++;
				}
				count++;
				
			}
			if(startAmount >= winLimit) {
				System.out.println("You won today. ");
			}
			else {
				System.out.println("You lost today. ");
			}
			
			System.out.println(" You played " + count + " Turns today. ");

		}


	}

}
