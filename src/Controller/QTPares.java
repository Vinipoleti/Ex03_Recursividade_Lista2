package Controller;

public class QTPares {

	public QTPares () {
		super();
			}
	public int Pares (int [] vetor, int tamanho) {
		if (tamanho>0) { // pois como o indice para em zero, aqui temos a parada.
			if (vetor[tamanho-1]%2==0) { // divisão por 2 com resto zero, é par.
				return 1 + Pares(vetor, tamanho-1); // portanto soma 1.
			} else {
				return  Pares (vetor, tamanho-1); // se não for, apenas retorna a função com indice menos 1.
			}
		} else {
			return 0; // retorna somando zero, e terminando
		}
	}
}
