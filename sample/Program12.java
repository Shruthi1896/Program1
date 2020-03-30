package sample;
import java.io.*;
public class Program12 {

	    public static void main(String[] args) throws IOException {  
	        File data = new File("D:\\testout.txt");  
	        FileInputStream file = new FileInputStream(data); 
	        FilterInputStream filter =new FilterInputStream(file);
	        int i=0;
	        while((filter read())!= -1) {
	        	System.out.println((char)k)
	        	
	        }
	        filter.close();  
	        file.close();  
	        System.out.println("Success...");  
	    }  
	  

	}


