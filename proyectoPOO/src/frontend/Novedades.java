package frontend;

import java.awt.Desktop;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.swing.ImageIcon;

public class Novedades extends javax.swing.JFrame 
{
	private static final long serialVersionUID = 1L;
	
	// Variables declaration - do not modify                     
    private javax.swing.JButton btnNovedad1;
    private javax.swing.JButton btnNovedad2;
    private javax.swing.JButton btnNovedad3;
    private javax.swing.JButton btnNovedad4;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel etiquetaNovedades;

    private InterfazAplicacionHemeroteca ventanaPrincipal;
    
    public Novedades(InterfazAplicacionHemeroteca ventanaPrincipal) 
    {
    	this.ventanaPrincipal = ventanaPrincipal;
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public Novedades() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
               
    private void initComponents() {

        etiquetaNovedades = new javax.swing.JLabel();
        btnNovedad1 = new javax.swing.JButton();
        btnNovedad2 = new javax.swing.JButton();
        btnNovedad3 = new javax.swing.JButton();
        btnNovedad4 = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(new java.awt.Color(204, 204, 0));

        etiquetaNovedades.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        etiquetaNovedades.setText("Novedades");

        btnNovedad1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovedad1ActionPerformed(evt);
            }
        });

        ImageIcon imagenOriginal2 = new ImageIcon("imagenes/novNational.png");
        Image imagenAjustada2 = imagenOriginal2.getImage().getScaledInstance(120,190, Image.SCALE_SMOOTH);
        btnNovedad2.setIcon(new ImageIcon (imagenAjustada2));
        btnNovedad2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovedad2ActionPerformed(evt);
            }
        });

        ImageIcon imagenOriginal3 = new ImageIcon("imagenes/saberMas.png");
        Image imagenAjustada3 = imagenOriginal3.getImage().getScaledInstance(120,190, Image.SCALE_SMOOTH);
        btnNovedad3.setIcon(new ImageIcon (imagenAjustada3));
        btnNovedad3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovedad3ActionPerformed(evt);
            }
        });

        ImageIcon imagenOriginal4 = new ImageIcon("imagenes/diaMe.png");
        Image imagenAjustada4 = imagenOriginal4.getImage().getScaledInstance(120,190, Image.SCALE_SMOOTH);
        btnNovedad1.setIcon(new ImageIcon (imagenAjustada4));
        
        
        ImageIcon imagenOriginal5 = new ImageIcon("imagenes/gaceta.png");
        Image imagenAjustada5 = imagenOriginal5.getImage().getScaledInstance(120,190, Image.SCALE_SMOOTH);
        btnNovedad4.setIcon(new ImageIcon (imagenAjustada5));
        btnNovedad4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovedad4ActionPerformed(evt);
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addComponent(btnNovedad1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnNovedad2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnNovedad3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnNovedad4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(282, 282, 282)
                        .addComponent(etiquetaNovedades))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btnRegresar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btnRegresar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etiquetaNovedades)
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovedad1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNovedad2, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNovedad3, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNovedad4, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(121, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void btnNovedad4ActionPerformed(java.awt.event.ActionEvent evt) 
    {
    	try 
		{
		     File path = new File ("pdf/gacetaUNAM.pdf");
		     Desktop.getDesktop().open(path);
		}
		catch (IOException ex) 
		{
		     ex.printStackTrace();
		}
    }                                           

    private void btnNovedad1ActionPerformed(java.awt.event.ActionEvent evt) 
    {
    	try 
		{
		     File path = new File ("pdf/diarioMex.pdf");
		     Desktop.getDesktop().open(path);
		}
		catch (IOException ex) 
		{
		     ex.printStackTrace();
		}
    }                                           

    private void btnNovedad2ActionPerformed(java.awt.event.ActionEvent evt) 
    {                                            
    	try 
		{
		     File path = new File ("pdf/NGH.pdf");
		     Desktop.getDesktop().open(path);
		}
		catch (IOException ex) 
		{
		     ex.printStackTrace();
		}
    }                                           

    private void btnNovedad3ActionPerformed(java.awt.event.ActionEvent evt) 
    {
    	try 
		{
		     File path = new File ("pdf/No_64.pdf");
		     Desktop.getDesktop().open(path);
		}
		catch (IOException ex) 
		{
		     ex.printStackTrace();
		}
    }                                           

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) 
    {             
    	this.setVisible(false);
    	ventanaPrincipal.mostrarPrincipal();
    }                                           


	public InterfazAplicacionHemeroteca getVentanaPrincipal() {
		return ventanaPrincipal;
	}

	public void setVentanaPrincipal(InterfazAplicacionHemeroteca ventanaPrincipal) {
		this.ventanaPrincipal = ventanaPrincipal;
	}
           
}

