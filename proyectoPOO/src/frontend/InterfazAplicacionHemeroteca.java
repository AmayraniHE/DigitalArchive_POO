package frontend;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import backend.FotosPerfil;
import backend.Hemeroteca;
import backend.RecursoDigital;
import backend.Usuario;
import backend.RecursoImpreso;
import backend.Tipo;

/**
 * @author Fuentes Flores Mauricio
 * @author Gutierrez Segura Jhonatan Lemuel
 * @author Hernández Espíndola Amayrani
 * @author Zamano Campos Irving Daniel
 */

public class InterfazAplicacionHemeroteca 
{	
	//Fronted
	private Ingresar ingresar;
	private Registro registro;
	private PaginaPrincipal paginaPrincipal;
	private Busqueda busqueda;
	private Hemerotecas hemerotecas;
	private Perfil perfil;
	private Novedades novedades;
	private PagHeme pagHeme;
	
	//Backed
	private static List<Hemeroteca> hemerotecasDatos;
	private static  List<Usuario> usuarios;
	private static FotosPerfil fotos;
	
	private static Usuario usuarioActual;
	
	
	public InterfazAplicacionHemeroteca()
	{
		ingresar = new Ingresar(this);
		registro = new Registro(this);
		paginaPrincipal = new PaginaPrincipal(this);
		busqueda = new Busqueda(this);
		hemerotecas = new Hemerotecas(this);
		perfil = new Perfil(this);
		novedades = new Novedades(this);
		pagHeme = new PagHeme(this);
		
		hemerotecasDatos = new ArrayList<Hemeroteca>() ;
		usuarios = new ArrayList<Usuario>();
		fotos = new FotosPerfil();
		fotos.creaLista();
		
		
		
		Usuario usuarioTmp = new Usuario("Administrador","","","admin","password");
		usuarioTmp.setDireccionFoto(fotos.obtenerDireccion());
		usuarios.add(usuarioTmp);
		
		usuarioTmp = new Usuario("Irving Daniel","Zamano","Campos","irvingZC","0203");
		usuarioTmp.setDireccionFoto(fotos.obtenerDireccion());
		usuarios.add(usuarioTmp);
		
		usuarioTmp = new Usuario("Amayrani","Hernández","Espíndola","mitsu","2315");
		usuarioTmp.setDireccionFoto(fotos.obtenerDireccion());
		usuarios.add(usuarioTmp);
		
		
		
		List<RecursoImpreso> recursoImpTemp = new ArrayList<RecursoImpreso>();
		List<RecursoDigital> recursoDigTemp = new ArrayList<RecursoDigital>();
		
		RecursoImpreso recurso = new RecursoImpreso(true,"El Universal",182768712, Tipo.DIARIO, "El Universal", new Date(2017), "México", "Noticias");
		recursoImpTemp.add(recurso);
		
		recurso = new RecursoImpreso(false,"Kilometro 0",1782710928, Tipo.REVISTA, "Ed.Mex", new Date(2018), "México", "Diversos,Cultura");
		recursoImpTemp.add(recurso);
		
		recurso = new RecursoImpreso(true,"El pregonero",987871270, Tipo.PERIODICO, "El pregonero", new Date(2020), "México", "Diversos");
		recursoImpTemp.add(recurso);
		
		RecursoDigital recurso2 = new RecursoDigital("pdf/diario1.pdf", "Excelsior", 16236811, Tipo.DIARIO, "Excelsior", new Date(2022), "México", "Noticias");
		recursoDigTemp.add(recurso2);
		
		recurso2 = new RecursoDigital("pdf/periodico1.pdf", "La Tierra Canica", 812767329, Tipo.PERIODICO, "UNAM", new Date(2022), "México", "Ciencia,Infantil");
		recursoDigTemp.add(recurso2);
		
		recurso2 = new RecursoDigital("pdf/revista1.pdf", "Revista Científica", 91291028, Tipo.REVISTA, "CIDC", new Date(2022), "México", "Ciencia, Inteligencia Artificial");
		recursoDigTemp.add(recurso2);
		
		Hemeroteca hemeTmp = new Hemeroteca(recursoImpTemp,recursoDigTemp,"Hemeroteca Nacional Digital de México","Digital");
		hemerotecasDatos.add(hemeTmp);
		//System.out.println(hemeTmp.getNombre());
		
		
		recursoImpTemp = new ArrayList<RecursoImpreso>();
		recursoDigTemp = new ArrayList<RecursoDigital>();
		
		recurso = new RecursoImpreso(false,"La Jornada",1273989, Tipo.DIARIO, "La Jornada", new Date(2019), "México", "Noticias");
		recursoImpTemp.add(recurso);
		
		recurso = new RecursoImpreso(true,"Artes de México",787687884, Tipo.REVISTA, "Artes de México", new Date(2022), "México", "Diversos,Cultura,Arte");
		recursoImpTemp.add(recurso);
		
		recurso = new RecursoImpreso(true,"Milenio",728374892, Tipo.PERIODICO, "Milenio", new Date(2021), "México", "Diversos");
		recursoImpTemp.add(recurso);
		
		recurso2 = new RecursoDigital("pdf/diario2.pdf", "Diario Oficial de la Federación", 91282137, Tipo.DIARIO, "Gobierno de México", new Date(2022), "México", "Noticias, País, Estado, Política");
		recursoDigTemp.add(recurso2);
		
		recurso2 = new RecursoDigital("pdf/periodico2.pdf", "El Informador", 23416777, Tipo.PERIODICO, "Carlos Álvarez", new Date(2022), "México", "Ciencia,Infantil");
		recursoDigTemp.add(recurso2);
		
		recurso2 = new RecursoDigital("pdf/revista2.pdf", "Revista Científica", 121198270, Tipo.REVISTA, "CIDC", new Date(2022), "México", "Ciencia, Cambio Climático");
		recursoDigTemp.add(recurso2);
		
		hemeTmp = new Hemeroteca(recursoImpTemp,recursoDigTemp,"Biblioteca de México","De La Ciudadela 4, Colonia Centro, Centro, Cuauhtémoc, 06040 Ciudad de México, CDMX");
		hemerotecasDatos.add(hemeTmp);
		
		
		recursoImpTemp = new ArrayList<RecursoImpreso>();
		recursoDigTemp = new ArrayList<RecursoDigital>();
		
		recurso = new RecursoImpreso(true,"El Sol de México",42193824, Tipo.DIARIO, "El Sol de México", new Date(2018), "México", "Noticias");
		recursoImpTemp.add(recurso);
		
		recurso = new RecursoImpreso(false,"Tiempo Libre",592392992, Tipo.REVISTA, "Tiempo Libre", new Date(2014), "México", "Diversos,Cultura,Actividades");
		recursoImpTemp.add(recurso);
		
		recurso = new RecursoImpreso(true,"La Crónica",102324989, Tipo.PERIODICO, "La Crónica", new Date(2021), "México", "Diversos, Noticias");
		recursoImpTemp.add(recurso);
		
		recurso2 = new RecursoDigital("pdf/diario3.pdf", "El Heraldo", 293879132, Tipo.DIARIO, "El Heraldo", new Date(2022), "México", "Noticias, Estado, Política, Recetas");
		recursoDigTemp.add( recurso2);
		
		recurso2 = new RecursoDigital("pdf/periodico3.pdf", "El Muégano divulgador", 493843298, Tipo.PERIODICO, "UNAM", new Date(2005), "México", "Ciencia, Lectura");
		recursoDigTemp.add(recurso2);
		
		recurso2 = new RecursoDigital("pdf/revista3.pdf", "inventio", 712873881, Tipo.REVISTA, "FES Cuautitlán, UAEM", new Date(2022), "México", "Político, Crimen");
		recursoDigTemp.add(recurso2);
		
		hemeTmp = new Hemeroteca(recursoImpTemp,recursoDigTemp,"UAEM","Digital");
		hemerotecasDatos.add(hemeTmp);
		
		
		recursoImpTemp = new ArrayList<RecursoImpreso>();
		recursoDigTemp = new ArrayList<RecursoDigital>();
		
		recurso = new RecursoImpreso(true,"Diario de México",90218329, Tipo.DIARIO, "ddmx", new Date(2022), "México", "Noticias");
		recursoImpTemp.add(recurso);
		
		recurso = new RecursoImpreso(false,"¿Cómo ves?",76326717, Tipo.REVISTA, "UNAM", new Date(2018), "México", "Diversos,Cultura");
		recursoImpTemp.add(recurso);
		
		recurso = new RecursoImpreso(false,"Gaceta UNAM",31981281, Tipo.PERIODICO, "UNAM", new Date(2020), "México", "Ciencia, Lectura, Cultura, Novedades");
		recursoImpTemp.add(recurso);
		
		recurso2 = new RecursoDigital("pdf/diario4.pdf", "Exxon", 61723188, Tipo.DIARIO, "Exxon", new Date(2022), "México", "Noticias, Anuncios");
		recursoDigTemp.add( recurso2);
		
		recurso2 = new RecursoDigital("pdf/periodico4.pdf", "Gaceta UNAM", 39273819, Tipo.PERIODICO, "UNAM", new Date(2022), "México", "Ciencia, Lectura, Cultura, Novedades");
		recursoDigTemp.add(recurso2);
		
		recurso2 = new RecursoDigital("pdf/revista4.pdf", "ciencia", 12333009, Tipo.REVISTA, "ciencia", new Date(2022), "México", "Ciencia");
		recursoDigTemp.add(recurso2);
		
		hemeTmp = new Hemeroteca(recursoImpTemp,recursoDigTemp,"UNAM","Centro Cultural Universitario, C.U., Coyoacán, 04510 Ciudad de México, CDMX");
		hemerotecasDatos.add(hemeTmp);
	}
	
