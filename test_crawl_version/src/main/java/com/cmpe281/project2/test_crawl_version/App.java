package com.cmpe281.project2.test_crawl_version;
import java.io.IOException;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
    	System.out.println("Get the List of Java JDKs From Oracle Websites");
		Document doc = Jsoup.connect("http://www.oracle.com/technetwork/java/javase/downloads/index.html").get();
		Elements link = doc.select("h3#javasejdk");
		
		for(int a=0;a<link.size()-1;a++)
		{
			Element ele=link.get(a);
			Element linkinner = ele.select("a").first();
			
			System.out.println("Result is \t"+linkinner.html());
		}
		
//		System.out.println("Get the List of Tomcat versions From Tomcat Websites");
//		Document document = Jsoup.connect("https://tomcat.apache.org/download-80.cgi").get();
//		Elements linkElements = document.select("h3#Quick_Navigation").next().tagName("div");
//	
//		Element latest = linkElements.select("a").get(1);
//		Element sec_Latest = linkElements.select("a").get(2);
//		System.out.println("Result is \t"+latest.html());
//		System.out.println("Result is \t"+sec_Latest.html());
//		
//		
		
//		System.out.println("Get the List of Python versions From Python Websites");
//		Document document_python = Jsoup.connect("https://www.python.org/downloads/").get();
//		Elements linkElements_python = document_python.select("h3#Quick_Navigation").next().tagName("div");
//	
//		Element latest1 = linkElements.select("a").get(1);
//		Element sec_Latest1 = linkElements.select("a").get(2);
//		System.out.println("Result is \t"+latest.html());
//		System.out.println("Result is \t"+sec_Latest.html());
		
	}
	


    }

