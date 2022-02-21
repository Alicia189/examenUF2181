/**
 * 
 */
package programa;

import javax.swing.JOptionPane;

import libs.Funciones;

/**
 * @author David
 * Clase que ejecuta un cuadro de di�logo para pedir al usuario un a�o
 * e indica si el a�o es bisiesto o no
 */
public class Ppal {

	/**
	 * M�todo principal de la clase, es el punto de entrada de la aplicaci�n
	 * @param args String [] Son los argumentos de la aplicaci�n. No se usan pero 
	 * se mantienen por compatibilidad
	 */
	public static void main(String[] args) {
		String a�oString = JOptionPane.showInputDialog(null, "Introduce un a�o", 
			"Comprobar si el a�o es bisiesto", JOptionPane.QUESTION_MESSAGE);
		try {
			int a�o = Integer.parseInt(a�oString);
			Funciones f = new Funciones();
			if (f.esBisiesto(a�o)) {
				JOptionPane.showMessageDialog(null, "El a�o es bisiesto",
						"Es bisiesto", JOptionPane.INFORMATION_MESSAGE);
			} else {
				JOptionPane.showMessageDialog(null, "El a�o NO es bisiesto",
						"NO Es bisiesto", JOptionPane.WARNING_MESSAGE);
			}
			
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "No has introducido un dato correcto",
					"Dato incorrecto", JOptionPane.ERROR_MESSAGE);
		}
		
		
	}

}
