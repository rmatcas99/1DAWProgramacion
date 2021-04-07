package gestionVentaCoches;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuBar extends JMenuBar {

	public MenuBar() {
		JMenu menuArchivo = new JMenu("Archivo");
		this.add(menuArchivo);
		
		String entidades[] = new String[] {"Fabricantes", "Coches", "Clientes", "Concesionarios", "Ventas"};
		
		for (int i = 0; i < entidades.length; i++) {
			final int iFinal = i;
			JMenuItem item = new JMenuItem(entidades[i]);
			item.addActionListener(new ActionListener() {				
				@Override
				public void actionPerformed(ActionEvent e) {
					VentanaPrincipal.getInstance().getjTabbedPane().setSelectedIndex(iFinal);
				}
			});
			menuArchivo.add(item);
		}
		
		
	
	}

}
