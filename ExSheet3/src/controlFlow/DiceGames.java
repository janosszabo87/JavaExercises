package controlFlow;

import java.util.Random;

public class DiceGames {
	
	public int getYourPoints(int throw1,int throw2) {
		
		int yourTotalPoints;
		/*if(throw1 !=6 && throw2!=6 && throw1!=3 && throw2!=3 && throw1!=5 && throw2!=5) {
			
		}*/
		
		if(throw1==6 && throw2!=6) {
			
			switch(throw2) {
			case 3:
			yourTotalPoints=throw1+throw2+10;
			break;
			case 5:
			yourTotalPoints=throw1+throw2-4;
			break;
			default: 
			yourTotalPoints=throw1+throw2;
			}
			
			
		}else if(throw2==6 && throw1 !=6) {
			
			switch(throw1) {
			case 3:
			yourTotalPoints=throw1+throw2+10;
			break;
			case 5:
			yourTotalPoints=throw1+throw2-4;
			break;
			default: 
			yourTotalPoints=throw1+throw2;
			}
			
		}else if(throw1==6 && throw2 ==6) {
			yourTotalPoints=throw1+throw2;
		}
		
		else if(throw1==3 && throw2 !=3) {
			
			switch(throw2) {
			case 6:
			yourTotalPoints=throw1+throw2+10;
			break;
			case 5:
			yourTotalPoints=throw1+throw2+10-4;
			break;
			default: 
			yourTotalPoints=throw1*throw2+10;
			}
			
		}else if(throw2==3 && throw1 !=3) {
			
			switch(throw1) {
			case 6:
			yourTotalPoints=throw1+throw2+10;
			break;
			case 5:
			yourTotalPoints=throw1+throw2-4;
			break;
			default: 
			yourTotalPoints=throw1*throw2+10;
			}
			
			
		}else if(throw1==3 && throw2==3) {
			yourTotalPoints= throw1*throw2+2*10;
		}
		
		else if(throw1==5 && throw2!=5) {
			
			switch(throw2) {
			case 6:
			yourTotalPoints=throw1+throw2-4;
			break;
			case 3:
			yourTotalPoints=throw1*throw2+10-4;
			break;
			default: 
			yourTotalPoints=throw1*throw2-4;
			}
			
		}else if(throw2==5 && throw1!=5) {
			
			switch(throw1) {
			case 6:
			yourTotalPoints=throw1+throw2-4;
			break;
			case 3:
			yourTotalPoints=throw1*throw2+10-4;
			break;
			default: 
			yourTotalPoints=throw1*throw2-4;
			}
			
		}else if(throw1==5 && throw2==5) {
			yourTotalPoints= throw1*throw2-2*4;
		}
		
		else {
			yourTotalPoints=throw1*throw2;
		}
		
		return yourTotalPoints;
		
		
		
	}

	public static void main(String[] args) {
		
		/*Write a method that calculates the amount of points a specific throw of two dice would give you.
		NOTE: The expression: (int)(Math.random()*6) + 1 will return a number between 1 and 6.*/
		
		
		Random n = new Random();
		int throw1=n.nextInt(6)+1;
		int throw2=n.nextInt(6)+1;
		
		System.out.println(throw1);
		System.out.println(throw2);
		
		
		/*A simple dice game is played with two dice (store that values in two variables). 
		For a normal dice throw, the amount of points you get will be calculated 
		by multiplying the eyes from each dice, i.e. a throw of 4 and 2 would give you 8 points. 
		There are some exceptions to this rule:

			6 is a special number: Whenever at least one 6 is thrown, the sum of the eyes will be used instead of the multiplication.
			3 is your lucky number: For each 3, you will get 10 bonus points.
			5 is your unlucky number: For each 5, your score will be decreased by 4 points.*/
		
		System.out.printf("Your total points are: %d", new DiceGames().getYourPoints(throw1, throw2));
		
		
	}

}
