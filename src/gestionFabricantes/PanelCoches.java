package gestionFabricantes;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class PanelCoches extends JPanel {

	/**
	 * Create the panel.
	 */
	public PanelCoches() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblId = new JLabel("Id");
		GridBagConstraints gbc_lblId = new GridBagConstraints();
		gbc_lblId.insets = new Insets(0, 0, 5, 0);
		gbc_lblId.gridx = 0;
		gbc_lblId.gridy = 0;
		add(lblId, gbc_lblId);
		
		JLabel lblFabricante = new JLabel("Fabricante");
		GridBagConstraints gbc_lblFabricante = new GridBagConstraints();
		gbc_lblFabricante.insets = new Insets(0, 0, 5, 0);
		gbc_lblFabricante.gridx = 0;
		gbc_lblFabricante.gridy = 1;
		add(lblFabricante, gbc_lblFabricante);
		
		JLabel lblBastidor = new JLabel("Bastidor");
		GridBagConstraints gbc_lblBastidor = new GridBagConstraints();
		gbc_lblBastidor.insets = new Insets(0, 0, 5, 0);
		gbc_lblBastidor.gridx = 0;
		gbc_lblBastidor.gridy = 2;
		add(lblBastidor, gbc_lblBastidor);
		
		JLabel lblModelo = new JLabel("Modelo");
		GridBagConstraints gbc_lblModelo = new GridBagConstraints();
		gbc_lblModelo.insets = new Insets(0, 0, 5, 0);
		gbc_lblModelo.gridx = 0;
		gbc_lblModelo.gridy = 3;
		add(lblModelo, gbc_lblModelo);
		
		JLabel lblColor = new JLabel("Color");
		GridBagConstraints gbc_lblColor = new GridBagConstraints();
		gbc_lblColor.gridx = 0;
		gbc_lblColor.gridy = 4;
		add(lblColor, gbc_lblColor);

	}

}
