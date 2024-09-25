
public class Unlucky13
	{

		public static void main(String[] args)
			{
				int counter = 0;
				
				for (int i = 0; i < Numbers.numbers.length; i ++)
					{
						if (Numbers.numbers[i] == 13 )
							{
								Numbers.numbers[i] += 7;
								counter ++;
							}
						else
							{
								
							}
						
						System.out.println(Numbers.numbers[i]);
					}
				System.out.println("The number of 13's is " + counter + ".");
				
			}

	}
