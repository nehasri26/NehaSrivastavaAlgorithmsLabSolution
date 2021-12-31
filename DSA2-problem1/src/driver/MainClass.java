package driver;
import java.util.Scanner;
import transactions.*;

public class MainClass {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		TransactionsClass tr =  new TransactionsClass();

		System.out.println("Enter the size of transaction array");
		int arrSize = in.nextInt();
			
		int array[] = new int[arrSize];
		System.out.println("Enter the values of array");
		int i;
		for(i=0;i<arrSize ;i++) 
		{
			array[i] = in.nextInt();
		}
		
		System.out.println("Enter the total no of targets that needs to be achieved");
		int targetNum = in.nextInt();
		
		for (i=0;i<targetNum;i++) {		
			System.out.println("Enter the value of target");
			int targetValue = in.nextInt();
			tr.isTargetAchieved(array, arrSize, targetValue);
		}
		
		
		
	}

}
