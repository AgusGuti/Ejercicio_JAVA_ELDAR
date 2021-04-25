package ejecutable;

import java.util.GregorianCalendar;

import modelo.Cardholder;
import modelo.Operacion;
import modelo.Tarjeta;

public class Procesamiento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//SETEO DE OBJETOS DE PRUEBA
		GregorianCalendar fe01 = new GregorianCalendar();
		fe01.set(2024,7-1,1);
		GregorianCalendar fe02 = new GregorianCalendar();
		fe02.set(2020,11-1,1);
		GregorianCalendar fe03 = new GregorianCalendar();
		fe03.set(2027,2-1,1);
		
		Cardholder user01 = new Cardholder("AGUSTIN", "GUTIERREZ");
		
		Tarjeta tarj01 = new Tarjeta("VISA", 1234098745675432L, user01, fe01);
		Tarjeta tarj02 = new Tarjeta("NARA", 9812763409569274L, user01, fe02);
		Tarjeta tarj03 = new Tarjeta("AMEX", 4095692749812763L, user01, fe03);
		
		Operacion op01 = new Operacion(tarj01, 507.60f);
		Operacion op02 = new Operacion(tarj01, 1200.78f);
		Operacion op03 = new Operacion(tarj03, 245.20f);
		
		//MENSAJES
		String msj_valido = "Proceso/objeto valido.\n";
		String msj_invalido = "Proceso/objeto invalido.\n";	
		
		//PUNTO 01
		System.out.println("INFORMACION DE TARJETA:\n");
		System.out.println(tarj01.toString()+"\n");
		System.out.println(tarj02.toString()+"\n");
		System.out.println(tarj03.toString());
		
		System.out.println("\n----------------------------------------\n");
		
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
		
		System.out.println("\n----------------------------------------\n");
		
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
		
		System.out.println("\n----------------------------------------\n");
		
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
		
		System.out.println("\n----------------------------------------\n");
		
		System.out.println("TASA DE OPERACION 01: ");
		System.out.println(op01.mostrarTasa()+"\n");
		
		System.out.println("TASA DE OPERACION 02: ");
		System.out.println(op02.mostrarTasa()+"\n");
		
		System.out.println("TASA DE OPERACION  03: ");
		System.out.println(op03.mostrarTasa()+"\n");
		
		
	}

}
