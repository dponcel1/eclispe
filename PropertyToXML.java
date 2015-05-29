package com.FILEconvert.xml;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class PropertyToXML {
	
	public static void main(String[] args) throws IOException
    {
    	Properties props = new Properties();
    	try{
    	props.load(PropertyToXML.class.getClassLoader().getResourceAsStream("com/Fileconvert/servlets.properties"));
    	}catch (Exception e){
    		e.printStackTrace();
    	}
    	//Path for the output file
    	File file = new File("servlets.xml");
    	file.createNewFile();
    	OutputStream out = new FileOutputStream(file);
     	//Call the utility method to store the properties values to XML file
    	props.storeToXML(out, "Message Properties","UTF-8");
    }

}
