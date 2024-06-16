package backend;

import java.util.Date;

import javax.swing.JOptionPane;

public class RecursoDigital extends Recurso implements Acciones
{
	private String direccionPDF;

	public RecursoDigital(String texto,String titulo, int id,Tipo tipo,String autor,Date publicacion,String lugar,String tema)
	{
		super(titulo,id,tipo,autor,publicacion,lugar,tema);
		this.direccionPDF = texto;
	}
	
	public RecursoDigital()
	{
		direccionPDF="pdf";
	}
	
	@overwrite
	public void imprimirDatos()
	{
		String salida = ajustarTexto();
		
		JOptionPane.showMessageDialog(null, salida);
	}
	
	public String getTexto() 
	{
		return direccionPDF;
	}

	public void setTexto(String texto) {
		this.direccionPDF = texto;
	}

	@Override
	public String ajustarTexto() 
	{
		String salida = "Datos Recurso Digital\n";
		
		salida+="\nTitulo: "+super.titulo;
		salida+="\nId: "+super.id;
		salida+="\nTipo: "+super.tipo;
		salida+="\nAutor: "+super.autor;
		salida+="\nPublicación: "+super.publicacion;
		salida+="\nLugar: "+super.lugar;
		salida+="\nTema: "+super.tema;	
		
		return salida;
	}
}
