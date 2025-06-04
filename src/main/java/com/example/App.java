package com.example;

/**
 * Hello world!
 *
 */

import java.util.*;
import com.google.common.collect.ImmutableList;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;

public class App 
{
    public static void main( String[] args )
    {
        ImmutableList<String> il = ImmutableList.of("Apple","Banana","oranga");
	System.out.println(il);

	File source = new File("source.txt");
	File destination = new File("destination.txt");

	try {
		FileUtils.copyFile(source,destination);
		System.out.println("File copied successfully");
	}
	catch(IOException e) {
		System.err.println("The error is " + e.getMessage());
	}
    }
}
