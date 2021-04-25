package modelo;

import java.util.GregorianCalendar;

public class Marca {
	private String nombre;
	private float tasa;
	
	
	public Marca(String nombre, float tasa) {
		super();
		this.nombre = nombre;
		this.tasa = tasa;
	}


	@Override
	public String toString() {
		return "Marca [nombre=" + nombre + ", tasa=" + tasa + "]";
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public float getTasa() {
		return tasa;
	}


	public void setTasa(float tasa) {
		if(0.3f <= tasa || tasa <= 5.0f)
			this.tasa = tasa;
		else
			System.out.println("\nERROR> Tasa fuera de rango posible.");
	}
	
	
	@SuppressWarnings("static-access")
	public void setTasa(String marca)
	{
		GregorianCalendar fecha = new GregorianCalendar();
		
		switch(marca)
		{
			case "VISA":
				this.tasa= (fecha.YEAR/(float)fecha.MONTH);
				break;
			case "NARA":
				this.tasa= fecha.DAY_OF_MONTH * 0.5f;
				break;
			case "AMEX":
				this.tasa= fecha.MONTH * 0.1f;
				break;
		}		
	}

}
