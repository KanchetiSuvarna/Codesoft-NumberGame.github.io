package codesoft;

import java.util.Scanner;

public class NumberGame 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int chances = 10;
		int finals = 0;
		boolean playAgain = true;
		System.out.println("Welcome!");
		System.out.println("Hey You Have  " + chances +"  Chances To Win The Game");
		while(playAgain)
		{
		    int rand = getrandN(1,100);
		    boolean guess = false;
		    for(int i=0;i<chances;i++)
		    {
		        System.out.println("chances " + (i+1) + " Enter Your Guess:");
		        int user = sc.nextInt();
		        if(user==rand)
		        {
		            guess = true;
		            finals+=1;
		            System.out.println("You Won it.");
		            break;
		        }
		        else if(user>rand)
		        {
		            System.out.println("The Number is high compare to original number,Try Again!");
		        }
		        else
		        {
		            System.out.println("The Number is Low compare to original number,Try Again!");   
		        }
		    }
		    if(guess == false)
		    {
		        System.out.println("Sorry, You Lost The Chances.The Number is"+rand);
		    }
		    System.out.println("Do You Want To Play Again(Yes/No)");
		    String pA = sc.next();
		    playAgain = pA.equalsIgnoreCase("Yes");
		}
		System.out.println("That's it,Hope You Enjoyed it.");
		System.out.println("Here is Your Score"+finals);
	}
	public static int getrandN(int min,int max)
	{
		return(int)(Math.random()*(max-min+1)+min);
	}

}
