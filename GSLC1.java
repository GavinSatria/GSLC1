package GSLC1;
import java.util.Scanner;
public class GSLC1
{
	
	void sort(int n, int scoreVal[]) 
	{
		for (int i = 0; i < n-1; i++)
		{
			for (int j = 0; j < n-1-i; j++)
			{
				if (scoreVal[j+1] > scoreVal[j])
				{
					int temp1 = scoreVal[j];
					scoreVal[j] = scoreVal[j + 1];
					scoreVal[j + 1] = temp1;
				}
				
			}
		}
	}
	
	public static void main(String[] args) 
	{
		int n;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Number of Scores: ");
		n = scan.nextInt();
		int scoreVal[] = new int[n+1];

		System.out.print("Enter Scores: ");
		for (int i = 0; i < n; i++)
		{
			scoreVal[i] = scan.nextInt();
		}
		
		GSLC1 gslc1 = new GSLC1();
		gslc1.sort(n, scoreVal);
		for (int i = 0; i < n; i++)
		{
			System.out.print(scoreVal[i] + " ");

		}
	}
}