package gestionVentaCoches.Paneles;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.swing.JCheckBox;
import javax.swing.JTextField;

import gestionVentaCoches.Cliente;
import gestionVentaCoches.Controladores.ControladorCliente;

import javax.swing.JButton;
import java.awt.FlowLayout;

public class PanelCliente extends JPanel {
	Cliente actual=new Cliente();
	private JTextField jtfNombre;
	private JTextField jtfApellidos;
	private JTextField jtfDni;
	private JTextField jtfFechaNac;
	private JTextField jtfLocalidad;
	private JTextField jtfId;
	private JCheckBox jcbActivo;
	
	private SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
	
	/**
	 * Create the panel.
	 */
	public PanelCliente() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblNewLabel_1 = new JLabel("Id:");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 0;
		add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		jtfId = new JTextField();
		jtfId.setEnabled(false);
		GridBagConstraints gbc_jtfId = new GridBagConstraints();
		gbc_jtfId.insets = new Insets(0, 0, 5, 0);
		gbc_jtfId.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfId.gridx = 1;
		gbc_jtfId.gridy = 0;
		add(jtfId, gbc_jtfId);
		jtfId.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre:");
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.anchor = GridBagConstraints.EAST;
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 0;
		gbc_lblNombre.gridy = 1;
		add(lblNombre, gbc_lblNombre);
		
		jtfNombre = new JTextField();
		GridBagConstraints gbc_jtfNombre = new GridBagConstraints();
		gbc_jtfNombre.insets = new Insets(0, 0, 5, 0);
		gbc_jtfNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfNombre.gridx = 1;
		gbc_jtfNombre.gridy = 1;
		add(jtfNombre, gbc_jtfNombre);
		jtfNombre.setColumns(10);
		
		JLabel lblApellidos = new JLabel("Apellidos:");
		GridBagConstraints gbc_lblApellidos = new GridBagConstraints();
		gbc_lblApellidos.anchor = GridBagConstraints.EAST;
		gbc_lblApellidos.insets = new Insets(0, 0, 5, 5);
		gbc_lblApellidos.gridx = 0;
		gbc_lblApellidos.gridy = 2;
		add(lblApellidos, gbc_lblApellidos);
		
		jtfApellidos = new JTextField();
		GridBagConstraints gbc_jtfApellidos = new GridBagConstraints();
		gbc_jtfApellidos.insets = new Insets(0, 0, 5, 0);
		gbc_jtfApellidos.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfApellidos.gridx = 1;
		gbc_jtfApellidos.gridy = 2;
		add(jtfApellidos, gbc_jtfApellidos);
		jtfApellidos.setColumns(10);
		
		JLabel lblDniNie = new JLabel("DniNie:");
		GridBagConstraints gbc_lblDniNie = new GridBagConstraints();
		gbc_lblDniNie.anchor = GridBagConstraints.EAST;
		gbc_lblDniNie.insets = new Insets(0, 0, 5, 5);
		gbc_lblDniNie.gridx = 0;
		gbc_lblDniNie.gridy = 3;
		add(lblDniNie, gbc_lblDniNie);
		
		jtfDni = new JTextField();
		GridBagConstraints gbc_jtfDni = new GridBagConstraints();
		gbc_jtfDni.insets = new Insets(0, 0, 5, 0);
		gbc_jtfDni.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfDni.gridx = 1;
		gbc_jtfDni.gridy = 3;
		add(jtfDni, gbc_jtfDni);
		jtfDni.setColumns(10);
		
		JLabel lblFechaNac = new JLabel("Fecha Nacimiento:");
		GridBagConstraints gbc_lblFechaNac = new GridBagConstraints();
		gbc_lblFechaNac.anchor = GridBagConstraints.EAST;
		gbc_lblFechaNac.insets = new Insets(0, 0, 5, 5);
		gbc_lblFechaNac.gridx = 0;
		gbc_lblFechaNac.gridy = 4;
		add(lblFechaNac, gbc_lblFechaNac);
		
		jtfFechaNac = new JTextField();
		GridBagConstraints gbc_jtfFechaNac = new GridBagConstraints();
		gbc_jtfFechaNac.insets = new Insets(0, 0, 5, 0);
		gbc_jtfFechaNac.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfFechaNac.gridx = 1;
		gbc_jtfFechaNac.gridy = 4;
		add(jtfFechaNac, gbc_jtfFechaNac);
		jtfFechaNac.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Localidad:");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 5;
		add(lblNewLabel, gbc_lblNewLabel);
		
