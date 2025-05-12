import java.util.Scanner;
public class GuessingGame {

	public static void GameRunner() {
		// TODO Auto-generated method stub
		System.out.println("Hello gamer! I am thinking of a number between 1 and 100. \nDon't forget u have only 10 chances!!!!");
		int mynumber = (int)(Math.random()*101);
		Scanner sc = new Scanner(System.in);
		int i, yournumber;
		
		for (i = 1 ; i <= 10 ; i++) {
			System.out.println("So, what's your guess?" +" To quit write '111'");
			yournumber = sc.nextInt();
			
			//cheating code
			if (yournumber == 123) {
				System.out.println(mynumber);
			}
			//quit
			if (yournumber == 111) {
				System.out.println("You are exhausted.  My number was "+ mynumber);
				break;
			}
			//to compare the number that is guessed with my random number
			else if (yournumber == mynumber) {
				System.out.println("You guessed correctly!   Trial:  "+ i);
				break;
			}
			else if ((yournumber < 1) || (yournumber > 100) ) {
				System.out.println("Your guess is invalid!  Trial: " + i);	
			}
			else if (yournumber > mynumber) {
				System.out.println("Your guess is too high!  Trial: " + i);
			}
			else if (yournumber < mynumber) {
				System.out.println("Your guess is too low!   Trial: " + i);
			}
			//reminder for last chance
			if (i==9) {
				System.out.println("This is your last chance");
			}
			//result
			if (!(yournumber==mynumber) && i==10) {
				System.out.println("Ahhhhh! You lost. Don't be upset, it's okay to lose sometimes. You can get stronger after all <3 ");
			}
		}
		
		sc.close();
		
	}
	public static void main(String[] args) {
		GameRunner();
	}
}
