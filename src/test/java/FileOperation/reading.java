package FileOperation;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class reading {

	public static void main(String[] args) throws IOException {

		String filenm = "/home/staah/mydata"; // get the file name from the first argument

		try (FileReader fr = new FileReader(filenm); // create a FileReader object
				BufferedReader br = new BufferedReader(fr); // create a BufferedReader object
		) {
			String data = "";
			while ((data = br.readLine()) != null) { // read the file line by line
				System.out.println(data);
			}
		} catch (FileNotFoundException e) { // handle the file not found exception
			System.out.println("The file does not exist.");
			e.printStackTrace();
		} catch (IOException e) { // handle the input/output exception
			System.out.println("An error occurred while reading the file.");
			e.printStackTrace();
		}
	}
}