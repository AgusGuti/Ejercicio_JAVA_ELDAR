package com.example.demo;


import com.example.restservice.JsonNodeDemo;

public class JsonNodeDemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		try {
			JsonNodeDemo jd = new JsonNodeDemo();
			//jd.readJsonWithJsonNode();
			
			System.out.println("\n-------------------------------------\n");
			
			jd.readTasaNode("VISA", 500f);
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
