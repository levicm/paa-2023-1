package a03_insertion_sort_p02;

public class OrdenacaoPorInsercao {

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
		for (int atual = 1; atual < produtos.length; ++atual) {
			int analise = atual;
			System.out.println("Atual: " + atual + ". Analise: " + analise);
			
			while (analise > 0 
					&& produtos[analise].getPreco() < produtos[analise - 1].getPreco()) {
				System.out.println("Trocando " + produtos[analise] + " por " + produtos[analise - 1] + "...");
				trocar(produtos, analise, analise - 1);
				analise--;
				imprime(produtos);
			}
		}
	}

	private static void trocar(Produto[] produtos, int pos1, int pos2) {
		Produto prodAnalise = produtos[pos1];
		produtos[pos1] = produtos[pos2];
		produtos[pos2] = prodAnalise;
	}
}
