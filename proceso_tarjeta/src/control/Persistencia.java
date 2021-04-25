package control;

import java.nio.file.Files;
import java.nio.file.Paths;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Persistencia {
	
	public static void writeJson(String filename) throws Exception {
	    JSONObject sampleObject = new JSONObject();
	    sampleObject.put("name", "Stackabuser");
	    sampleObject.put("age", 35);

	    JSONArray messages = new JSONArray();
	    messages.add("Hey!");
	    messages.add("What's up?!");

	    sampleObject.put("messages", messages);
	    Files.write(Paths.get(filename), sampleObject.toJSONString().getBytes());
	}

}