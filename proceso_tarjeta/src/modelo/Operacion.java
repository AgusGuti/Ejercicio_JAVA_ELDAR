package modelo;

public class Operacion {

	private Tarjeta tajeta;
	private float importe;
	
	public Operacion(Tarjeta tajeta, float importe) {
		super();
		this.tajeta = tajeta;
		this.importe = importe;
	}

	@Override
	public String toString() {
		return "Operacion [tajeta=" + tajeta + ", importe=" + importe + "]";
	}

	public Tarjeta getTajeta() {
		return tajeta;
	}

	public void setTajeta(Tarjeta tajeta) {
		this.tajeta = tajeta;
	}

	public float getImporte() {
		return importe;
	}

	public void setImporte(float importe) {
		this.importe = importe;
	}
	
	public boolean validarOperacion()
	{
		boolean result = false;
		
		if(this.importe<1000f)
			result=false;
		
		return result;
	}
	
}
