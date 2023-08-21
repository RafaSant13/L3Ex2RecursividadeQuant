package controller;

public class QuantControle {

	public QuantControle() {
		super();
	}

	public int Quant(int N, int C) {
		//Condi��o de parada -> Quando N � menor do que 10, assim podemos comparar o �nico algarismo
		if (N<10)
		{
			if (N==C)
			{
				return 1;
			}
			else
			{
				return 0;
			}
		}
		else
		{
			//A fun��o � chamada na vari�vel de contagem, com a vari�vel N sendo dividida por 10 para que o n�mero N diminua um algarismo
			int cont = Quant((N/10), C);
			if (N % 10 == C)
			{
				cont++;
			}
			return cont;
		}
	}
}
