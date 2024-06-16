package backend;

import java.util.ArrayList;
import java.util.List;

public class FotosPerfil 
{
	private final static int TAM=12;
	private static List<String> direccionFotos;
	
	public FotosPerfil()
	{
		direccionFotos= new ArrayList<String>();
	}
	
	public void creaLista()
	{
		String direccion="";
		for(int x=0;x<TAM;++x)
		{
			direccion="fotosPerfil/avatar"+(x+1)+".png";
			direccionFotos.add(direccion);
		}
	}
	
	public String obtenerDireccion()
	{
		String direccion;
		if(direccionFotos.size()>=0)
		{
			direccion=direccionFotos.get(0);
		}
		else
		{
			direccion="";
		}
		eliminar();
		return direccion;
	}
	
	public void eliminar()
	{
		direccionFotos.remove(0);
	}

}
