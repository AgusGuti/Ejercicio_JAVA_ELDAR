package modelo;

import java.time.LocalDate;


public class Tarjeta {
	private String marca;
	private long numero;
	private Cardholder cardholder;
	private LocalDate vencimiento;
	
	
	public Tarjeta(String marca, long numero, Cardholder cardholder, LocalDate fe01) {
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
				+ ",\nFecha Vencimiento= " + vencimiento.getMonthValue() + "/" + vencimiento.getYear();
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


	public LocalDate getVencimiento() {
		return vencimiento;
	}


	public void setVencimiento(LocalDate fecha) {
		this.vencimiento = fecha;
	}
	
	public boolean validarTarjeta()
	{
		LocalDate hoy = LocalDate.now();
		boolean result= false;
		
		if(this.vencimiento.isAfter(hoy))
			result = true;
		
		return result;		
	}
	

}
