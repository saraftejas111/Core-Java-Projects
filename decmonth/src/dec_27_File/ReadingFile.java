package dec_27_File;

import java.io.FileInputStream;

public class ReadingFile {
	public static void main(String[] args) throws Exception {
		
		try (FileInputStream fis = new FileInputStream("abc.txt")) {
			System.out.println(fis+"file is ready to read");
			
			      int k = fis.read();
			  
			System.out.println(  (char)(k) );
		}    catch (Exception e) {
			System.out.println(e);
			
		}  
   }
}