		jtfLocalidad = new JTextField();
		GridBagConstraints gbc_jtfLocalidad = new GridBagConstraints();
		gbc_jtfLocalidad.insets = new Insets(0, 0, 5, 0);
		gbc_jtfLocalidad.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfLocalidad.gridx = 1;
		gbc_jtfLocalidad.gridy = 5;
		add(jtfLocalidad, gbc_jtfLocalidad);
		jtfLocalidad.setColumns(10);
		
		jcbActivo = new JCheckBox("Activo");
		GridBagConstraints gbc_chckbxNewCheckBox = new GridBagConstraints();
		gbc_chckbxNewCheckBox.insets = new Insets(0, 0, 5, 0);
		gbc_chckbxNewCheckBox.gridx = 1;
		gbc_chckbxNewCheckBox.gridy = 6;
		add(jcbActivo, gbc_chckbxNewCheckBox);
		
		JPanel panel_1 = new JPanel();
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.gridwidth = 2;
		gbc_panel_1.insets = new Insets(0, 0, 5, 0);
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 0;
		gbc_panel_1.gridy = 7;
		add(panel_1, gbc_panel_1);
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnPrimero = new JButton("<<");
		btnPrimero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actual = ControladorCliente.getInstance().findPrimero();
				cargarActualEnPantalla();
			}
		});
		panel_1.add(btnPrimero);
		
		JButton btnAnterior = new JButton("<");
		btnAnterior.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actual = ControladorCliente.getInstance().findAnterior(actual.getId());
				cargarActualEnPantalla();
			}
		});
		panel_1.add(btnAnterior);
		
		JButton btnSiguiente = new JButton(">");
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actual = ControladorCliente.getInstance().findSiguiente(actual.getId());
				cargarActualEnPantalla();
			}
		});
		panel_1.add(btnSiguiente);
		
		JButton btnUltimo = new JButton(">>");
		btnUltimo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actual = ControladorCliente.getInstance().findUltimo();
				cargarActualEnPantalla();
			}
		});
		panel_1.add(btnUltimo);
		
		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.gridwidth = 2;
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 8;
		add(panel, gbc_panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				guardar();
			}
		});
		panel.add(btnGuardar);
		
		JButton btnNuevo = new JButton("Nuevo");
		btnNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vaciarCampos();
			}
		});
		panel.add(btnNuevo);
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				borrar();
			}
		});
		panel.add(btnBorrar);
		

		this.actual = ControladorCliente.getInstance().findPrimero();
		cargarActualEnPantalla();

	}
	
	
	/**
	 * 
	 */
	private void cargarActualEnPantalla() {
		if (this.actual != null) {
			this.jtfId.setText("" + this.actual.getId());
			this.jtfNombre.setText(this.actual.getNombre());
			this.jtfApellidos.setText(this.actual.getApellidos());
			this.jtfDni.setText(this.actual.getDniNIE());
			this.jtfLocalidad.setText(this.actual.getLocalidad());
			this.jtfFechaNac.setText(this.formatoFecha.format(this.actual.getFechaNacimiento()));
			this.jcbActivo.setSelected(this.actual.isActivo());
		}
	}
	
	

	/**
	 * 
	 */
	private void guardar () {
		cargarActualDesdePantalla();
		// Decido si se trata de guardar un registro existente o nuevo
		if (this.actual.getId() != 0) { // Modificaci�n
			int regsAfec = ControladorCliente.getInstance().modificar(this.actual);
			if (regsAfec > 0) {
				JOptionPane.showMessageDialog(null, "Registro modificado correctamente");
			}
		}
		else { // Alta -  nuevo
			int idNuevoReg = ControladorCliente.getInstance().nuevo(this.actual);
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
		this.jtfNombre.setText("");
		this.jtfApellidos.setText("");
		this.jtfDni.setText("");
		this.jtfFechaNac.setText("");
		this.jtfLocalidad.setText("");
		this.jcbActivo.setSelected(false);
		
	}
	
	/**
	 * 
	 */
	private void cargarActualDesdePantalla() {
		this.actual.setId(Integer.parseInt(jtfId.getText()));
		this.actual.setNombre(jtfNombre.getText());
		this.actual.setApellidos(jtfApellidos.getText());
		this.actual.setDniNIE(jtfDni.getText());
		this.actual.setLocalidad(jtfLocalidad.getText());
		this.actual.setActivo(jcbActivo.isSelected());
		try {
			this.actual.setFechaNacimiento(this.formatoFecha.parse(jtfFechaNac.getText()));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
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
	    	int regsAfectados = ControladorCliente.getInstance().borrar(this.actual.getId());
	    	if (regsAfectados > 0) {
	    		vaciarCampos();
	    		JOptionPane.showMessageDialog(null, "Eliminado correctamente");
	    	}
	    }
	}

}
