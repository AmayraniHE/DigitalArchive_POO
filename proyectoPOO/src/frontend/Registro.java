package frontend;

import javax.swing.JOptionPane;

import backend.Usuario;

public class Registro extends javax.swing.JFrame
{
	private static final long serialVersionUID = 1L;
	// Variables declaration - do not modify                     
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JTextField campoApeM;
    private javax.swing.JTextField campoApeP;
    private javax.swing.JTextField campoContrase;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JTextField campoUsuario;
    private javax.swing.JCheckBox checkTerminos;
    private javax.swing.JLabel etiquetaApeM;
    private javax.swing.JLabel etiquetaApeP;
    private javax.swing.JLabel etiquetaContrase;
    private javax.swing.JLabel etiquetaNombre;
    private javax.swing.JLabel etiquetaRegistro;
    private javax.swing.JLabel etiquetaUsuario;

    private InterfazAplicacionHemeroteca ventanaPrincipal;
    
    
    public Registro(InterfazAplicacionHemeroteca ventanaPrincipal) 
    {
    	this.ventanaPrincipal = ventanaPrincipal;
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public Registro() 
    {
        initComponents();
        this.setLocationRelativeTo(null);
    }
                           
    private void initComponents() {

        etiquetaRegistro = new javax.swing.JLabel();
        etiquetaNombre = new javax.swing.JLabel();
        etiquetaUsuario = new javax.swing.JLabel();
        etiquetaContrase = new javax.swing.JLabel();
        etiquetaApeP = new javax.swing.JLabel();
        etiquetaApeM = new javax.swing.JLabel();
        campoNombre = new javax.swing.JTextField();
        campoApeP = new javax.swing.JTextField();
        campoApeM = new javax.swing.JTextField();
        campoUsuario = new javax.swing.JTextField();
        campoContrase = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        checkTerminos = new javax.swing.JCheckBox();
        btnRegresar = new javax.swing.JButton();


        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(new java.awt.Color(161, 255, 209));

        etiquetaRegistro.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        etiquetaRegistro.setText("Registro");

        etiquetaNombre.setText("Nombre:");

        etiquetaUsuario.setText("Usuario:");

        etiquetaContrase.setText("Cotraseña:");

        etiquetaApeP.setText("Apellido Paterno:");

        etiquetaApeM.setText("Apellido Materno:");
        
        

        btnRegistrar.setEnabled(true);
        btnRegistrar.setBackground(new java.awt.Color(153, 153, 153));
        btnRegistrar.setForeground(new java.awt.Color(102, 102, 102));
        btnRegistrar.setText("Registrar");
        

        checkTerminos.setText("Acepto Términos y Condiciones");
        checkTerminos.setBackground(new java.awt.Color(161, 255, 209));
        checkTerminos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkTerminosActionPerformed(evt);
            }
        });

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btnRegresar)
                        .addGap(178, 178, 178)
                        .addComponent(etiquetaRegistro))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(299, 299, 299)
                        .addComponent(btnRegistrar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(etiquetaNombre)
                                    .addComponent(etiquetaApeP))
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(campoNombre)
                                    .addComponent(campoApeP, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(etiquetaApeM)
                                    .addComponent(etiquetaUsuario)
                                    .addComponent(etiquetaContrase))
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(campoApeM)
                                    .addComponent(campoUsuario)
                                    .addComponent(campoContrase, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(checkTerminos)))))
                .addContainerGap(206, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(etiquetaRegistro))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(btnRegresar)))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaNombre)
                    .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaApeP)
                    .addComponent(campoApeP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaApeM)
                    .addComponent(campoApeM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaUsuario)
                    .addComponent(campoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaContrase)
                    .addComponent(campoContrase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(checkTerminos)
                .addGap(24, 24, 24)
                .addComponent(btnRegistrar)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        pack();
    }                        

    
	private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) 
    {
    	String nombre=campoNombre.getText();
    	String apellidoP=campoApeP.getText();
    	String apellidoM=campoApeM.getText();
    	String usuario=campoUsuario.getText();
    	String password=campoContrase.getText();
    	boolean ok=false;
    	
    	if(nombre.equals("") || apellidoP.equals("") || apellidoM.equals("") || usuario.equals("") || password.equals(""))
    	{
    		JOptionPane.showMessageDialog(null, "Ingrese todos los campos.");
    	}
    	else
    	{
    		if(nombre.matches(".*[0-9].*") || apellidoP.matches(".*[0-9].*") || apellidoM.matches(".*[0-9].*"))
    		{
    			JOptionPane.showMessageDialog(null, "El nombre y los apellidos no pueden contener números.");
    		}
    		else
    		{
    			for(int i=0;i<InterfazAplicacionHemeroteca.getUsuarios().size();++i)
    			{
    				if(InterfazAplicacionHemeroteca.getUsuarios().get(i).getCuenta().equals(usuario) || 
    						usuario.toLowerCase().contains("admin"))
    				{
    					JOptionPane.showMessageDialog(null, "El usuario ya existe.");
    					break;
    				}
    				else
    				{
    					ok=true;
    				}
    			}
    			
    			if(ok==true)
    			{
    				Usuario temp = new Usuario(nombre, apellidoP, apellidoM, usuario, password);
    				ventanaPrincipal.crearCuenta(temp);
    				this.setVisible(false);
    				ventanaPrincipal.regresarSalir();
    			}
    			
    		}
    		
    	}
  
    	
    }                                            

    private void checkTerminosActionPerformed(java.awt.event.ActionEvent evt) 
    {                                              
        if(checkTerminos.isSelected())
        {
        	btnRegistrar.setEnabled(true);
        	btnRegistrar.setBackground(new java.awt.Color(234, 255, 81));
            btnRegistrar.setForeground(new java.awt.Color(0, 0, 0));
            btnRegistrar.setText("Registrar");
            btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnRegistrarActionPerformed(evt);
                }
            });
        }
        else
        {
        	btnRegistrar.setBackground(new java.awt.Color(153, 153, 153));
            btnRegistrar.setForeground(new java.awt.Color(0, 0, 0));
            btnRegistrar.setText("Registrar");
            btnRegistrar.setEnabled(false);
        }
    }                                             

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) 
    {                                            
    	this.setVisible(false);
    	ventanaPrincipal.regresarSalir();
    }

    ///////////////////////////////////////////////////////////////////////////////////////////
	public javax.swing.JTextField getCampoApeM() {
		return campoApeM;
	}

	public void setCampoApeM(javax.swing.JTextField campoApeM) {
		this.campoApeM = campoApeM;
	}

	public javax.swing.JTextField getCampoApeP() {
		return campoApeP;
	}

	public void setCampoApeP(javax.swing.JTextField campoApeP) {
		this.campoApeP = campoApeP;
	}

	public javax.swing.JTextField getCampoContrase() {
		return campoContrase;
	}

	public void setCampoContrase(javax.swing.JTextField campoContrase) {
		this.campoContrase = campoContrase;
	}

	public javax.swing.JTextField getCampoNombre() {
		return campoNombre;
	}

	public void setCampoNombre(javax.swing.JTextField campoNombre) {
		this.campoNombre = campoNombre;
	}

	public javax.swing.JTextField getCampoUsuario() {
		return campoUsuario;
	}

	public void setCampoUsuario(javax.swing.JTextField campoUsuario) {
		this.campoUsuario = campoUsuario;
	}

	public javax.swing.JCheckBox getCheckTerminos() {
		return checkTerminos;
	}

	public void setCheckTerminos(javax.swing.JCheckBox checkTerminos) {
		this.checkTerminos = checkTerminos;
	}

	public InterfazAplicacionHemeroteca getVentanaPrincipal() {
		return ventanaPrincipal;
	}

	public void setVentanaPrincipal(InterfazAplicacionHemeroteca ventanaPrincipal) {
		this.ventanaPrincipal = ventanaPrincipal;
	}  

}
