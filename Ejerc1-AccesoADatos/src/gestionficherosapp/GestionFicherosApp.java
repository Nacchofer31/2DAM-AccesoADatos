/**
 * IGNACIO FERRER SANZ 2�DAM
 */
package gestionficherosapp;

import gestionficheros.MainGUI;

public class GestionFicherosApp {

	public static void main(String[] args) {
		GestionFicherosImpl getFicherosImpl = new GestionFicherosImpl();
		new MainGUI(getFicherosImpl).setVisible(true);

	}

}
