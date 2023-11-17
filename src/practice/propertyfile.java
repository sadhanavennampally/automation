package practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class propertyfile 
{
public static void main(String[] args) throws IOException
{
	FileInputStream fis=new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\Sadhna_selenium\\abc\\credential.properties.txt");
	Properties p=new Properties();
	p.load(fis);
	String UN=p.getProperty("un");
	System.out.println(UN);
	
}
}
