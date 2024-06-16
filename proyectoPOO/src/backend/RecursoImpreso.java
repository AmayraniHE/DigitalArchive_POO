package backend;

import java.util.Date;

import javax.swing.JOptionPane;

public class RecursoImpreso extends Recurso 
{
	private Boolean disponible;
	
	public RecursoImpreso(Boolean disponible,String titulo, int id,Tipo tipo,String autor,Date publicacion,String lugar,String tema)
	{
		super(titulo,id,tipo,autor,publicacion,lugar,tema);
		this.disponible =disponible;
	}
	
	public RecursoImpreso()
	{
		
	}
	
	@overwrite
	public void imprimirDatos()
	{
		String salida = "Datos Recurso Impreso\n";
		
		salida+="\nTitulo: "+super.titulo;
		salida+="\nId: "+super.id;
		salida+="\nTipo: "+super.tipo;
		salida+="\nAutor: "+super.autor;
		salida+="\nPublicación: "+super.publicacion;
		salida+="\nLugar: "+super.lugar;
		salida+="\nTema: "+super.tema;
		if(disponible==true)
		{
			salida+="\nDisponible: Si";
		}
		else 
		{
			salida+="\nDisponible: No";
		}
		
		JOptionPane.showMessageDialog(null, salida);
	}

	public Boolean getDisponible() {
		return disponible;
	}

	public void setDisponible(Boolean disponible) {
		this.disponible = disponible;
	}
	
}
