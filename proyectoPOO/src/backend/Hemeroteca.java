package backend;

import java.util.List;

public class Hemeroteca extends Almacen
{
	private List<RecursoImpreso> recursoImpreso;
	private List<RecursoDigital>  recursoDigital;
	
	
	//Constructor con parametros
	public Hemeroteca (List<RecursoImpreso> recursoImpreso, List<RecursoDigital> recursoDigital, String nombre, String direccion)
	{
		super(nombre,direccion);
		this.recursoDigital = recursoDigital;
		this.recursoImpreso = recursoImpreso;
	}
	
	//Constructor por defecto
	public Hemeroteca(){
		
	}
	
	//Metodo de la clase abstracta
	public void imprimirInventario() 
	{
		for(RecursoImpreso i: recursoImpreso)
		{
			i.imprimirDatos();
		}
		
		for(RecursoDigital p: recursoDigital)
		{
			p.imprimirDatos();
		}
	}
	
	
	public int contarRecursos()
	{
		int tot=recursoImpreso.size()+recursoDigital.size();
		return tot;
	}

	//Getters y setters
	public List<RecursoImpreso> getRecursoImpreso() {
		return recursoImpreso;
	}

	public void setRecursoImpreso(List<RecursoImpreso> recursoImpreso) {
		this.recursoImpreso = recursoImpreso;
	}

	public List<RecursoDigital> getRecursoDigital() {
		return recursoDigital;
	}

	public void setRecursoDigital(List<RecursoDigital> recursoDigital) {
		this.recursoDigital = recursoDigital;
	}
	
	
}