	public static void main(String[] args)
	{
		InterfazAplicacionHemeroteca ventanaPrincipal = new InterfazAplicacionHemeroteca();
		ventanaPrincipal.ingresar.setVisible(true);
	}

	public void mostrarRegistrarse()
	{
		registro.getCampoNombre().setText(null);
		registro.getCampoApeP().setText(null);
		registro.getCampoApeM().setText(null);
		registro.getCampoUsuario().setText(null);
		registro.getCampoContrase().setText(null);
		registro.setVisible(true);
	}
	
	public void regresarSalir()
	{
		ingresar.getCampoUsuario().setText(null);
		ingresar.getCampoContrase().setText(null);
		ingresar.setVisible(true);
	}
	
	public void mostrarPrincipal()
	{
		paginaPrincipal.setVisible(true);
	}
	
	
	public boolean inicioSesion(String usu,String pw)
	{
		boolean ok=false;
		int p=buscarPos(usu);
		
		if(usuarios.get(p).getContraseña().equals(pw))
		{
			usuarioActual=usuarios.get(p);
			//System.out.println(usuarioActual.getApellidoM());
			ok=true;
		}
		
		return ok;
		
	}
	
	public int buscarPos(String usu)
	{
		int p=-1;
		
		for(int i=0;i<usuarios.size();++i)
		{
			if(usuarios.get(i).getCuenta().equals(usu))
			{
				p=i;
			}
		}
		
		return p;
	}
	
