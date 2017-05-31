//import java.util.Scanner;
//public class PT
//{
//	public static void main(String[]args)
//	{
//		Scanner kb = new Scanner(System.in);
//		System.out.println("Hello! Have you ever wondered who you really are?");
//		System.out.println("I am not talking about your conspiracy theory that you are a ninja, but rather about what components are a part of your personality. ");
//		System.out.println("Well now you can find out! Using this quiz that RD has designed you can find out who you truly are.");
//		System.out.println("Are you ready to find out (Yes/No) ?");
//		String response = kb.next();
//
//		String yesresponse = "Yes";
//
//		if (response.equals(yesresponse))
//		{
//			System.out.println("You will be given a series of scenarios and asked to pick an option regarding what you would do in that situation.");
//			System.out.println("At the end of the quiz you will find your results, stats, and an explanation. ");
//			System.out.println("Let us begin!");
//
//			System.out.println("You are on your way home and as you come closer to your house, you see smoke coming from your neighbors house, and you hear the wails for your neighbours. You realize that there is afire and your neighbours are trapped. What do you do?  " +
//					"\n 1. run into your house and gather your belongings and flee in case the fire comes to your house" +
//					"\n 2. call the police and wait in front of the neighbours house till they arrive " +
//					"\n 3. call the police then run into the neighbors house in hopes of resucing someone");
//			int choice1 = kb.nextInt();
//
//			System.out.println("You are sitting in a bus and waiting for your stop to come soon. As you sit and wait, you notice an old woman who is struggling to stand with the help of her cane and nobody else seems to notice her struggle. What do you do?" +
//					"\n 4. You look the other way. No one else is helping, why should you?" +
//					"\n 5. You nudge your elbow towards the person sitting next to you and gesture towards the old woman. Hopefully they get the hint." +
//					"\n 6. You get up from your seat and you tell her that she can use your seat.");
//			int choice2 = kb.nextInt();
//
//			System.out.println("Your friends are fighting and you find yourself in between them. You love both of your friends and value both of their friendship equally, but yuo also feel that one of your friends is on th eright side of the argument. What would you do?" +
//					"\n 7. You are annoyed by all this fighting and go find new friends." +
//					"\n 8. You decide to stay true to yourself and support the friend whose side you believe is more reasonable" +
//					"\n 9. You remain neutral in the argument and decide to stay out of the fight");
//
//			int choice3 = kb.nextInt();
//
//			System.out.println("You are taking a really important test which took you weeks to study for. You are close to finishing when you notice the person next to you look in the sleeve of their jacket and quickly covering up when the proctor walks by. Then with your detective skills you peice together that they are...cheating! What do you do?" +
//					"\n 10. You just pat yourself on the back for your great detective skills and leave it at that. You remain silent." +
//					"\n 11. You decide to finish the test then talk to the proctor after everyone leaves" +
//					"\n 12 You immediately jump up from your seat and shout out that the person next to you is cheating. Hopefully the proctor is not deaf.");
//
//			int choice4 = kb.nextInt();
//
//
//			System.out.println(" You are visited by the fairy godmother, and are granted the choice to do anything you want in your life without the fear of responsibility or debt. What would you do? " +
//					"\n 13.Travel the world and live a nomad lifestyle" +
//					"\n 14. stay at home and read a lot of books." +
//					"\n 15. Become a doctor or social worker to help all the underprivileged and sick people.");
//
//			int choice5 = kb.nextInt();
//
//			System.out.println("Choice1: " + choice1);
//			System.out.println("Choice2: " + choice2);
//			System.out.println("Choice3: " + choice3);
//			System.out.println("Choice4: " + choice4);
//			System.out.println("Choice5: " + choice5);
//
//			if(choice1 == 1)
//			{
//
//			else
//				if (choice2 == 4)
//				{
//					if (choice3 == 7)
//					{
//						if (choice4 == 10)
//						{
//							if (choice5 == 13)
//								System.out.println(" You are quite a vicious person, and have a mean streak. You do what you want and do not let anyone dictate how you would like to live your life. At the same time you are a courageous person who is willing to stand yuo for themselves");
//						}
//					}
//					else if (choice3 == 8)
//					{
//						if (choice4 == 12)
//						{
//							if (choice5 == 13)
//								System.out.println("You are on the adventurous side of life. Yet  you have a complex personality. Sometimes you are very timid and are going against humanity, but for the most part you are kind and outgoing.");
//
//						}
//
//					}
//
//				}
//				else if (choice2 == 5)
//				{
//					if (choice3 == 8)
//					{
//						if (choice4 == 12)
//						{
//							if (choice5 == 14)
//								System.out.println(" moslty clam");
//
//						}
//
//					}
//
//				}
//
//
//			}
//
//			else if( choice1 ==2)
//			{
//
//				if (choice2 == 6)
//				{
//					if (choice3 == 7)
//					{
//						if (choice4 == 11)
//						{
//							if (choice5 == 14)
//							{
//								System.out.println("all clam but quite timid");
//							}
//
//						}
//
//
//					}
//
//				}
//
//				else if (choice2 == 4)
//				{
//					if (choice3 == 7)
//					{
//						if (choice4 == 10)
//						{
//							if (choice5 == 13)
//							{
//								System.out.println("You are quite vicious!");
//							}
//
//						}
//
//					}
//
//				}
//
//			}
//
//			else if (choice1 == 3)
//			{
//				if (choice2 == 6)
//				{
//					if (choice3 == 9)
//					{
//						if (choice4 == 12)
//						{
//							if (choice5 == 15)
//							{
//								System.out.println("You are really nice!");
//							}
//
//						}
//
//					}
//
//				}
//				else if (choice2 == 5)
//				{
//					if (choice3 == 8)
//					{
//						if (choice4 == 12)
//						{
//							if (choice5 == 15)
//							{
//								System.out.println("Moslty nice but still needs work ");
//							}
//
//						}
//
//					}
//					else if (choice3 == 9)
//					{
//						if (choice4 == 11)
//						{
//							if (choice5 == 15)
//							{
//								System.out.println("You are a strange person. You do like to help people but at the comfort of your own time.");
//							}
//
//						}
//
//					}
//
//				}
//
//			}
//			else
//				System.out.println(" Yuo are quite a neutral person, There is no on personality that solely identifies you. You are kind, calm, but also can be courageous and cold hearted when needed to. ");
//		}
//		else
//			System.out.println("Your Loss");
//
//	}
//}
//
//
//
//
//
//
//
