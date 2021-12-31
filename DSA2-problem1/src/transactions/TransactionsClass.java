package transactions;

public class TransactionsClass {

	public void isTargetAchieved(int[] array, int arrSize, int targetValue ) {
		int sumToAchieve =0;
		int i=0;
		for(i=0; i<arrSize ; i++) {
			sumToAchieve = sumToAchieve + array[i];
			if(sumToAchieve >= targetValue) {
				break;
			}
		}
		
		if(i==arrSize) {
			System.out.println("Given target is not achieved");
			System.out.println();
		}
		else {
			System.out.println("Target achieved after "+ ++i +" transactions");
			System.out.println();
		}
	}
}
