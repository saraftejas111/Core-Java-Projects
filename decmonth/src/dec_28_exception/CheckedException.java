package dec_28_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedException {
	public static void main(String[] args) {
		
		try {
			FileInputStream fis = new FileInputStream("pqr.txt");
		} catch (FileNotFoundException e) { 
			e.printStackTrace();
		}
	}

}
