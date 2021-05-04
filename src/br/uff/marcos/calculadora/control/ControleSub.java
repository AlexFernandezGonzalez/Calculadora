//MARCOS MADEIRA//
/////////////////0 0
/// PROJETO ////  -
///////////////

package br.uff.marcos.calculadora.control;

import br.uff.marcos.calculadora.model.Conta;
import br.uff.marcos.calculadora.model.Numero;
import br.uff.marcos.calculadora.model.Pilha;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ControleSub implements ActionListener {

	private boolean foi = false;
	private int tam = 1;
	private String guarda = "";
	private final Pilha memoria;
	private JTextArea painelG;
	private JTextField painelP;
	private Numero numc;

	public ControleSub(Pilha memoria, JTextField visorP, JTextArea visorG) {
		this.memoria = memoria;
		this.painelP = visorP;
		this.painelG = visorG;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		guarda = painelP.getText();
		tam = guarda.length();
		if (tam == 0) {
			painelP.setText(guarda + "-");
			foi = true;
		} else if (tam > 0) {
			if (guarda.charAt(tam - 1) == ' ') {
				painelP.setText(guarda + "-");
				foi = true;
			} else {
				ControleEntrada.pegaValor(memoria, painelP, painelG);
			}
		}
		if (!foi) {
			numc = Conta.sub(memoria);
			if (numc != null) {
				painelP.setText("");
				Pilha.imprimePilha(memoria, painelG);
			}
		}
		foi = false;
	}
}