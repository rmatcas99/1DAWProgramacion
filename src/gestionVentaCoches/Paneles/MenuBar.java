package gestionVentaCoches.Paneles;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import gestionVentaCoches.VentanaPrincipal;

public class MenuBar extends JMenuBar {

	public MenuBar() {

		JMenu menuArchivo = new JMenu("Archivo");

		String entidades[] = new String[] { "Fabricantes", "Coches", "Clientes", "Concesionario", "Ventas" };

		for (int i = 0; i < entidades.length; i++) {
			final int iFinal = i;
			JMenuItem item = new JMenuItem(entidades[i]);
			item.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					VentanaPrincipal.getInstance().getJTabbedPane().setSelectedIndex(iFinal);
				}

			});

			menuArchivo.add(item);
		}

		this.add(menuArchivo);
	}

}
