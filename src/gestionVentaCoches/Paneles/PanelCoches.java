package gestionVentaCoches.Paneles;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;

import gestionVentaCoches.Coche;
import gestionVentaCoches.Fabricante;
import gestionVentaCoches.Controladores.ControladorCoche;
import gestionVentaCoches.Controladores.ControladorFabricante;

import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class PanelCoches extends JPanel {
	Coche actual=new Coche();
	
	private JTextField jtfId;
	private JTextField jtfBastidor;
	private JTextField jtfModelo;
	private JTextField jtfColor;
	private JComboBox<Fabricante> jcbFabricante;

	/**
	 * Create the panel.
	 */
	public PanelCoches() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 353};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 58, 72, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JPanel panel_1 = new JPanel();
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.gridwidth = 2;
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 0;
		gbc_panel_1.gridy = 6;
		add(panel_1, gbc_panel_1);
		
		JButton btnGuardar = new JButton("Guardar");
		panel_1.add(btnGuardar);
		
		JButton btnNuevo = new JButton("Nuevo");
		panel_1.add(btnNuevo);
		
		JButton btnBorrar = new JButton("Borrar");
		panel_1.add(btnBorrar);
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				borrar();
			}
		});
		btnNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vaciarCampos();
			}
		});
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				guardar();
			}
		});
		
		JLabel lblId = new JLabel("Id:");
		GridBagConstraints gbc_lblId = new GridBagConstraints();
		gbc_lblId.anchor = GridBagConstraints.EAST;
		gbc_lblId.insets = new Insets(0, 0, 5, 5);
		gbc_lblId.gridx = 0;
		gbc_lblId.gridy = 0;
		add(lblId, gbc_lblId);
		
		jtfId = new JTextField();
		jtfId.setEnabled(false);
		GridBagConstraints gbc_tfId = new GridBagConstraints();
		gbc_tfId.insets = new Insets(10, 0, 5, 30);
		gbc_tfId.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfId.gridx = 1;
		gbc_tfId.gridy = 0;
		add(jtfId, gbc_tfId);
		jtfId.setColumns(10);
		
		JLabel lblFabricante = new JLabel("Fabricante:");
		GridBagConstraints gbc_lblFabricante = new GridBagConstraints();
		gbc_lblFabricante.insets = new Insets(0, 0, 5, 5);
		gbc_lblFabricante.anchor = GridBagConstraints.NORTHEAST;
		gbc_lblFabricante.gridx = 0;
		gbc_lblFabricante.gridy = 1;
		add(lblFabricante, gbc_lblFabricante);
		
		jcbFabricante = new JComboBox();
		GridBagConstraints gbc_jcbFabricante = new GridBagConstraints();
		gbc_jcbFabricante.insets = new Insets(0, 0, 5, 30);
		gbc_jcbFabricante.fill = GridBagConstraints.HORIZONTAL;
		gbc_jcbFabricante.gridx = 1;
		gbc_jcbFabricante.gridy = 1;
		add(jcbFabricante, gbc_jcbFabricante);
		
		JLabel lblBastidor = new JLabel("Bastidor:");
		GridBagConstraints gbc_lblBastidor = new GridBagConstraints();
		gbc_lblBastidor.anchor = GridBagConstraints.EAST;
		gbc_lblBastidor.insets = new Insets(0, 0, 5, 5);
		gbc_lblBastidor.gridx = 0;
		gbc_lblBastidor.gridy = 2;
		add(lblBastidor, gbc_lblBastidor);
		
		jtfBastidor = new JTextField();
		GridBagConstraints gbc_tfBastidor = new GridBagConstraints();
		gbc_tfBastidor.insets = new Insets(10, 0, 5, 30);
		gbc_tfBastidor.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfBastidor.gridx = 1;
		gbc_tfBastidor.gridy = 2;
		add(jtfBastidor, gbc_tfBastidor);
		jtfBastidor.setColumns(10);
		
		JLabel lblModelo = new JLabel("Modelo:");
		GridBagConstraints gbc_lblModelo = new GridBagConstraints();
		gbc_lblModelo.anchor = GridBagConstraints.EAST;
		gbc_lblModelo.insets = new Insets(0, 0, 5, 5);
		gbc_lblModelo.gridx = 0;
		gbc_lblModelo.gridy = 3;
		add(lblModelo, gbc_lblModelo);
		
		jtfModelo = new JTextField();
		GridBagConstraints gbc_tfModelo = new GridBagConstraints();
		gbc_tfModelo.insets = new Insets(10, 0, 5, 30);
		gbc_tfModelo.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfModelo.gridx = 1;
		gbc_tfModelo.gridy = 3;
		add(jtfModelo, gbc_tfModelo);
		jtfModelo.setColumns(10);
		
		JLabel lblColor = new JLabel("Color:");
		GridBagConstraints gbc_lblColor = new GridBagConstraints();
		gbc_lblColor.anchor = GridBagConstraints.EAST;
		gbc_lblColor.insets = new Insets(0, 0, 5, 5);
		gbc_lblColor.gridx = 0;
		gbc_lblColor.gridy = 4;
		add(lblColor, gbc_lblColor);
		
		jtfColor = new JTextField();
		GridBagConstraints gbc_tfColor = new GridBagConstraints();
		gbc_tfColor.insets = new Insets(10, 0, 5, 30);
		gbc_tfColor.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfColor.gridx = 1;
		gbc_tfColor.gridy = 4;
		add(jtfColor, gbc_tfColor);
		jtfColor.setColumns(10);
		
		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.insets = new Insets(0, 0, 5, 0);
		gbc_panel.gridwidth = 2;
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 5;
		add(panel, gbc_panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnPrimero = new JButton("<<");
		btnPrimero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actual = ControladorCoche.getInstance().findPrimero();
				cargarActualEnPantalla();
			}
		});
		panel.add(btnPrimero);
		
		JButton btnAnterior = new JButton("<");
		btnAnterior.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actual = ControladorCoche.getInstance().findAnterior(actual.getId());
				cargarActualEnPantalla();
			}
		});
		panel.add(btnAnterior);
		
		JButton btnSiguiente = new JButton(">");
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actual = ControladorCoche.getInstance().findSiguiente(actual.getId());
				cargarActualEnPantalla();
			}
		});
		panel.add(btnSiguiente);
		
		JButton btnUltimo = new JButton(">>");
		btnUltimo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actual = ControladorCoche.getInstance().findUltimo();
				cargarActualEnPantalla();
			}
		});
		panel.add(btnUltimo);

		
		cargarDatosFabricantes();
		this.actual = ControladorCoche.getInstance().findPrimero();
		cargarActualEnPantalla();
		
	}
	
	/**
	 * 
	 */
	private void cargarDatosFabricantes() {
		List<Fabricante> fabricantes = ControladorFabricante.getInstance().findAll();
		
		for (Fabricante f : fabricantes) {
			this.jcbFabricante.addItem(f);
		}
	}
	
	/**
	 * 
	 */
	private void cargarActualEnPantalla() {
		if (this.actual != null) {
			this.jtfId.setText("" + this.actual.getId());
			this.jtfBastidor.setText(this.actual.getBastidor());
			this.jtfModelo.setText(this.actual.getModelo());
			this.jtfColor.setText(this.actual.getColor());
			
			// Carga del fabricante
			for (int i = 0; i < this.jcbFabricante.getItemCount(); i++) {
				if (this.actual.getIdFabricante() == this.jcbFabricante.getItemAt(i).getId()) {
					this.jcbFabricante.setSelectedIndex(i);
				}
			}
		}
	}
	
	/**
	 * 
	 */
	private void cargarActualDesdePantalla() {
		this.actual.setId(Integer.parseInt(jtfId.getText()));
		this.actual.setBastidor(jtfBastidor.getText());
		this.actual.setModelo(jtfModelo.getText());
		this.actual.setColor(jtfColor.getText());
		this.actual.setIdFabricante(((Fabricante) jcbFabricante.getSelectedItem()).getId());
	}
	

	/**
	 * 
	 */
	private void guardar () {
		cargarActualDesdePantalla();
		// Decido si se trata de guardar un registro existente o nuevo
		if (this.actual.getId() != 0) { // Modificaci�n
			int regsAfec = ControladorCoche.getInstance().modificar(this.actual);
			if (regsAfec > 0) {
				JOptionPane.showMessageDialog(null, "Registro modificado correctamente");
			}
		}
		else { // Alta -  nuevo
			int idNuevoReg = ControladorCoche.getInstance().nuevo(this.actual);
			if (idNuevoReg > 0) {
				this.jtfId.setText("" + idNuevoReg);
				JOptionPane.showMessageDialog(null, "Registro insertado correctamente");
			}
		}
	}

	
	/**
	 * 
	 */
	private void vaciarCampos() {
		this.jtfId.setText("0");
		this.jcbFabricante.setSelectedItem(null);
		this.jtfBastidor.setText("");
		this.jtfColor.setText("");
		this.jtfModelo.setText("");
	}
	

	/**
	 * 
	 */
	private void borrar() {
		String posiblesRespuestas[] = {"SI","NO"};
		// En esta opci�n se utiliza un showOptionDialog en el que personalizo el icono mostrado
		int opcionElegida = JOptionPane.showOptionDialog(null, "�Desea eliminar?", "Gesti�n venta de coches", 
		        JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, posiblesRespuestas, posiblesRespuestas[1]);
	    if(opcionElegida == 0) {
	    	int regsAfectados = ControladorCoche.getInstance().borrar(this.actual.getId());
	    	if (regsAfectados > 0) {
	    		vaciarCampos();
	    		JOptionPane.showMessageDialog(null, "Eliminado correctamente");
	    	}
	    }
	}

}
