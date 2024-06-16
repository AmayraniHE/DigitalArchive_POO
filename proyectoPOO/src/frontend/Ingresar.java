package frontend;

import javax.swing.JOptionPane;

public class Ingresar extends javax.swing.JFrame
{
	private static final long serialVersionUID = 1L;
	
	// Variables declaration - do not modify                     
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnRegistro;
    private javax.swing.JPasswordField campoContrase;
    private javax.swing.JTextField campoUsuario;
    private javax.swing.JLabel etiquetaContrase;
    private javax.swing.JLabel etiquetaHemeroteca;
    private javax.swing.JLabel etiquetaUsuario;

    private InterfazAplicacionHemeroteca ventanaPrincipal;
    
    public Ingresar(InterfazAplicacionHemeroteca ventanaPrincipal) 
    {
    	this.ventanaPrincipal = ventanaPrincipal;
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public Ingresar() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
                              
    private void initComponents() {

        campoContrase = new javax.swing.JPasswordField();
        campoUsuario = new javax.swing.JTextField();
        etiquetaHemeroteca = new javax.swing.JLabel();
        btnIngresar = new javax.swing.JButton();
        etiquetaUsuario = new javax.swing.JLabel();
        etiquetaContrase = new javax.swing.JLabel();
        btnRegistro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(new java.awt.Color(229, 222, 185));
        

        etiquetaHemeroteca.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        etiquetaHemeroteca.setText("Hemeroteca Digital");

        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        etiquetaUsuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etiquetaUsuario.setText("Usuario:");

        etiquetaContrase.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etiquetaContrase.setText("Contraseña:");

        btnRegistro.setText("Registrarse");
        btnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiquetaHemeroteca)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(etiquetaUsuario)
                                    .addComponent(etiquetaContrase))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoContrase)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(campoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(283, 283, 283)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnIngresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(228, 228, 228))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(etiquetaHemeroteca)
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaUsuario))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaContrase)
                    .addComponent(campoContrase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addComponent(btnIngresar)
                .addGap(18, 18, 18)
                .addComponent(btnRegistro)
                .addContainerGap(121, Short.MAX_VALUE))
        );

        pack();
    }                        

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) 
    {                                            
    	String usuario = campoUsuario.getText();
		String password = new String(campoContrase.getPassword());
		//System.out.println(password);
		try
		{
			if(ventanaPrincipal.inicioSesion(usuario,password))
	    	{
	    		this.setVisible(false);
	    		ventanaPrincipal.mostrarPrincipal();
	    	}
			else
			{
				JOptionPane.showMessageDialog(null,"Contraseña o Usuario incorrecto");
			}
		}
    	catch(Exception e)
		{
    		JOptionPane.showMessageDialog(null, "Error al ingresar");
		}
    }                                           

    private void btnRegistroActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    	this.setVisible(false);
    	ventanaPrincipal.mostrarRegistrarse();
    }                                           

    ///////////////////////////////////////////////////////////////////////////////////////////////////
	

	public javax.swing.JPasswordField getCampoContrase() {
		return campoContrase;
	}

	public void setCampoContrase(javax.swing.JPasswordField campoContrase) {
		this.campoContrase = campoContrase;
	}

	public javax.swing.JTextField getCampoUsuario() {
		return campoUsuario;
	}

	public void setCampoUsuario(javax.swing.JTextField campoUsuario) {
		this.campoUsuario = campoUsuario;
	}

	public InterfazAplicacionHemeroteca getVentanaPrincipal() {
		return ventanaPrincipal;
	}

	public void setVentanaPrincipal(InterfazAplicacionHemeroteca ventanaPrincipal) {
		this.ventanaPrincipal = ventanaPrincipal;
	}                                             
    
}
