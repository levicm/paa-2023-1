package a01_intro_p04;

public class EncontraMenorPreco {

	public static void main(String[] args) {
		Produto[] produtos = new Produto[] {
				new Produto("Lamborghini", 1000000.0),
				new Produto("Jipe", 46000.0),
				new Produto("Brasilia", 16000.0),
				new Produto("Smart", 46000.0),
				new Produto("Fusca", 17000.0),
		};
		
		int maisBarato = buscaMenor(produtos, 0, produtos.length);
		
		System.out.println("O mais barato foi " + produtos[maisBarato]);
	}

	private static int buscaMenor(Produto[] produtos, int inicio, int fim) {
		int maisBarato = inicio;
		for (int atual = inicio; atual < fim; ++atual) {
			if (produtos[atual].getPreco() < produtos[maisBarato].getPreco()) {
				maisBarato = atual;
			}
		}
		return maisBarato;
	}

}
