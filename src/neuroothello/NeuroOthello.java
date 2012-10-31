/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package neuroothello;

/**
 *
 * @author LostMekka
 */
public class NeuroOthello {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		Viewer v = new Viewer();
		v.setVisible(true);
		v.setBoard(new GameField());
		// TODO: start
	}
}
