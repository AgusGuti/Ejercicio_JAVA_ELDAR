package modelo;

import java.util.Calendar;
import java.util.GregorianCalendar;


public class Tarjeta {
	private String marca;
	private long numero;
	private Cardholder cardholder;
	private GregorianCalendar vencimiento;
	
	
	public Tarjeta(String marca, long numero, Cardholder cardholder, GregorianCalendar fe01) {
		super();
		this.marca = marca;
		this.setNumero(numero);
		this.cardholder = cardholder;
		this.vencimiento = fe01;
	}


	@Override
	public String toString() {
		return "Tarjeta:\n"
				+ "Marca= " + marca 
				+ ",\nNumero= " + numero 
				+ ",\nCardholder= " + cardholder.toString() 
				+ ",\nFecha Vencimiento= " + (vencimiento.get(Calendar.MONTH)+1) + "/" + vencimiento.get(Calendar.YEAR);
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public long getNumero() {
		return numero;
	}


	public void setNumero(long numero) {
		if(Long.toString(numero).length() == 16)
			this.numero = numero;
		else
			System.out.println("ERROR> Formato invalido en numero de tarjeta.");
	}


	public Cardholder getCardholder() {
		return cardholder;
	}


	public void setCardholder(Cardholder cardholder) {
		this.cardholder = cardholder;
	}


	public Calendar getVencimiento() {
		return vencimiento;
	}


	public void setVencimiento(GregorianCalendar fecha) {
		this.vencimiento = fecha;
	}
	
	public boolean validarTarjeta()
	{
		GregorianCalendar hoy = new GregorianCalendar();
		boolean result= false;
		
		if(this.vencimiento.after(hoy))
			result = true;
		
		return result;		
	}
	

}