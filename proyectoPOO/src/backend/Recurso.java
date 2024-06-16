package backend;

import java.util.Date;

import javax.swing.JOptionPane;

public class Recurso 
{
	protected String titulo;
	protected int id;
	protected Tipo tipo;
	protected String autor;
	protected Date publicacion;
	protected String lugar;
	protected String tema;
	
	
	public Recurso(String titulo, int id, Tipo tipo, String autor, Date publicacion, String lugar, String tema)
	{
		this.titulo = titulo;
		this.id = id;
		this.tipo = tipo;
		this.autor = autor;
		this.publicacion = publicacion;
		this.lugar = lugar;
		this.tema = tema;
	}
	
	public Recurso() 
	{
		
	}
	
	public void imprimirDatos()
	{
		String salida = "Datos Recurso\n";
		
		salida+="\nTitulo: "+titulo;
		salida+="\nId: "+id;
		salida+="\nTipo: "+tipo;
		salida+="\nAutor: "+autor;
		salida+="\nPublicación: "+publicacion;
		salida+="\nLugar: "+lugar;
		salida+="\nTema: "+tema;
		
		JOptionPane.showMessageDialog(null, salida);
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Tipo getTipo() {
		return tipo;
	}
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public Date getPublicacion() {
		return publicacion;
	}
	public void setPublicacion(Date publicacion) {
		this.publicacion = publicacion;
	}
	public String getLugar() {
		return lugar;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	public String getTema() {
		return tema;
	}
	public void setTema(String tema) {
		this.tema = tema;
	}
	
}
