package schedular.com.project;

import java.io.BufferedReader;
import java.io.Console;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TestClass {

	public static void main(String[] args) throws IOException {
		System.out.println("Testing");
		Runtime.getRuntime().exec("notepad");
		
		try{      
            FileOutputStream fout=new FileOutputStream("c:\\Users\\Ashish.Shriwatri\\testout.txt");      
            fout.write(65);   
            fout.write(66);
            fout.write(67);
            fout.write(68);
            fout.write(69);
            fout.close();      
            System.out.println("success...");   
            FileInputStream fin=new FileInputStream("c:\\\\Users\\\\Ashish.Shriwatri\\\\testout.txt");      
            int i=fin.read();    
            System.out.println((char)i);      
    
            fin.close();   
            
            System.out.println("Enter the name of the person");  
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));   
            String name = reader.readLine();   
            System.out.println(name);   
            
            
			/*
			 * String str = "Hello/This is JavaTpoint/My name is Abhishek."; //Create
			 * scanner with the specified String Object Scanner scanner = new Scanner(str);
			 * System.out.println("Boolean Result: "+scanner.hasNextBoolean()); //Change the
			 * delimiter of this scanner scanner.useDelimiter("/"); //Printing the tokenized
			 * Strings System.out.println("---Tokenizes String---");
			 * while(scanner.hasNext()){ System.out.println(scanner.next()); } //Display the
			 * new delimiter System.out.println("Delimiter used: " +scanner.delimiter());
			 * scanner.close();
			 */
            
            Console c=System.console();      
            System.out.println("Enter your name: ");      
            String n=c.readLine();      
            System.out.println("Welcome "+n);  
           }catch(Exception e){System.out.println(e);} 

	}

}
