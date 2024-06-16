package frontend;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Perfil extends javax.swing.JFrame
{
	private static final long serialVersionUID = 1L;
	// Variables declaration - do not modify                     
    private javax.swing.JScrollPane ScrollPanel;
    private javax.swing.JLabel apellidoM;
    private javax.swing.JLabel apellidoP;
    private javax.swing.JButton btnCambContr;
    private javax.swing.JButton btnEliminarCuenta;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel etiquetaApeM;
    private javax.swing.JLabel etiquetaApeP;
    private javax.swing.JLabel etiquetaNombre;
    private javax.swing.JLabel etiquetaPerfil;
    private javax.swing.JLabel etiquetaUsuario;
    private javax.swing.JLabel foto;
    private javax.swing.JList<String> listaElementosPr;
    private javax.swing.JLabel nombre;
    private javax.swing.JPanel panelRecursosPrestados;
    private javax.swing.JLabel username;

    private InterfazAplicacionHemeroteca ventanaPrincipal;
    
    private static String nom;
    private static String aP;
    private static String aM;
    private static String usu;
    private static String diFoto;
    private static ImageIcon imagenOriginal;
    
    public Perfil(InterfazAplicacionHemeroteca ventanaPrincipal) 
    {
    	this.ventanaPrincipal = ventanaPrincipal;
    	
    	nom="";
    	aP="";
        aM="";
        usu="";
        diFoto="";
    	
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public Perfil() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

                    
    private void initComponents() 
    {

        etiquetaPerfil = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        foto = new javax.swing.JLabel();
        etiquetaNombre = new javax.swing.JLabel();
        etiquetaApeP = new javax.swing.JLabel();
        etiquetaApeM = new javax.swing.JLabel();
        etiquetaUsuario = new javax.swing.JLabel();
        panelRecursosPrestados = new javax.swing.JPanel();
        ScrollPanel = new javax.swing.JScrollPane();
        listaElementosPr = new javax.swing.JList<>();
        btnCambContr = new javax.swing.JButton();
        btnEliminarCuenta = new javax.swing.JButton();
        nombre = new javax.swing.JLabel();
        apellidoP = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        apellidoM = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(new java.awt.Color(255, 196, 243));

        etiquetaPerfil.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        etiquetaPerfil.setText("Perfil");

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        foto.setBackground(new java.awt.Color(102, 255, 102));
        imagenOriginal = new ImageIcon(""+diFoto);
        Image imagenAjustada = imagenOriginal.getImage().getScaledInstance(100,100, Image.SCALE_SMOOTH);
        foto.setIcon(new ImageIcon (imagenAjustada));

        etiquetaNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etiquetaNombre.setText("Nombre:");

        etiquetaApeP.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etiquetaApeP.setText("Apellido Paterno:");

        etiquetaApeM.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etiquetaApeM.setText("Apellido Materno:");

        etiquetaUsuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etiquetaUsuario.setText("Usuario:");

        panelRecursosPrestados.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Recursos Prestados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(51, 0, 153))); // NOI18N

        listaElementosPr.setModel(new javax.swing.AbstractListModel<String>() {
			private static final long serialVersionUID = 1L;
			String[] strings = { /*"Item 1", "Item 2", "Item 3", "Item 4", "Item 5" */};
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        ScrollPanel.setViewportView(listaElementosPr);

        javax.swing.GroupLayout panelRecursosPrestadosLayout = new javax.swing.GroupLayout(panelRecursosPrestados);
        panelRecursosPrestados.setLayout(panelRecursosPrestadosLayout);
        panelRecursosPrestadosLayout.setHorizontalGroup(
            panelRecursosPrestadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRecursosPrestadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ScrollPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelRecursosPrestadosLayout.setVerticalGroup(
            panelRecursosPrestadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRecursosPrestadosLayout.createSequentialGroup()
                .addComponent(ScrollPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnCambContr.setText("Cambiar contraseña");
        btnCambContr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambContrActionPerformed(evt);
            }
        });

        btnEliminarCuenta.setText("Eliminar cuenta");
        btnEliminarCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarCuentaActionPerformed(evt);
            }
        });

        nombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nombre.setText(""+nom);

        apellidoP.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        apellidoP.setText(""+aP);

        username.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        username.setText(""+usu);

        apellidoM.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        apellidoM.setText(""+aM);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(313, 313, 313)
                        .addComponent(etiquetaPerfil))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(btnRegresar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelRecursosPrestados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(126, 126, 126)
                                .addComponent(btnCambContr)
                                .addGap(52, 52, 52)
                                .addComponent(btnEliminarCuenta))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(foto, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(etiquetaNombre)
                                        .addGap(18, 18, 18)
                                        .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(etiquetaApeP)
                                        .addGap(18, 18, 18)
                                        .addComponent(apellidoP, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(etiquetaApeM)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(etiquetaUsuario)
                                        .addGap(18, 18, 18)
                                        .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(51, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(331, Short.MAX_VALUE)
                    .addComponent(apellidoM, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(107, 107, 107)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btnRegresar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etiquetaPerfil)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaNombre)
                            .addComponent(nombre))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaApeP)
                            .addComponent(apellidoP))
                        .addGap(18, 18, 18)
                        .addComponent(etiquetaApeM)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaUsuario)
                            .addComponent(username)))
                    .addComponent(foto, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(panelRecursosPrestados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCambContr)
                    .addComponent(btnEliminarCuenta))
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(184, 184, 184)
                    .addComponent(apellidoM)
                    .addContainerGap(266, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>                        

    private void btnEliminarCuentaActionPerformed(java.awt.event.ActionEvent evt) 
    {                                                  
        int confirmar=JOptionPane.showConfirmDialog(null, "¿Desea eliminar su cuenta?","Eliminar cuenta", 
        		JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
        if (confirmar == JOptionPane.YES_OPTION) 
        {
        	ventanaPrincipal.eliminarCuenta();
        	this.setVisible(false);
        	ventanaPrincipal.regresarSalir();
        }
        else 
        {
        	//Ha anulado
        }
    	
    	
    }                                                 

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) 
    {                                            
    	this.setVisible(false);
    	ventanaPrincipal.mostrarPrincipal();
    }                                           

    private void btnCambContrActionPerformed(java.awt.event.ActionEvent evt) 
    {                                    
    	String newPassword=JOptionPane.showInputDialog("Ingrese una nueva contraseña: ");
    	
    	try
    	{
    		if(newPassword.equals(""))
        	{
        		JOptionPane.showMessageDialog(nombre, "Contraseña no válida.");
        	}
        	else
        	{
        		ventanaPrincipal.cambiarPsWrd(newPassword);
        	}
    	}
    	catch(Exception e)
    	{
    		
    	}
    	
    }       
    
    public void llenarDatos()
    {
    	nom=ventanaPrincipal.getUsuarioActual().getNombre();
    	//System.out.println(nom);
    	nombre.setText(""+nom);
    	
    	aP=ventanaPrincipal.getUsuarioActual().getApellidoP();
    	apellidoP.setText(""+aP);
    	
    	aM=ventanaPrincipal.getUsuarioActual().getApellidoM();
    	apellidoM.setText(""+aM);
    	
    	usu=ventanaPrincipal.getUsuarioActual().getCuenta();
        username.setText(""+usu);

        diFoto=ventanaPrincipal.getUsuarioActual().getDireccionFoto();
        imagenOriginal = new ImageIcon(""+diFoto);
        Image imagenAjustada = imagenOriginal.getImage().getScaledInstance(100,100, Image.SCALE_SMOOTH);
        foto.setIcon(new ImageIcon (imagenAjustada));
    }


    ///////////////////////////////////////////////////////////////////////////////////////
	public InterfazAplicacionHemeroteca getVentanaPrincipal() {
		return ventanaPrincipal;
	}

	public void setVentanaPrincipal(InterfazAplicacionHemeroteca ventanaPrincipal) {
		this.ventanaPrincipal = ventanaPrincipal;
	}

	public javax.swing.JScrollPane getScrollPanel() {
		return ScrollPanel;
	}

	public void setScrollPanel(javax.swing.JScrollPane scrollPanel) {
		ScrollPanel = scrollPanel;
	}

	public javax.swing.JLabel getApellidoM() {
		return apellidoM;
	}

	public void setApellidoM(javax.swing.JLabel apellidoM) {
		this.apellidoM = apellidoM;
	}

	public javax.swing.JLabel getApellidoP() {
		return apellidoP;
	}

	public void setApellidoP(javax.swing.JLabel apellidoP) {
		this.apellidoP = apellidoP;
	}

	public javax.swing.JLabel getFoto() {
		return foto;
	}

	public void setFoto(javax.swing.JLabel foto) {
		this.foto = foto;
	}

	public javax.swing.JList<String> getListaElementosPr() {
		return listaElementosPr;
	}

	public void setListaElementosPr(javax.swing.JList<String> listaElementosPr) {
		this.listaElementosPr = listaElementosPr;
	}

	public javax.swing.JLabel getNombre() {
		return nombre;
	}

	public void setNombre(javax.swing.JLabel nombre) {
		this.nombre = nombre;
	}

	public javax.swing.JPanel getPanelRecursosPrestados() {
		return panelRecursosPrestados;
	}

	public void setPanelRecursosPrestados(javax.swing.JPanel panelRecursosPrestados) {
		this.panelRecursosPrestados = panelRecursosPrestados;
	}

	public static String getNom() {
		return nom;
	}

	public static void setNom(String nom) {
		Perfil.nom = nom;
	}

	public static String getaP() {
		return aP;
	}

	public static void setaP(String aP) {
		Perfil.aP = aP;
	}

	public static String getaM() {
		return aM;
	}

	public static void setaM(String aM) {
		Perfil.aM = aM;
	}

	public static String getUsu() {
		return usu;
	}

	public static void setUsu(String usu) {
		Perfil.usu = usu;
	}

	public static String getDiFoto() {
		return diFoto;
	}

	public static void setDiFoto(String diFoto) {
		Perfil.diFoto = diFoto;
	}

	
}

