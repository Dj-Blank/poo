package javaguessinggame;
import java.util.Scanner;


public class Game {

	
	public void gameStart() {
		Numbers a = new Numbers();
		Numbers b = new Numbers();
		Numbers c = new Numbers();
		Numbers d = new Numbers();
		
		a.firstNumber();
		b.secondNumber();
		c.thirdNumber();
		d.forthNumber();
		
		System.out.print(a.number1);
		System.out.print(b.number2);
		System.out.print(c.number3);
		System.out.print(d.number4);
		
		int guess1 = 0;
		int guess2 = 0;
		int guess3 = 0;
		int guess4 = 0;
		
		int right_guess1 = a.number1;
		int right_guess2 = b.number2;
		int right_guess3 = c.number3;
		int right_guess4 = d.number4;
		
		for (int i=0; i < 10; i++) {
			
			
		
		int turns=0;

		    @SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);


		boolean win_guess1 = false;
		boolean win_guess2 = false;
		boolean win_guess3 = false;
		boolean win_guess4 = false;
			
			
		while ((win_guess1 == false) && (win_guess2 == false) && (win_guess3 == false) && (win_guess4 == false)) {
			  guess1=scan.nextInt();
		      guess2=scan.nextInt();
		      guess3=scan.nextInt();
		      guess4=scan.nextInt();
		      turns++;			
			if (guess1 == right_guess1) {
				win_guess1 = true;
				System.out.print("=");
			}
			
			else if (guess2 == right_guess2) {
				win_guess2 = true;
				System.out.print("=");
			}
			else if (guess3 == right_guess3) {
				win_guess3 = true;
				System.out.print("=");
			}
			
			else if (guess4 == right_guess4) {
				win_guess4 = true;
				System.out.print("=");
			}
			else if (guess1 < right_guess1) {
				win_guess1 = false;
				System.out.print("-");
			}
			
			else if (guess2 < right_guess2) {
				win_guess2 = false;
				System.out.print("-");
			}
			else if (guess3 < right_guess3) {
				win_guess3 = false;
				System.out.print("-");
			}
			
			else if (guess4 < right_guess4) {
				win_guess4 = false;
				System.out.print("-");
			}
			else if (guess1 > right_guess1) {
				win_guess1 = false;
				System.out.print("+");
			}
			
			else if (guess2 > right_guess2) {
				win_guess2 = false;
				System.out.print("+");
			}
			else if (guess3 > right_guess3) {
				win_guess3 = false;
				System.out.print("+");
			}
			
			else if (guess4 > right_guess4) {
				win_guess4 = false;
				System.out.print("+");
			}
			
				
			    

			
			
			
			
	
		} System.out.println("YOu win!");
		  System.out.println("The number is " + right_guess1 +""+right_guess2+""+ right_guess3 + "" + right_guess4 +" you took "+ turns + "turns"
				  );
	    
	}
		}
				
			     
		
	    
	
	
}

