package p1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
            // Create BufferedWriter object for writing
            BufferedWriter bufferedwriter = new BufferedWriter(new FileWriter("D://my_java_workspace//FileHandling//src//p1//Demofile1.txt"));

            bufferedwriter.write("Hello, I am Rajeshwari Nalbalwar.");
            bufferedwriter.newLine(); 
            bufferedwriter.write("This text will be copied to another file.");
            bufferedwriter.newLine();
            bufferedwriter.write("BufferedWriter makes writing efficient!");

            
            bufferedwriter.flush();
            bufferedwriter.close();

          
        } catch (IOException e) {
            e.printStackTrace();
        }
    
		
		
	try {
        // read above file here
        BufferedReader bufferedreader = new BufferedReader(new FileReader("D://my_java_workspace//FileHandling//src//p1//Demofile1.txt"));

        // Write to File2.txt
        BufferedWriter bufferedwriter = new BufferedWriter(new FileWriter("D://my_java_workspace//FileHandling//src//p1//Demofile2.txt"));

        String line;
        while ((line = bufferedreader.readLine()) != null) {
        	bufferedwriter.write(line);
        	bufferedwriter.newLine(); 
        	
        }

        bufferedwriter.close();
        bufferedreader.close();

    } catch (IOException e) {
        e.printStackTrace();
    }
}
		

	

}
