package oopsConcept;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class FileHandling 
{

	public static void readProp() throws Exception
	{
		//File f = new File("./TestData/data.properties");  //make file connection
		
		FileReader fr = new FileReader("./TestData/data.properties");
		
		Properties prop = new Properties();
		
		prop.load(fr);  //load the full data file into memory
		System.out.println(prop.get("automation"));
	
		System.out.println(prop.get("proglang"));
		
		System.out.println("welcome");
		
	}
	
	
	
	public static void readData() throws Exception
	{
		File f = new File("./TestData/abc.txt");  //make file connection
		
		FileReader fr = new FileReader(f);
	
		int r = fr.read();  //116, 104
		
		//loops in java
		while(r!=-1)  //116!=-1, 104!=-1
		{
			System.out.print((char)r);   //read the data.//t h i s
			r=fr.read();
		}
		
		
	}
	
	public static void writedata() throws Exception
	{
		File f = new File("./TestData/xyz.txt");  //make file connection
		FileWriter fw = new FileWriter(f);
		
		fw.write("this is firts line of data");
		fw.flush();
		fw.close();
		
	}
	
	
	public static void main(String[] args) throws Exception {
		//FileHandling.readData();
		//FileHandling.writedata();
		FileHandling.readProp();
	}
}
