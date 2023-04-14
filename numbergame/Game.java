package projects;
import java.util.Scanner;
import java.lang.Math;

public class Game {

	public static void main(String[] args) {
	
		        int answer = (int) (Math.random() * 100) + 1;
		        int k = 5;
		        Scanner sc = new Scanner(System.in);
		        boolean correct = false;
		        System. out.println("---GUESS THE NUMBER BETWEEN 1 TO 100---.\n***You have 5 tries to guess the number.***");
		        while (k > 0) {
		            System. out.println("Enter your guess: ");
		            int guess = sc.nextInt();
		            
		            if (guess == answer) {
		                System. out.println("-*-*-You guessed the number!-*-*-\n-*-*-You win!-*-*-");
		                break;
		            }
		            else if (guess > answer) {
		                System.out.println("Your guess is too high.\nYou have " + (k - 1) + " tries left.");
		                k--;
		            }
		            
		            else {
		                System.out.println("Your guess is too low.\nYou have " + (k - 1) + " tries left.");
		            }
		            
		            k--;
		        }
		   
				if (correct==false) {
		        System.out.println("You ran out of tries.\nYou lose!");
		        System.out.println("The Number was: "+answer);
		    }
		    }
		

}
