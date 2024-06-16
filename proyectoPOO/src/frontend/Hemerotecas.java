package frontend;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Hemerotecas extends javax.swing.JFrame
{
	private static final long serialVersionUID = 1L;
	// Variables declaration - do not modify                     
    private javax.swing.JButton btnBiMex;
    private javax.swing.JButton btnHNDM;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnUAEM;
    private javax.swing.JButton btnUNAM;
    private javax.swing.JLabel etiquetaBiMex;
    private javax.swing.JLabel etiquetaHNDM;
    private javax.swing.JLabel etiquetaHemerotecas;
    private javax.swing.JLabel etiquetaUAEM;
    private javax.swing.JLabel etiquetaUNAM;

    private InterfazAplicacionHemeroteca ventanaPrincipal;
    
    public Hemerotecas(InterfazAplicacionHemeroteca ventanaPrincipal) 
    {
    	this.ventanaPrincipal = ventanaPrincipal;
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public Hemerotecas() 
    {
        initComponents();
        this.setLocationRelativeTo(null);
    }
                        
    private void initComponents() {

        etiquetaHemerotecas = new javax.swing.JLabel();
        btnHNDM = new javax.swing.JButton();
        btnUAEM = new javax.swing.JButton();
        btnBiMex = new javax.swing.JButton();
        btnUNAM = new javax.swing.JButton();
        etiquetaHNDM = new javax.swing.JLabel();
        etiquetaBiMex = new javax.swing.JLabel();
        etiquetaUAEM = new javax.swing.JLabel();
        etiquetaUNAM = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(new java.awt.Color(102, 204, 0));

        etiquetaHemerotecas.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        etiquetaHemerotecas.setText("Hemerotecas");

        ImageIcon imagenOriginal = new ImageIcon("imagenes/hndm.png");
        Image imagenAjustada = imagenOriginal.getImage().getScaledInstance(150,100, Image.SCALE_SMOOTH);
        btnHNDM.setIcon(new ImageIcon (imagenAjustada));
        btnHNDM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHNDMActionPerformed(evt);
            }
        });

        
        ImageIcon imagenOriginal2 = new ImageIcon("imagenes/uaem.png");
        Image imagenAjustada2 = imagenOriginal2.getImage().getScaledInstance(150,100, Image.SCALE_SMOOTH);
        btnUAEM.setIcon(new ImageIcon (imagenAjustada2));
        btnUAEM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUAEMActionPerformed(evt);
            }
        });

        
        ImageIcon imagenOriginal3 = new ImageIcon("imagenes/bimex.png");
        Image imagenAjustada3 = imagenOriginal3.getImage().getScaledInstance(150,100, Image.SCALE_SMOOTH);
        btnBiMex.setIcon(new ImageIcon (imagenAjustada3));
        btnBiMex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBiMexActionPerformed(evt);
            }
        });

        
        ImageIcon imagenOriginal4 = new ImageIcon("imagenes/unam.png");
        Image imagenAjustada4 = imagenOriginal4.getImage().getScaledInstance(150,100, Image.SCALE_SMOOTH);
        btnUNAM.setIcon(new ImageIcon (imagenAjustada4));
        btnUNAM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUNAMActionPerformed(evt);
            }
        });

        etiquetaHNDM.setText("HNDM");

        etiquetaBiMex.setText("Biblioteca de México");

        etiquetaUAEM.setText("UAEM");

        etiquetaUNAM.setText("UNAM");

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
                .addGap(181, 181, 181)
                .addComponent(etiquetaHNDM)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(etiquetaBiMex)
                .addGap(146, 146, 146))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(btnRegresar)
                        .addGap(172, 172, 172)
                        .addComponent(etiquetaHemerotecas))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnUAEM, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnHNDM, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(118, 118, 118)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnUNAM, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBiMex, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(120, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addComponent(etiquetaUAEM)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(etiquetaUNAM)
                .addGap(176, 176, 176))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(etiquetaHemerotecas))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btnRegresar)))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnHNDM, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBiMex, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiquetaBiMex)
                    .addComponent(etiquetaHNDM))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUAEM, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUNAM, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiquetaUAEM)
                    .addComponent(etiquetaUNAM))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) 
    {                               
    	this.setVisible(false);
    	ventanaPrincipal.mostrarPrincipal();
    }                                           

    private void btnHNDMActionPerformed(java.awt.event.ActionEvent evt) 
    {            
    	this.setVisible(false);
    	ventanaPrincipal.mostrarPagHeme(1);
    }                                       

    private void btnBiMexActionPerformed(java.awt.event.ActionEvent evt) 
    {                                         
    	this.setVisible(false);
    	ventanaPrincipal.mostrarPagHeme(2);
    }                                        

    private void btnUAEMActionPerformed(java.awt.event.ActionEvent evt) 
    {                                        
    	this.setVisible(false);
    	ventanaPrincipal.mostrarPagHeme(3);
    }                                       

    private void btnUNAMActionPerformed(java.awt.event.ActionEvent evt) 
    {                                        
    	this.setVisible(false);
    	ventanaPrincipal.mostrarPagHeme(4);
    }                                       


	public InterfazAplicacionHemeroteca getVentanaPrincipal() {
		return ventanaPrincipal;
	}

	public void setVentanaPrincipal(InterfazAplicacionHemeroteca ventanaPrincipal) {
		this.ventanaPrincipal = ventanaPrincipal;
	}
}

