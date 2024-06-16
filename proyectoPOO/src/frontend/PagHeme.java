package frontend;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import backend.Hemeroteca;
import backend.RecursoDigital;
import backend.RecursoImpreso;

public class PagHeme extends javax.swing.JFrame 
{
	private static final long serialVersionUID = 1L;
	
	// Variables declaration - do not modify                     
    private javax.swing.JScrollPane ScrollPanel;
    private javax.swing.JButton btnIr;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel datoDireccion;
    private javax.swing.JLabel etiquetaDireccion;
    private javax.swing.JLabel etiquetaNombre;
    private javax.swing.JTable tablaRecursos;
    
    private static Hemeroteca heActual;
	
    private InterfazAplicacionHemeroteca ventanaPrincipal;
    
    public PagHeme(InterfazAplicacionHemeroteca ventanaPrincipal) 
    {
    	this.ventanaPrincipal = ventanaPrincipal;
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    
    public PagHeme() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
                   
    private void initComponents() 
    {

        btnRegresar = new javax.swing.JButton();
        etiquetaNombre = new javax.swing.JLabel();
        etiquetaDireccion = new javax.swing.JLabel();
        datoDireccion = new javax.swing.JLabel();
        ScrollPanel = new javax.swing.JScrollPane();
        tablaRecursos = new javax.swing.JTable();
        btnIr = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(new java.awt.Color(196, 233, 255));

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        etiquetaNombre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        etiquetaNombre.setText("(Nombre hemer)");

        etiquetaDireccion.setText("Dirección:");

        datoDireccion.setText("(dirección)");

        tablaRecursos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"titulo1", "rev", "no", "im"},
                {"titulo 2", "per", "si", "dig"}
            },
            new String [] {
                "Título", "Tipo", "Disponible", "I/D"
            }
        ) {
            
			private static final long serialVersionUID = 1L;
			@SuppressWarnings("rawtypes")
			Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class
            };

            @SuppressWarnings({ "rawtypes", "unchecked" })
			public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        ScrollPanel.setViewportView(tablaRecursos);

        btnIr.setText("Ir");
        btnIr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIrActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(btnRegresar)
                        .addGap(148, 148, 148)
                        .addComponent(etiquetaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(etiquetaDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(datoDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(ScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnIr, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(btnRegresar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(etiquetaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaDireccion)
                    .addComponent(datoDireccion))
                .addGap(28, 28, 28)
                .addComponent(ScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnIr)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) 
    {                                    
    	this.setVisible(false);
    	ventanaPrincipal.mostrarHeme();
    }                                           

    private void btnIrActionPerformed(java.awt.event.ActionEvent evt) 
    {                                      
    	int recurso=tablaRecursos.getSelectedRow();
    	if(recurso<heActual.getRecursoImpreso().size())
    	{
    		heActual.getRecursoImpreso().get(recurso).imprimirDatos();;
    	}
    	else
    	{
    		heActual.getRecursoDigital().get(recurso-heActual.getRecursoImpreso().size()).imprimirDatos();
    		int confirmar=JOptionPane.showConfirmDialog(null, "¿Desea visualizar el elemento?","Recurso Digital", 
            		JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
            if (confirmar == JOptionPane.YES_OPTION) 
    		{
    			try 
    			{
    			     File path = new File (heActual.getRecursoDigital().get(recurso-heActual.getRecursoImpreso().size()).getTexto());
    			     Desktop.getDesktop().open(path);
    			}
    			catch (IOException ex) 
    			{
    			     ex.printStackTrace();
    			}
    		}
            else 
            {
            	//Ha anulado
            }
    	}
    } 
    
    public void llenarDatos(Hemeroteca hemeroteca)
    {
    	heActual=hemeroteca;
    	String nombre=""+heActual.getNombre();
    	String direc=""+heActual.getDireccion();
    	
    	etiquetaNombre.setText(""+nombre);
    	datoDireccion.setText(""+direc);
    	
    	
    	int totFilas=heActual.getRecursoImpreso().size()+heActual.getRecursoDigital().size();
    	DefaultTableModel modeloDefault = new DefaultTableModel(new String[] {"Titulo","Tipo","Disponible","I/D"},totFilas);
    	tablaRecursos.setModel(modeloDefault);
    	
    	TableModel modeloDatos = tablaRecursos.getModel();
    	try
    	{
    		for(int i=0;i<heActual.getRecursoImpreso().size();++i)
        	{
        		RecursoImpreso recurso = heActual.getRecursoImpreso().get(i);
        		
        		String disp="";
        		if(recurso.getDisponible()==true)
        		{
        			disp="Si";
        		}
        		else
        		{
        			disp="No";
        		}
        		
        		modeloDatos.setValueAt(recurso.getTitulo(), i, 0);
        		modeloDatos.setValueAt(recurso.getTipo(), i, 1);
        		modeloDatos.setValueAt(disp, i, 2);
        		modeloDatos.setValueAt("Impreso", i, 3);
        	}
    		
    		int x=heActual.getRecursoImpreso().size();
    		for(int i=x, y=0;y<heActual.getRecursoDigital().size();++i,++y)
        	{
    			RecursoDigital recurso = heActual.getRecursoDigital().get(y);
        		
        		modeloDatos.setValueAt(recurso.getTitulo(), i, 0);
        		modeloDatos.setValueAt(recurso.getTipo(), i, 1);
        		modeloDatos.setValueAt("Si", i, 2);
        		modeloDatos.setValueAt("Digital", i, 3);
        	}
    	}
    	catch(Exception e)
    	{
    		
    	}	
    }
                     
}
