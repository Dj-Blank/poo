package javaguessinggame;

import java.util.Scanner;

public class Menu {
	
	boolean exit;
	
	public void printHeader () {
		
	}
	
	public void printMenu () {
		System.out.println("Please make a choice");
		System.out.println("1. start game");
		System.out.println("2. else");
		System.out.println("0. Stop");
	}
	
	public void runMenu() {
		printMenu();
		
	
		
		while (!exit){
			int choice = getInput();
			runAction(choice);
			
		}
		
	}
	
	private int getInput() {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int choice = -1;
		while (choice < 0 || choice > 2) {
			try {
				choice = Integer.parseInt(scan.nextLine());
			}
			catch (NumberFormatException e ) {
				System.out.println("Invalid choice");
			}
		}
		return choice;
	}

	public void runAction(int choice) {
		
		switch (choice) {
		case 0:
			System.out.println("0. Stop");
			exit = true;
			break;
			
		case 1:
			System.out.println("1. start game\n");
			Game game = new Game ();
			game.gameStart();
			break;
			
		case 2:
			System.out.println("2. else");
			break;
		default :
			
			System.out.println("Error");
			
			
		}
		
	}
}