	public void crearCuenta(Usuario temp)
	{
		Usuario a = temp;
		a.setDireccionFoto(fotos.obtenerDireccion());
		usuarios.add(a);
		
	}
	
	public void mostrarPerfil()
	{
		perfil.llenarDatos();
		perfil.setVisible(true);
	}
	
	public void cambiarPsWrd(String newPassword)
	{
		int p=buscarPos(usuarioActual.getCuenta());
		usuarios.get(p).setContraseña(newPassword);
	}
	
	public void eliminarCuenta()
	{
		int p=buscarPos(usuarioActual.getCuenta());
		usuarios.remove(p);
	}
	
	public void mostrarNovedades()
	{
		novedades.setVisible(true);
	}
	
	public void mostrarHeme()
	{
		hemerotecas.setVisible(true);
	}
	
	public void mostrarPagHeme(int num)
	{
		switch(num)
		{
		case 1:
			pagHeme.llenarDatos(hemerotecasDatos.get(0));
			break;
		case 2:
			pagHeme.llenarDatos(hemerotecasDatos.get(1));
			break;
		case 3:
			pagHeme.llenarDatos(hemerotecasDatos.get(2));
			break;
		case 4:
			pagHeme.llenarDatos(hemerotecasDatos.get(3));
			break;
		}
		pagHeme.setVisible(true);
	}
	
	public void mostrarBusqueda()
	{
		busqueda.getJrbAutor().setSelected(false);
		busqueda.getJrbTema().setSelected(false);
		busqueda.getJrbTitulo().setSelected(false);
		busqueda.getCampoBusqueda().setText("");
		busqueda.setVisible(true);
	}

	/////////////////////////////////////////////////////////////////////////////////////////////////7
	public Hemerotecas getHemerotecas() {
		return hemerotecas;
	}

	public void setHemerotecas(Hemerotecas hemerotecas) {
		this.hemerotecas = hemerotecas;
	}

	public static List<Usuario> getUsuarios() {
		return usuarios;
	}

	public static void setUsuarios(List<Usuario> usuarios) {
		InterfazAplicacionHemeroteca.usuarios = usuarios;
	}

	public Usuario getUsuarioActual() {
		return usuarioActual;
	}

	public void setUsuarioActual(Usuario usuarioActual) {
		InterfazAplicacionHemeroteca.usuarioActual = usuarioActual;
	}

	public static List<Hemeroteca> getHemerotecasDatos() {
		return hemerotecasDatos;
	}

	public static void setHemerotecasDatos(List<Hemeroteca> hemerotecasDatos) {
		InterfazAplicacionHemeroteca.hemerotecasDatos = hemerotecasDatos;
	}

}
