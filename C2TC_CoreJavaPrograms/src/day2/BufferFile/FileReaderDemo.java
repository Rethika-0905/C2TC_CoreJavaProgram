package day2.BufferFile;

/*import java.io.BufferedReader;
import java.io.IOException;
import java.io.File;
import java.io.FileReader;
import java.net.URL;*/
import java.io.*;
import java.net.*;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException{
		URL resource = FileReaderDemo.class.getResource("Handling.txt");
		
		if (resource == null)
		{
			System.err.println("File not found");
		}
		
		File file = new File(resource.getFile());
		
		FileReader fileReader = new FileReader(file);
		
		BufferedReader reader = new BufferedReader(fileReader);
		
		String line;
		
		while((line = reader.readLine()) != null)
		{
			System.out.println(line);
		}
		
		reader.close();

	}

}
