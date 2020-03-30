package sample;
import java.io.*;  

public class Program9 {

	public static void main(String[] args)throws Exception {
		    byte[] buf = { 45, 46, 47, 48 };  
		    ByteArrayInputStream byt = new ByteArrayInputStream(buf);  
		    int k = 0;  
		    while ((k = byt.read()) != -1) {  
		      char ch = (char) k;  
		      System.out.println("ASCII value of Character is:" + k + "; Special character is: " + ch);  
		    }  
		  }  
	 


	}


