package modelo;

public class Cardholder {
	private long id;
	private String nombre;
	private String apellido;
	
	
	public Cardholder(long id, String nombre, String apellido) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
	}


	@Override
	public String toString() {
		return "Cardholder:\n"
				+ "Nombre= " + nombre 
				+ ",\nApellido= " + apellido;
	}

	

	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}	

}
