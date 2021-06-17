package hit.lab2;

import java.util.Random;
import java.util.Scanner;

public class Rock {

	public static void main(String[] args) {
		String personplay = null;
		String computerplay = null;
		int computerInt = 0;
		Scanner scan = new Scanner(System.in);
		Random generator = new Random();
		switch (computerInt) {
		
		}
		if(personplay.equals(computerplay))
           System.out.println("It's  a tie!");
		else if(personplay.equals("R"))
				if(computerplay.equals("s"))
					System.out.println("Rock crushes scissors.you win!!!");
				else {
					System.out.println("you lose the game ");
				}
	}
}
	