import java.util.Scanner;

public class Quizzer
	{

		static int counter= 1;
		static int right = 0;
		static int wrong = 0;
		static int numberOfTimes;
		public static void main(String[] args)
			{
		exercise1();			
			}
		public static String exercise1()
			{
				System.out.println("What is your name?");	
				Scanner userInputName= new Scanner(System.in);
				String name = userInputName.nextLine();		
				System.out.println("How many times would you like to play");
				Scanner userInput= new Scanner(System.in);
				int numberOfTimes0 = userInput.nextInt();	
				int numberOfTimes = numberOfTimes0+1;
				boolean stillPlaying=true;
				while(stillPlaying=true)					
					{	
						if(counter==numberOfTimes)
							{
								stillPlaying=false;
								System.exit(1);
							}
						else
							{								
								stillPlaying= true;
								int first=(int)(Math.random()*8);
								int last=(int)(Math.random()*20)+7;
								int last0 = ((first+last)-1);
								System.out.println("Question "+counter+":");
								System.out.println("(int)(Math.random()*"+last+")+"+first+";");
								System.out.println("What range of numbers is this in?");
								String anwser="(int)(Math.random()*"+last+")+"+first+";";
							
								Scanner userInput7= new Scanner(System.in);
								int firstGuess = userInput7.nextInt();
								System.out.println("and");
								Scanner userInput2= new Scanner(System.in);
								int lastGuess = userInput2.nextInt();	
								if ((firstGuess == first)&&(lastGuess == last0))
									{
										System.out.println("Correct the anwser was "+first+" and " +last0);	
										right++;
										
									}
								else
									{
										System.out.println("Sorry it was "+first+" and "+last0);
										wrong++;
									}
							}
						System.out.println("You have "+right+" right and "+wrong+" wrong");
						counter++;
						if(counter==numberOfTimes)
							{
								System.exit(1);
								stillPlaying=false;
							}
						else
							{								
								stillPlaying= true;
								int first2=(int)(Math.random()*8);
								int last2=(int)(Math.random()*20)+7;
								System.out.println("Question "+counter+":");
								System.out.println("(int)(Math.random()*___)+___;");						
								System.out.println("Fill in the missing numbers to generate numbers from "+first2+" to "+last2+".");						
								Scanner userInput7= new Scanner(System.in);
								int firstGuess2 = userInput7.nextInt();		
								System.out.println(" and ");
								Scanner userInput2= new Scanner(System.in);
								int lastGuess2 = userInput2.nextInt();				
								int last3= ((last2-first2)+1);
								if  ((firstGuess2 == last3)&&(lastGuess2 == first2))	
									{
										System.out.println("Wow that was right!");
										right++;
									}
								else 
									{
										System.out.println("Sorry, the anwser I was looking for was "+last3+" and "+first2);	
										wrong++;																			}
							}						
						System.out.println("You have "+right+" right and "+wrong+" wrong");
						counter++;						
					}
				return name;
			}
	}