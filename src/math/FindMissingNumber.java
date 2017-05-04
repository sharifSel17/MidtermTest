package math;

/**
 * Created by mrahman on 04/22/17.
 */
public class FindMissingNumber {

    public static void main(String[] args) {
        /*
         * If n = 10, then array will have 9 elements in the range from 1 to 10.
         * For example {10,2,1, 4, 5, 3, 7, 8, 6}. One number will be missing in array (9 in this case).
         * Write java code to find the missing number from the array. Write static helper method to find it.
         */
         int [] array1 = new int[]{10, 2, 1, 4, 5, 3, 7, 8, 6};
         System.out.println("Missing number from array list : "+missingNumber(array1));
    }

    public static int missingNumber(int[] array2){
            int arrayHolder=array2.length+1;
            int sum=arrayHolder*(arrayHolder+1)/2;
            int resultSum=0;
            for(int i=0;i<array2.length;i++){
                resultSum+=array2[i];
            }
            int missingNum=sum-resultSum;
            return missingNum;
    }
}
