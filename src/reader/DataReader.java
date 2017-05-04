package reader;
import java.io.*;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
public class DataReader {

	public static void main(String[] args) throws IOException {
		/*
		 * User API to read the below textFile and print to console.
		 * Use BufferedReader class.
		 * Use try....catch block to handle Exception.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */

		//String textFile = System.getProperty("user.dir") + "/src/data/self-driving-car.txt";
		// The name of the file to open.
		//String fileName = "temp.txt";

		// This will reference one line at a time
		// The name of the file to open.
		String fileName = "C:\\Users\\Sharif\\IdeaProjects\\MidtermMarch2017\\src\\data\\self-driving-car";

		// This will reference one line at a time
		String line = null;

		try {
			// FileReader reads text files in the default encoding.
			FileReader fileReader =
					new FileReader(fileName);

			// Always wrap FileReader in BufferedReader.
			BufferedReader bufferedReader =
					new BufferedReader(fileReader);

			while((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
			}

			// Always close files.
			bufferedReader.close();
		}
		catch(FileNotFoundException ex) {
			System.out.println(
					"Unable to open file '" +
							fileName + "'");
		}
		catch(IOException ex) {
			System.out.println(
					"Error reading file '"
							+ fileName + "'");
			// Or we could just do this:
			// ex.printStackTrace();
		}

	}
}
