import java.util.Scanner;
public class PT
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Hello! Have you ever wondered who you really are?");
		System.out.println("I am not talking about your conspiracy theory that you are a ninja, but rather about what components are a part of your personality. ");
		System.out.println("Well now you can find out! Using this quiz that RD has designed you can find out who you truly are.");
		System.out.println("Are you ready to find out ?");
		String response= kb.next();
		
		String yesresponse = "yes";

		if (response.equals(yesresponse))
		{
			System.out.println("You will be given a series of scenarios and asked to pick an option regarding what you would do in that situation.");
			System.out.println("At the end of the quiz you will find your results, stats, and an explanation. ");
			System.out.println("Let us begin!");
		}
		else
		{
			System.out.println("Your Loss");
		}

		System.out.println("+You are on ypur way home and as you come closer to your house, you see smoke coming from your neighbors house, and you hear the wails for your neighbours. You realize that there is afire and your neighbours are trapped. What do you do?  " +
						     "\n 1. run into your house and gather your belongings and flee in case the fire comes to your house" +
							 "\n 2. call the police and wait in front of the neighbours house till they arrive " +
							 "\n 3. call the police then run into the neighbors house in hopes of resucing someone");
		int choice= kb.nextInt();
			 {
				if (choice ==1)
				{
					System.out.println("You find the robber in an abandoned warehouse.");
					System.out.println("What will you do next....." +
										"\n 3.Ask the robber what his intentions were" +
										"\n 4. Handcuff the robber");
					int choice2= kb.nextInt();
					
					//print: something happens
					//prompt for new choice
					//user input for choice value (use nextInt())
					
					if (choice == 3 )
					{
						System.out.println("Th robber tells you his intentions and the police arrest him.YOu are a hero!");
						
					}
						
					else
					{
						System.out.println("The police arrive and take him for interrogation. You are a hero!");
					}
				}
				else
				{
					System.out.println(" Yuo realize that the evidence shows that the robbery did not occur.");
					System.out.println("What will you do next....." +
										"\n 5.Confront the the store owner and ask him his intentions" +
										"\n 6. Handcuff the store owner ");
					int choice3= kb.nextInt();
					//print: something happens
					//prompt for new choice
					//user input for choice value (use nextInt())
					
					if (choice == 5 )
					{
						System.out.println("The owner confesses his plot to get insurance money and the police take him in. You are a hero.");
					}
						
					else
					{
						System.out.println("The police arrive and take him for interrogation. You are a hero!");
					}						
				}					
			}
		
	
	
	}
}