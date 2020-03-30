package sample;
import java.io.*;
public class Program10 {

		public static void main(String args[])throws Exception{    
		      FileOutputStream fout1=new FileOutputStream("D:\\f1.txt");    
		      FileOutputStream fout2=new FileOutputStream("D:\\f2.txt");    
		        
		      ByteArrayOutputStream bout=new ByteArrayOutputStream();
		      fout1.write(68);
		      fout2.write(69);
		      
		      bout.writeTo(fout1);
		      bout.writeTo(fout2);    
		        
		      bout.flush();    
		      bout.close();    
		      System.out.println("Success...");    
		     }    
		      

	}


