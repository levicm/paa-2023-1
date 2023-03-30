package a02.p02;

public class EncontraMenorPreco {

	public static void main(String[] args) {
		Produto[] produtos = new Produto[] {
				new Produto("Lamborghini", 1000000.0),
				new Produto("Jipe", 46000.0),
				new Produto("Brasilia", 16000.0),
				new Produto("Smart", 46000.0),
				new Produto("Fusca", 17000.0),
		};

		imprime(produtos);

		ordena(produtos);

		imprime(produtos);

		System.out.println("O produto mais barato: " + produtos[0]);
		System.out.println("O produto mais caro: " + produtos[produtos.length - 1]);
	}

	private static void imprime(Produto[] produtos) {
		System.out.print("[");
		for (int i = 0; i < produtos.length; ++i) {
			System.out.print(produtos[i] + ", ");
		}
		System.out.println("]");
	}

	private static void ordena(Produto[] produtos) {
		for (int i = 0; i < produtos.length; ++i) {
			int menor = buscaMenor(produtos, i, produtos.length);
			Produto menorProduto = produtos[menor];
			System.out.println("Menor: " + menor + " Menor produto: " + menorProduto + ". Trocando " + menorProduto + " por " + produtos[i]);
			produtos[menor] = produtos[i];
			produtos[i] = menorProduto;
		}
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
