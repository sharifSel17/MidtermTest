package math;

import databases.ConnectDB;
import java.util.ArrayList;
import java.util.List;
import java.sql.DriverManager;
public class LowestNumber {

	public static void main(String[] args) {
		/*
		 * Write java solution to find the lowest number from this array.
		 * Use one of the databases from mysql or mongodb to store and to retrieve.
		 */
		int  array[] = new int[]{211,110,99,34,67,89,67,456,321,456,78,90,45,32,56,78,90,54,32,123,67,5,679,54,32,65};
		int min = getMin(array);
		System.out.println("Minimum Value is: "+min);
		//ConnectDB connectDB = new ConnectDB();
		//List<String> lowestValue = new ArrayList<String>();
		//lowestValue.add(array.toString());
		try {
			//connectDB.InsertDataFromArryToMySql(array, "world.tbl_lowestNumber", "column_lowestNumber");
			//lowestValue = connectDB.readDataBase("world.tbl_lowestNumber", "column_lowestNumber");

		} catch (Exception e) {
			e.printStackTrace();
		}
		//System.out.println("Data is reading from the Table (tbl_primenumber) and displaying to the console");
		//for(String st:lowestValue){
			//System.out.println(st);
		//}
	}
	public static int getMin(int[] inputArray){
			int minValue = inputArray[0];
		    for(int i=1;i<inputArray.length;i++){
			if(inputArray[i] < minValue){
				minValue = inputArray[i];
			}
		}
		return minValue;
	}
}
