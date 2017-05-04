
package algorithm;
import java.util.Random;
import algorithm.Sort;

/*
 *Created by PIIT_NYA on 04/22/2017.
 */
public class Numbers {

	/*
	 * Show all the different kind of sorting algorithm by applying into (num array).
	 * Display the execution time for each sorting.Example in below.
	 *
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 */

	public static void main(String[] args) {

		/*int [] num = new int[10000];

		Random rand = new Random();
		for(int i=0; i<num.length; i++){

		num[i] = rand.nextInt(1000000);

		}*/

		//Selection Sort
		Random rand = new Random();
		int[] num = new int[10000];
		for (int i = 0; i < num.length; i++) {
			num[i] = rand.nextInt(1000000);
		}
		//randomize the positions.
		for (int i = 0; i < 10000; i++) {
			int randomPosition = rand.nextInt(10000);
			int temp = num[i];
			num[i] = num[randomPosition];
			num[randomPosition] = temp;
		}
		//check for the maximum in the
		//unsorted section of the list.
		int max;
		for (int i = 9999; i >= 0; i--) {
			max = i;
			for (int j = i - 1; j >= 0; j--)
				if (num[j] > num[max]) {
					max = j;
				}
			//swap the positions of the
			//maximum and the last value in the
			//unsorted section of the list.
			if (max != i) {
				int tmp = num[i];
				num[i] = num[max];
				num[max] = tmp;
			}
		}
		//output the result.
		for (int k = 0; k < 10000; k++) {
			System.out.println(num[k]);
		}
		Sort algo = new Sort();
		algo.selectionSort(num);
		long selectionSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Selection Sort take: " + selectionSortExecutionTime + " milli sec");


		//Insertion Sort
		for (int i = 0; i < num.length; i++)
			System.out.print(num[i] + "  ");
		System.out.println();

		insertion_srt(num, num.length);
		System.out.print("Values after the sort:\n");

		for (int i = 0; i < num.length; i++)
			System.out.print(num[i] + "  ");
		System.out.println();
		algo.insertionSort(num);
		long insertionSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of "+num.length +" numbers in Insertion Sort take: "+insertionSortExecutionTime +" milli sec");

	}

	public static void insertion_srt(int num[], int n) {
		for (int i = 1; i < n; i++) {
			int j = i;
			int B = num[i];
			while ((j > 0) && (num[j - 1] > B)) {
				num[j] = num[j - 1];
				j--;
			}
			num[j] = B;
		}
	}

	//Continue for rest of the Sorting Algorithm....


}
