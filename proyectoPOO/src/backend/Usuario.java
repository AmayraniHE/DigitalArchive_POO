package backend;

public class Usuario 
{
	private String nombre;
	private String apellidoP;
	private String apellidoM;
	private String cuenta;
	private String contraseña;
	private String direccionFoto;
	
	public Usuario(String nombre, String apellidoP, String apellidoM, String cuenta, String contraseña)
	{
		this.nombre = nombre;
		this.apellidoP = apellidoP;
		this.apellidoM=apellidoM;
		this.cuenta = cuenta;
		this.contraseña = contraseña;
	}
	
	public Usuario()
	{
		
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidoP() {
		return apellidoP;
	}
	public void setApellidoP(String apellidoP) {
		this.apellidoP = apellidoP;
	}
	public String getCuenta() {
		return cuenta;
	}
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public String getDireccionFoto() {
		return direccionFoto;
	}

	public void setDireccionFoto(String direccionFoto) {
		this.direccionFoto = direccionFoto;
	}

	public String getApellidoM() {
		return apellidoM;
	}

	public void setApellidoM(String apellidoM) {
		this.apellidoM = apellidoM;
	}
	
}
