//MARCOS MADEIRA//
/////////////////0 0
/// PROJETO ////  -
///////////////

package br.uff.marcos.calculadora.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;

public class ControleDelMemoria implements ActionListener {

	private JTextField painelP;

	public ControleDelMemoria(JTextField visorP) {
		this.painelP = visorP;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		painelP.setText("Apagar a memoria?");
	}
}
