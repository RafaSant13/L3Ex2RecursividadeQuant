package controller;

public class QuantControle {

	public QuantControle() {
		super();
	}

	public int Quant(int N, int C) {
		//Condição de parada -> Quando N é menor do que 10, assim podemos comparar o único algarismo
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
			//A função é chamada na variável de contagem, com a variável N sendo dividida por 10 para que o número N diminua um algarismo
			int cont = Quant((N/10), C);
			if (N % 10 == C)
			{
				cont++;
			}
			return cont;
		}
	}
}
