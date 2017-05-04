package algorithm;
import java.util.Arrays;
public class Sort {

    long executionTime = 0;
	/*
	 * Please implement all the sorting algorithm. Feel free to add helper methods.
	 * Store all the sorted data into one of the databases.
	 */
    public static void main(String args[]) {
        int[] list = { 32, 23, 45, 87, 92, 31, 19 };
        int[] arr2 = selectionSort(list);
        System.out.println("Selection Sort !: ");
        for(int i:arr2){
            System.out.println(i);

        }
        insertionSort(list);
        System.out.println("Insertion array after sorting : "
                + Arrays.toString(list));

        System.out.println("Bubble Array After Sort");
        for(int i=0; i < list.length; i++){
            System.out.print(list[i] + " ");
        }

    }


    public static int[] selectionSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        for (int i = 0; i < array.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < array.length; j++)
                if (array[j] < array[index])
                    index = j;

            int smallerNumber = array[index];
            array[index] = array[i];
            array[i] = smallerNumber;
        }
        for(int i=0; i<array.length; i++){
            for(int j=i+1; j<array.length; j++){
                if(array[j]<array[i]){
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }

        }

        //final long endTime = System.currentTimeMillis();
        //final long executionTime = endTime - startTime;
        //this.executionTime = executionTime;
        return list;
    }

    public  static int[] insertionSort(int[] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i;

            // create right place by moving elements
            while (j > 0 && array[j - 1] > current) {

                // move
                array[j] = array[j - 1];
                j--;
            }

            // found the right place, insert now
            array[j] = current;
        }
        //final long endTime = System.currentTimeMillis();
        //final long executionTime = endTime - startTime;
        //this.executionTime = executionTime;
        return list;
    }





    public static int[] bubbleSort(int [] array){
        int [] list = array;
        //implement here

        for(int i=0; i < list.length; i++){
            for(int j=1; j < (list.length-i); j++){
                int temp = 0;
                if(list[j-1] > list[j]){
                    //swap the elements!
                    temp = list[j-1];
                    list[j-1] = list[j];
                    list[j] = temp;
                }

            }
        }
        
        
        
        
        return list;
    }
    

    public int [] mergeSort(int [] array){
        int [] list = array;
        //implement here
        
        

        return list;
    }
    

    public int [] quickSort(int [] array){
        int [] list = array;
        //implement here

        

        return list;
    }
    
    public int [] heapSort(int [] array){
        int [] list = array;
        //implement here
        
        

        return list;
    }


    public int [] bucketSort(int [] array){
        int [] list = array;
        //implement here
        
        

        return list;
    }
    
    public int [] shellSort(int [] array){
        int [] list = array;
        //implement here
        
        

        return list;
    }

    public static void printSortedArray(int [] array){
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
        System.out.println("hello");
    }



}
