package com.example.restservice;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

public class JsonNodeDemo 
{
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    JsonNode rootNode;
    ObjectMapper objectMapper;
    
    public JsonNodeDemo()throws IOException
    {
        objectMapper = new ObjectMapper();
        rootNode = objectMapper.readTree(new File("src/main/resources/operaciones.JSON"));
    }
    
	public JsonNode readJsonWithJsonNode() throws JsonProcessingException 
	{
	    String prettyPrintOperaciones = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(rootNode);
	    logger.info(prettyPrintOperaciones+"\n");
	    return rootNode;
	}

	public String readTasaNode(String marca, float importe)
	{
		Iterator<JsonNode> itr = rootNode.path("operaciones").elements();
		JsonNode tasaNode=rootNode.path("tasa");
		
		while(itr.hasNext())
		{
			rootNode = itr.next();
			
			if(rootNode.path("importe").asDouble()== importe 
					&& rootNode.path("tarjeta").path("marca").asText().equals(marca))
			{ 
				tasaNode = rootNode;
			}
		}

	    String tasa= tasaNode.path("tasa").asText();
	    
	    logger.info("Marca: "+tasaNode.path("tarjeta").path("marca").asText());
	    logger.info("Importe: "+tasaNode.path("importe").asText());
	    logger.info("Tasa de operacion: "+tasa+"\n");
	    
	    return tasa;
	}

}