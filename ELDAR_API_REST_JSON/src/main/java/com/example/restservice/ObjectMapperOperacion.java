package com.example.restservice;

import com.fasterxml.jackson.databind.ObjectMapper;

import model.Operacion;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.File;
import java.io.IOException;

public class ObjectMapperOperacion {
	
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    
    public Operacion readJsonWithObjectMapper() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Operacion operacion = objectMapper.readValue(new File("operaciones.JSON"), Operacion.class);
        logger.info(operacion.toString());
        return operacion;
    }
}