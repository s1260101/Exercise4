package Mdate;
import java.util.Random;

class Exercise4 {
	public static void main(String[] args){
		Random rand = new Random();
	int a = 0;
	int b = 0;
	
	a= rand.nextInt(6)+1;
	b= rand.nextInt(6)+1;
	System.out.println("Rolling the dice...");
	System.out.println("Die 1: " +a);
	System.out.println("Die 2: " +b);
	System.out.println("Total value: " +(a+b));
	
	
	
	}
}