package com.example.restservice;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import model.Operacion;
import model.Tarjeta;

public class OperacionController {

	@RequestMapping(path = "/{marca}/{importe}", method = RequestMethod.GET)
	public Operacion getDatos(@PathVariable String marca, @PathVariable float importe) {
		Tarjeta tarj = new Tarjeta(marca, 0000000000000000, null, null);
		Operacion op = new Operacion(tarj, importe);
			
		return op;
	}
}
