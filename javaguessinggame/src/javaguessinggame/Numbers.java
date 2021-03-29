package javaguessinggame;

public class Numbers {
	
	
	   int number1;   
	   int number2;   
	   int number3;   
	   int number4;
	   public int firstNumber;
	   public int secondNumber;
	   public int thirdNumber;
	   public int forthNumber;   
	   
	   public void firstNumber() {
		   
	       number1 = ((int) (Math.random()*10));

	       
	   }
	   public void secondNumber() {
		   
		   number2 = ((int) (Math.random()*10))+1;


		   }
	   public void thirdNumber() {
		   
	       number3 = ((int) (Math.random()*10));


	   }
	   public void forthNumber() {
		   
	       number4 = ((int) (Math.random()*10));


	   }
	   
}