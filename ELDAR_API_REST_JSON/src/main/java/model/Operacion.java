package model;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Operacion {
	
	private @Id @GeneratedValue long id;
	private Tarjeta tarjeta;
	private float importe;
	private float tasa;
	
	
	public Operacion(Tarjeta tarjeta, float importe) {
		super();
		this.tarjeta = tarjeta;
		this.setImporte(importe);
		this.setTasa(this.tarjeta.getMarca());
	}

	@Override
	public String toString() {
		return "Operacion:\n"
				+ "tarjeta= " + tarjeta 
				+ ",\nImporte= " + importe
				+ ",\nTasa= " + tasa;
	}

	public String mostrarTasa()
	{
		return "Tasa calculada: " + tasa
				+ "\nMarca de tarjeta= " + this.tarjeta.getMarca() 
				+ ",\nImporte= " + importe;
	}
	
	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Tarjeta getTarjeta() {
		return tarjeta;
	}

	public void setTarjeta(Tarjeta tarjeta) {
		this.tarjeta = tarjeta;
	}

	public float getImporte() {
		return importe;
	}

	public void setImporte(float importe) {
		if(importe >= 0)
			this.importe = importe;
		else
			System.out.println("\nERROR> Importe negativo.");
	}
	
	public float getTasa() {
		return tasa;
	}
	
	//Como hay casos que producen una tasa menor a 0.3 y
	//mayor a 5.0 hardcodeo esos valores en caso necesario.
	public void setTasa(float tasa) {
		float tasaFinal= tasa;
		
		if(0.3f >= tasa)
			tasaFinal= 0.3f;
		else if (tasa >= 5.0f)
			tasaFinal= 5.0f;
		
		this.tasa = tasaFinal;
	}
	
	public boolean validarOperacion()
	{
		boolean result = false;
		
		if(this.importe<1000f && this.tarjeta.validarTarjeta())
			result=true;
		
		return result;
	}
		
	
	public void setTasa(String marca)
	{
		GregorianCalendar fecha = new GregorianCalendar();
		
		switch(marca)
		{
			case "VISA":
				this.setTasa((fecha.get(Calendar.YEAR)-2000)/(float)(fecha.get(Calendar.MONTH)+1));
				break;
			case "NARA":
				this.setTasa(fecha.get(Calendar.DAY_OF_MONTH) * 0.5f);
				break;
			case "AMEX":
				this.setTasa((fecha.get(Calendar.MONTH)+1) * 0.1f);
				break;
		}		
	}
}
