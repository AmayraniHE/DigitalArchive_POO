package frontend;

import java.awt.Image;

import javax.swing.ImageIcon;

public class PaginaPrincipal extends javax.swing.JFrame
{
	private static final long serialVersionUID = 1L;
	// Variables declaration - do not modify                     
    private javax.swing.JButton btnBusqueda;
    private javax.swing.JButton btnHemerotecas;
    private javax.swing.JButton btnNovedades;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel etiquetaBusqueda;
    private javax.swing.JLabel etiquetaHemerotecaDigi;
    private javax.swing.JLabel etiquetaHemerotecas;
    private javax.swing.JLabel etiquetaNovedades;
    private javax.swing.JButton btnPerfil;
    
    private InterfazAplicacionHemeroteca ventanaPrincipal;

    
    public PaginaPrincipal(InterfazAplicacionHemeroteca ventanaPrincipal) 
    {
    	this.ventanaPrincipal = ventanaPrincipal;
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public PaginaPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

                     
    private void initComponents() {

        btnBusqueda = new javax.swing.JButton();
        btnHemerotecas = new javax.swing.JButton();
        btnNovedades = new javax.swing.JButton();
        etiquetaHemerotecaDigi = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        btnPerfil = new javax.swing.JButton();
        etiquetaBusqueda = new javax.swing.JLabel();
        etiquetaHemerotecas = new javax.swing.JLabel();
        etiquetaNovedades = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(new java.awt.Color(255, 232, 161 ));


        btnBusqueda.setBackground(new java.awt.Color(153, 0, 76));
        ImageIcon imagenOriginal = new ImageIcon("imagenes/busqueda.png");
        Image imagenAjustada = imagenOriginal.getImage().getScaledInstance(120,120, Image.SCALE_SMOOTH);
        btnBusqueda.setIcon(new ImageIcon (imagenAjustada));
        btnBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBusquedaActionPerformed(evt);
            }
        });

        btnHemerotecas.setBackground(new java.awt.Color(204, 204, 255));
        ImageIcon imagenOriginal2 = new ImageIcon("imagenes/hemeroteca.png");
        Image imagenAjustada2 = imagenOriginal2.getImage().getScaledInstance(120,120, Image.SCALE_SMOOTH);
        btnHemerotecas.setIcon(new ImageIcon (imagenAjustada2));
        btnHemerotecas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHemerotecasActionPerformed(evt);
            }
        });

        btnNovedades.setBackground(new java.awt.Color(0, 153, 153));
        btnHemerotecas.setBackground(new java.awt.Color(204, 204, 255));
        ImageIcon imagenOriginal3 = new ImageIcon("imagenes/novedades.png");
        Image imagenAjustada3 = imagenOriginal3.getImage().getScaledInstance(120,110, Image.SCALE_SMOOTH);
        btnNovedades.setIcon(new ImageIcon (imagenAjustada3));
        btnNovedades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovedadesActionPerformed(evt);
            }
        });

        etiquetaHemerotecaDigi.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        etiquetaHemerotecaDigi.setText("Hemeroteca Digital");

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnPerfil.setBackground(new java.awt.Color(153, 255, 204));
        ImageIcon imagenOriginal4 = new ImageIcon("imagenes/perfil.png");
        Image imagenAjustada4 = imagenOriginal4.getImage().getScaledInstance(50,50, Image.SCALE_SMOOTH);
        btnPerfil.setIcon(new ImageIcon (imagenAjustada4));
        btnPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerfilActionPerformed(evt);
            }
        });

        etiquetaBusqueda.setText("Búsqueda Básica");

        etiquetaHemerotecas.setText("Hemerotecas");

        etiquetaNovedades.setText("Novedades");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(btnBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(btnHemerotecas, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(btnNovedades, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(etiquetaBusqueda)
                .addGap(109, 109, 109)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSalir)
                        .addContainerGap(309, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etiquetaHemerotecas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(etiquetaNovedades)
                        .addGap(118, 118, 118))))
            .addGroup(layout.createSequentialGroup()
                .addGap(239, 239, 239)
                .addComponent(etiquetaHemerotecaDigi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 162, Short.MAX_VALUE)
                .addComponent(btnPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(etiquetaHemerotecaDigi))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHemerotecas, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNovedades, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaBusqueda)
                    .addComponent(etiquetaHemerotecas)
                    .addComponent(etiquetaNovedades))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(btnSalir)
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>                        

    private void btnBusquedaActionPerformed(java.awt.event.ActionEvent evt) 
    {                              
    	this.setVisible(false);
    	ventanaPrincipal.mostrarBusqueda();
    }                                           

    private void btnHemerotecasActionPerformed(java.awt.event.ActionEvent evt) 
    {                                    
    	this.setVisible(false);
    	ventanaPrincipal.mostrarHeme();
    }                                              

    private void btnNovedadesActionPerformed(java.awt.event.ActionEvent evt) 
    {                                             
    	this.setVisible(false);
    	ventanaPrincipal.mostrarNovedades();
    }                                            

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) 
    {                                         
    	this.setVisible(false);
    	ventanaPrincipal.regresarSalir();
    }                                        

    private void btnPerfilActionPerformed(java.awt.event.ActionEvent evt) 
    {                                               
    	this.setVisible(false);
    	ventanaPrincipal.mostrarPerfil();
    }
    

    ///////////////////////////////////////////////////////////////////////////////////////////////////
	public InterfazAplicacionHemeroteca getVentanaPrincipal() {
		return ventanaPrincipal;
	}

	public void setVentanaPrincipal(InterfazAplicacionHemeroteca ventanaPrincipal) {
		this.ventanaPrincipal = ventanaPrincipal;
	}                                              

}

