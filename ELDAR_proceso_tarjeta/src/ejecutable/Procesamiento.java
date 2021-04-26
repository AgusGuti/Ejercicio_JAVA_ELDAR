package ejecutable;

import java.time.LocalDate;


import modelo.Cardholder;
import modelo.Operacion;
import modelo.Tarjeta;

public class Procesamiento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	try {
		
		//SETEO DE OBJETOS DE PRUEBA
		LocalDate fe01 = LocalDate.of(2024,7,1);
		LocalDate fe02 = LocalDate.of(2020,11,1);
		LocalDate fe03 = LocalDate.of(2027,2,1);
		
		Cardholder user01 = new Cardholder(1,"AGUSTIN", "GUTIERREZ");
		
		Tarjeta tarj01 = new Tarjeta("VISA", 1234098745675432L, user01, fe01);
		Tarjeta tarj02 = new Tarjeta("NARA", 9812763409569274L, user01, fe02);
		Tarjeta tarj03 = new Tarjeta("AMEX", 4095692749812763L, user01, fe03);
		
		Operacion op01 = new Operacion(1,tarj01, 507.60f);
		Operacion op02 = new Operacion(2,tarj01, 1200.78f);
		Operacion op03 = new Operacion(3,tarj03, 245.20f);
			
		
		//MENSAJES
		String msj_valido = "Proceso/objeto valido.\n";
		String msj_invalido = "Proceso/objeto invalido.\n";	
		
		//PUNTO 01
		try {
			System.out.println("INFORMACION DE TARJETA:\n");
			System.out.println(tarj01.toString()+"\n");
			System.out.println(tarj02.toString()+"\n");
			System.out.println(tarj03.toString());
			
		} catch (Exception e) {
			System.out.println("Error al mostrar informacion de tarjetas.\n");
		}
		
		System.out.println("\n----------------------------------------\n");
		
		try {
			System.out.println("VALIDAR OPERACION:\n");			
			
			System.out.println("Operacion 01: ");
			if(op01.validarOperacion())
				System.out.println(msj_valido);
			else
				System.out.println(msj_invalido);
			
			System.out.println("Operacion 02: ");
			if(op02.validarOperacion())
				System.out.println(msj_valido);
			else
				System.out.println(msj_invalido);
			
			System.out.println("Operacion 03: ");
			if(op03.validarOperacion())
				System.out.println(msj_valido);
			else
				System.out.println(msj_invalido);
			
		} catch (Exception e) {
			System.out.println("Error al intentar validar operaciones.\n");
		}
		
		
		System.out.println("\n----------------------------------------\n");
		
		try {
			System.out.println("VALIDAR TAJETA:\n");
			
			System.out.println("Tarjeta 01: ");
			if(tarj01.validarTarjeta())
				System.out.println(msj_valido);
			else
				System.out.println(msj_invalido);
			
			System.out.println("Tarjeta 02: ");
			if(tarj02.validarTarjeta())
				System.out.println(msj_valido);
			else
				System.out.println(msj_invalido);
			
			System.out.println("Tarjeta 03: ");
			if(tarj03.validarTarjeta())
				System.out.println(msj_valido);
			else
				System.out.println(msj_invalido);
			
		} catch (Exception e) {
			System.out.println("Error al intentar validar tarjetas.\n");
		}
		
		
		System.out.println("\n----------------------------------------\n");
		
		try {
			System.out.println("COMPARAR TAJETAS 01 y 02:");		
			if(tarj02.equals(tarj01))
				System.out.println("Tarjetas identicas.\n");
			else
				System.out.println("Tarjetas diferentes.\n");
			
			System.out.println("COMPARAR TAJETAS 01 y 03:");		
			if(tarj03.equals(tarj01))
				System.out.println("Tarjetas identicas.\n");
			else
				System.out.println("Tarjetas diferentes.\n");
		} catch (Exception e) {
			System.out.println("Error al intentar comparar tarjetas.\n");
		}
		
		
		System.out.println("\n----------------------------------------\n");
		
		try {
			System.out.println("TASA DE OPERACION 01: ");
			System.out.println(op01.mostrarTasa()+"\n");
			
			System.out.println("TASA DE OPERACION 02: ");
			System.out.println(op02.mostrarTasa()+"\n");
			
			System.out.println("TASA DE OPERACION  03: ");
			System.out.println(op03.mostrarTasa()+"\n");
			
		} catch (Exception e) {
			System.out.println("Error al intentar obetener tasas.\n");
		}
		
	} catch (Exception e) {
		System.out.println("Error critico en el test de Procesamiento.\n");
	}
	
	}
}
