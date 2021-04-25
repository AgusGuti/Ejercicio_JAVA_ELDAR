package modelo;

import java.util.GregorianCalendar;

public class Tarjeta {
	private String marca;
	private long numero;
	private Cardholder cardholder;
	private GregorianCalendar vencimiento;
	
	
	public Tarjeta(String marca, long numero, Cardholder cardholder, GregorianCalendar vencimiento) {
		super();
		this.marca = marca;
		this.numero = numero;
		this.cardholder = cardholder;
		this.vencimiento = vencimiento;
	}


	@Override
	public String toString() {
		return "Tarjeta [marca=" + marca + ", numero=" + numero + ", cardholder=" + cardholder + ", fecha=" + vencimiento
				+ "]";
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
		this.numero = numero;
	}


	public Cardholder getCardholder() {
		return cardholder;
	}


	public void setCardholder(Cardholder cardholder) {
		this.cardholder = cardholder;
	}


	public GregorianCalendar getVencimiento() {
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
