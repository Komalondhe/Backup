package com.Day25;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;import java.util.Map.Entry;

public class JavaNetworking {

	public static void main(String[] args) {
		String urlString="https://github.com";
		try {
			URL url=new URL(urlString);
			HttpURLConnection connection=(HttpURLConnection)url.openConnection();
			  connection.setRequestMethod("GET");
			  
			  
			  Map<String, List<String>>headers=connection.getHeaderFields();
			  System.out.println("ResponseHeader");
			  for(Map.Entry<String, List<String>>entry:headers.entrySet()) {
			  System.out.println(entry.getKey()+":"+entry.getValue());}
			  
			  int responseCode=connection.getResponseCode();
			  System.out.println("Response code:"+responseCode);
			  
			  
			  
			  BufferedReader inBufferedReader=new BufferedReader(new InputStreamReader(connection.getInputStream()));
			  
			  String inpuLine;
			  StringBuilder responsedBody=new StringBuilder();
			  while((inpuLine=inBufferedReader.readLine())!=null) {
				  responsedBody.append(inpuLine).append("\n");
			  }
			  inBufferedReader.close();
			  System.out.println("Responsed Body:");
			  System.out.println(responsedBody.toString());
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
