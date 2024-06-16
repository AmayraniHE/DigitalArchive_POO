package backend;

public abstract class Almacen 
{
	protected String nombre;
	protected String direccion;
	
	public abstract void imprimirInventario();
	
	public Almacen(String nombre, String direccion) 
	{
		super();
		this.nombre = nombre;
		this.direccion = direccion;
	}
	
	public Almacen() {
		
	}
	
	public void imprimirDatos()
	{
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
}
