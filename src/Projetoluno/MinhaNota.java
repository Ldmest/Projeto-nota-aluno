package Projetoluno;

import javax.swing.JOptionPane;

public class MinhaNota {
/*Saber a m�dia do aluno!*/
	public static void main(String[] args) {

		String nota1 = JOptionPane.showInputDialog("Informe a nota 1");
		String nota2 = JOptionPane.showInputDialog("Informe a nota 2");
		String nota3 = JOptionPane.showInputDialog("Informe a nota 3");
		String nota4 = JOptionPane.showInputDialog("Informe a nota 3");

		double dNota1 = Double.parseDouble(nota1);
		double dNota2 = Double.parseDouble(nota2);
		double dNota3 = Double.parseDouble(nota3);
		double dNota4 = Double.parseDouble(nota4);

		double media = (dNota1 + dNota2 + dNota3 + dNota4) / 4;
		/* M�dia para Aprova��o � 70 */
		if (media >= 50) {
			if (media >= 70) {
				JOptionPane.showConfirmDialog(null, "Aluno est� Aprovado com m�dia:" + media);
			} else {
				JOptionPane.showConfirmDialog(null, "Aluno est� em Recupera��o com m�dia:" + media);
			}
		} else {
			JOptionPane.showConfirmDialog(null, "Aluno est� Reprovado com m�dia:" + media);
		}
		JOptionPane.showConfirmDialog(null,"Falar pra Aluno o resultado:" + media);
	}

}
