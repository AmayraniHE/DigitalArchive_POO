package frontend;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import backend.RecursoDigital;
import backend.RecursoImpreso;

public class Busqueda extends javax.swing.JFrame 
{

	private static final long serialVersionUID = 1L;
	
	// Variables declaration - do not modify                     
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnIr;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JTextField campoBusqueda;
    private javax.swing.JLabel etiquetaHemeroteca;
    private javax.swing.JRadioButton jrbAutor;
    private javax.swing.JRadioButton jrbTema;
    private javax.swing.JRadioButton jrbTitulo;
    private javax.swing.JPanel panelBusqueda;
    private javax.swing.JPanel panelResultados;
    private javax.swing.JScrollPane scrollPanelResult;
    private javax.swing.JTable tablaResultados;
    
    private static List<RecursoDigital> resultadoBusquedaDig;
    private static List<RecursoImpreso> resultadoBusquedaImp;

    private InterfazAplicacionHemeroteca ventanaPrincipal;
    
    
    public Busqueda(InterfazAplicacionHemeroteca ventanaPrincipal) 
    {
    	this.ventanaPrincipal = ventanaPrincipal;
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public Busqueda() 
    {
        initComponents();
        this.setLocationRelativeTo(null);
    }
                        
    private void initComponents() {

        etiquetaHemeroteca = new javax.swing.JLabel();
        panelBusqueda = new javax.swing.JPanel();
        jrbTitulo = new javax.swing.JRadioButton();
        jrbAutor = new javax.swing.JRadioButton();
        jrbTema = new javax.swing.JRadioButton();
        campoBusqueda = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        panelResultados = new javax.swing.JPanel();
        scrollPanelResult = new javax.swing.JScrollPane();
        tablaResultados = new javax.swing.JTable();
        btnIr = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(new java.awt.Color(237, 187, 255));

        etiquetaHemeroteca.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        etiquetaHemeroteca.setText("Busqueda");

        panelBusqueda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jrbTitulo.setText("Título");
        jrbTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbTituloActionPerformed(evt);
            }
        });

        jrbAutor.setText("Autor");
        jrbAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbAutorActionPerformed(evt);
            }
        });

        jrbTema.setText("Tema");
        jrbTema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbTemaActionPerformed(evt);
            }
        });

        btnBuscar.setBackground(new java.awt.Color(255, 255, 153));
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBusquedaLayout = new javax.swing.GroupLayout(panelBusqueda);
        panelBusqueda.setLayout(panelBusquedaLayout);
        panelBusquedaLayout.setHorizontalGroup(
            panelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBusquedaLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jrbTitulo)
                .addGap(18, 18, 18)
                .addComponent(jrbAutor)
                .addGap(18, 18, 18)
                .addComponent(jrbTema)
                .addGap(43, 43, 43)
                .addComponent(campoBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBuscar)
                .addGap(23, 23, 23))
        );
        panelBusquedaLayout.setVerticalGroup(
            panelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBusquedaLayout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(panelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbTitulo)
                    .addComponent(jrbAutor)
                    .addComponent(jrbTema)
                    .addComponent(campoBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(29, 29, 29))
        );

        panelResultados.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(153, 153, 153)), "Resultados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        tablaResultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] { },
            new String [] {
                "Título", "Tipo", "Hemroteca", "I/D"
            }
        ) {
      
			private static final long serialVersionUID = 1L;
			@SuppressWarnings("rawtypes")
			Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            @SuppressWarnings({ "unchecked", "rawtypes" })
			public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        scrollPanelResult.setViewportView(tablaResultados);

        btnIr.setText("Ir");
        btnIr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIrActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelResultadosLayout = new javax.swing.GroupLayout(panelResultados);
        panelResultados.setLayout(panelResultadosLayout);
        panelResultadosLayout.setHorizontalGroup(
            panelResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelResultadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPanelResult, javax.swing.GroupLayout.DEFAULT_SIZE, 597, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelResultadosLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnIr, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelResultadosLayout.setVerticalGroup(
            panelResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelResultadosLayout.createSequentialGroup()
                .addComponent(scrollPanelResult, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnIr)
                .addGap(0, 11, Short.MAX_VALUE))
        );

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelResultados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(21, 21, 21)
                            .addComponent(btnRegresar)
                            .addGap(187, 187, 187)
                            .addComponent(etiquetaHemeroteca))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(34, 34, 34)
                            .addComponent(panelBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(etiquetaHemeroteca))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnRegresar)))
                .addGap(18, 18, 18)
                .addComponent(panelBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelResultados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void jrbTituloActionPerformed(java.awt.event.ActionEvent evt) 
    {                                          
        jrbAutor.setSelected(false);
        jrbTema.setSelected(false);
    }                                         

    private void jrbAutorActionPerformed(java.awt.event.ActionEvent evt) 
    {                                         
    	jrbTema.setSelected(false);
    	jrbTitulo.setSelected(false);
    }                                        

    private void jrbTemaActionPerformed(java.awt.event.ActionEvent evt) 
    {                        
    	jrbAutor.setSelected(false);
    	jrbTitulo.setSelected(false);
    } 
    
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) 
    {                                          
        String elementoBuscar=""+campoBusqueda.getText();
        
        
        if(elementoBuscar.equals(""))
        {
        	JOptionPane.showMessageDialog(null, "Ingrese la palabra o texto a buscar");
        }
        else
        {
        	if(jrbAutor.isSelected())
            {
        		buscarAutor(elementoBuscar);
            }
            else
            {
            	if(jrbTema.isSelected())
            	{
            		buscarTema(elementoBuscar);
            	}
            	else
            	{
            		if(jrbTitulo.isSelected())
            		{
            			buscarTitulo(elementoBuscar);
            		}
            		else
            		{
            			JOptionPane.showMessageDialog(null, "Seleccione un campo");
            		}
            	}
            }
        	llenarTablaRe();
        }
        
    }                                                                           

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) 
    {        
    	this.setVisible(false);
    	ventanaPrincipal.mostrarPrincipal();
    }                                           

    private void btnIrActionPerformed(java.awt.event.ActionEvent evt) 
    {                                     
    	int recurso=tablaResultados.getSelectedRow();
    	if(recurso<resultadoBusquedaImp.size())
    	{
    		resultadoBusquedaImp.get(recurso).imprimirDatos();;
    	}
    	else
    	{
    		resultadoBusquedaDig.get(recurso-resultadoBusquedaImp.size()).imprimirDatos();
    		int confirmar=JOptionPane.showConfirmDialog(null, "¿Desea visualizar el elemento?","Recurso Digital", 
            		JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
            if (confirmar == JOptionPane.YES_OPTION) 
    		{
    			try 
    			{
    			     File path = new File (resultadoBusquedaDig.get(recurso-resultadoBusquedaImp.size()).getTexto());
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


    private void buscarAutor(String elementoBuscar)
    {
    	resultadoBusquedaDig = new ArrayList<RecursoDigital>(); 
    	resultadoBusquedaImp = new ArrayList<RecursoImpreso>();
    	
    	for(int i=0;i<InterfazAplicacionHemeroteca.getHemerotecasDatos().size();++i)
    	{
    		for(int x=0;x<InterfazAplicacionHemeroteca.getHemerotecasDatos().get(i).getRecursoImpreso().size();++x)
    		{
    			if(InterfazAplicacionHemeroteca.getHemerotecasDatos().get(i).getRecursoImpreso().get(x).getAutor().toLowerCase().contains(elementoBuscar.toLowerCase()))
    			{
    				RecursoImpreso tmp = InterfazAplicacionHemeroteca.getHemerotecasDatos().get(i).getRecursoImpreso().get(x);
    				resultadoBusquedaImp.add(tmp);
    			}
    		}
    	}
    	for(int i=0;i<InterfazAplicacionHemeroteca.getHemerotecasDatos().size();++i)
    	{
    		for(int x=0;x<InterfazAplicacionHemeroteca.getHemerotecasDatos().get(i).getRecursoDigital().size();++x)
    		{
    			if(InterfazAplicacionHemeroteca.getHemerotecasDatos().get(i).getRecursoDigital().get(x).getAutor().toLowerCase().contains(elementoBuscar.toLowerCase()))
    			{
    				RecursoDigital tmp = InterfazAplicacionHemeroteca.getHemerotecasDatos().get(i).getRecursoDigital().get(x);
    				resultadoBusquedaDig.add(tmp);
    			}
    		}
    	}
    }
    
    private void buscarTema(String elementoBuscar)
    {
    	resultadoBusquedaDig = new ArrayList<RecursoDigital>(); 
    	resultadoBusquedaImp = new ArrayList<RecursoImpreso>();
    	
    	for(int i=0;i<InterfazAplicacionHemeroteca.getHemerotecasDatos().size();++i)
    	{
    		for(int x=0;x<InterfazAplicacionHemeroteca.getHemerotecasDatos().get(i).getRecursoImpreso().size();++x)
    		{
    			if(InterfazAplicacionHemeroteca.getHemerotecasDatos().get(i).getRecursoImpreso().get(x).getTema().toLowerCase().contains(elementoBuscar.toLowerCase()))
    			{
    				RecursoImpreso tmp = InterfazAplicacionHemeroteca.getHemerotecasDatos().get(i).getRecursoImpreso().get(x);
    				resultadoBusquedaImp.add(tmp);
    			}
    		}
    	}
    	for(int i=0;i<InterfazAplicacionHemeroteca.getHemerotecasDatos().size();++i)
    	{
    		for(int x=0;x<InterfazAplicacionHemeroteca.getHemerotecasDatos().get(i).getRecursoDigital().size();++x)
    		{
    			if(InterfazAplicacionHemeroteca.getHemerotecasDatos().get(i).getRecursoDigital().get(x).getTema().toLowerCase().contains(elementoBuscar.toLowerCase()))
    			{
    				RecursoDigital tmp = InterfazAplicacionHemeroteca.getHemerotecasDatos().get(i).getRecursoDigital().get(x);
    				resultadoBusquedaDig.add(tmp);
    			}
    		}
    	}
    }
    
    private void buscarTitulo(String elementoBuscar)
    {
    	resultadoBusquedaDig = new ArrayList<RecursoDigital>(); 
    	resultadoBusquedaImp = new ArrayList<RecursoImpreso>();
    	
    	for(int i=0;i<InterfazAplicacionHemeroteca.getHemerotecasDatos().size();++i)
    	{
    		for(int x=0;x<InterfazAplicacionHemeroteca.getHemerotecasDatos().get(i).getRecursoImpreso().size();++x)
    		{
    			if(InterfazAplicacionHemeroteca.getHemerotecasDatos().get(i).getRecursoImpreso().get(x).getTitulo().toLowerCase().contains(elementoBuscar.toLowerCase()))
    			{
    				RecursoImpreso tmp = InterfazAplicacionHemeroteca.getHemerotecasDatos().get(i).getRecursoImpreso().get(x);
    				resultadoBusquedaImp.add(tmp);
    			}
    		}
    	}
    	for(int i=0;i<InterfazAplicacionHemeroteca.getHemerotecasDatos().size();++i)
    	{
    		for(int x=0;x<InterfazAplicacionHemeroteca.getHemerotecasDatos().get(i).getRecursoDigital().size();++x)
    		{
    			if(InterfazAplicacionHemeroteca.getHemerotecasDatos().get(i).getRecursoDigital().get(x).getTitulo().toLowerCase().contains(elementoBuscar.toLowerCase()))
    			{
    				RecursoDigital tmp = InterfazAplicacionHemeroteca.getHemerotecasDatos().get(i).getRecursoDigital().get(x);
    				resultadoBusquedaDig.add(tmp);
    			}
    		}
    	}
    }
    
    private void llenarTablaRe()
    {
    	if(resultadoBusquedaDig.size()>-1||resultadoBusquedaImp.size()>-1)
    	{
    		int totFilas=resultadoBusquedaDig.size()+resultadoBusquedaImp.size();
        	DefaultTableModel modeloDefault = new DefaultTableModel(new String[] {"Titulo","Tipo","Disponible","I/D"},totFilas);
        	tablaResultados.setModel(modeloDefault);
        	
        	TableModel modeloDatos = tablaResultados.getModel();
        	try
        	{
        		for(int i=0;i<resultadoBusquedaImp.size();++i)
            	{
            		RecursoImpreso recurso = resultadoBusquedaImp.get(i);
            		
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
        		
        		int x=resultadoBusquedaImp.size();
        		for(int i=x, y=0;y<resultadoBusquedaDig.size();++i,++y)
            	{
        			RecursoDigital recurso = resultadoBusquedaDig.get(y);
            		
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
    	else
    	{
    		
    	}
    }
    

    /////////////////////////////////////////////////////////////////////////////////////////////////7
	public javax.swing.JButton getBtnBuscar() {
		return btnBuscar;
	}

	public void setBtnBuscar(javax.swing.JButton btnBuscar) {
		this.btnBuscar = btnBuscar;
	}

	public javax.swing.JButton getBtnIr() {
		return btnIr;
	}

	public void setBtnIr(javax.swing.JButton btnIr) {
		this.btnIr = btnIr;
	}

	public javax.swing.JButton getBtnRegresar() {
		return btnRegresar;
	}

	public void setBtnRegresar(javax.swing.JButton btnRegresar) {
		this.btnRegresar = btnRegresar;
	}

	public javax.swing.JTextField getCampoBusqueda() {
		return campoBusqueda;
	}

	public void setCampoBusqueda(javax.swing.JTextField campoBusqueda) {
		this.campoBusqueda = campoBusqueda;
	}

	public javax.swing.JLabel getEtiquetaHemeroteca() {
		return etiquetaHemeroteca;
	}

	public void setEtiquetaHemeroteca(javax.swing.JLabel etiquetaHemeroteca) {
		this.etiquetaHemeroteca = etiquetaHemeroteca;
	}

	public javax.swing.JRadioButton getJrbAutor() {
		return jrbAutor;
	}

	public void setJrbAutor(javax.swing.JRadioButton jrbAutor) {
		this.jrbAutor = jrbAutor;
	}

	public javax.swing.JRadioButton getJrbTema() {
		return jrbTema;
	}

	public void setJrbTema(javax.swing.JRadioButton jrbTema) {
		this.jrbTema = jrbTema;
	}

	public javax.swing.JRadioButton getJrbTitulo() {
		return jrbTitulo;
	}

	public void setJrbTitulo(javax.swing.JRadioButton jrbTitulo) {
		this.jrbTitulo = jrbTitulo;
	}

	public javax.swing.JPanel getPanelBusqueda() {
		return panelBusqueda;
	}

	public void setPanelBusqueda(javax.swing.JPanel panelBusqueda) {
		this.panelBusqueda = panelBusqueda;
	}

	public javax.swing.JPanel getPanelResultados() {
		return panelResultados;
	}

	public void setPanelResultados(javax.swing.JPanel panelResultados) {
		this.panelResultados = panelResultados;
	}

	public javax.swing.JScrollPane getScrollPanelResult() {
		return scrollPanelResult;
	}

	public void setScrollPanelResult(javax.swing.JScrollPane scrollPanelResult) {
		this.scrollPanelResult = scrollPanelResult;
	}

	public javax.swing.JTable getTablaResultados() {
		return tablaResultados;
	}

	public void setTablaResultados(javax.swing.JTable tablaResultados) {
		this.tablaResultados = tablaResultados;
	}

	public InterfazAplicacionHemeroteca getVentanaPrincipal() {
		return ventanaPrincipal;
	}

	public void setVentanaPrincipal(InterfazAplicacionHemeroteca ventanaPrincipal) {
		this.ventanaPrincipal = ventanaPrincipal;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
