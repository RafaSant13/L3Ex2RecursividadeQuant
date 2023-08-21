package view;
import javax.swing.JOptionPane;

import controller.QuantControle;

public class Principal {

	public static void main(String[] args) {
		QuantControle QC = new QuantControle();
		int N = 185645;
		int C = 5;
		if (N < 10 || N >999999)
		{
			JOptionPane.showMessageDialog(null, "Valor inválido");
			System.exit(0);
		}
		System.out.println("Retorno aparece "+QC.Quant(N, C)+" vezes.");

	}

}
