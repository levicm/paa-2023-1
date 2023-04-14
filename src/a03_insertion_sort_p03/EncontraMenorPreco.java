package a03_insertion_sort_p03;

public class EncontraMenorPreco {

	public static void main(String[] args) {		
		testSorter(new SelectionSorter<Produto>());
		testSorter(new InsertionSorter<Produto>());
	}

	private static void testSorter(Sorter<Produto> sorter) {
		Produto[] produtos = new Produto[] {
				new Produto("Lamborghini", 1000000.0),
				new Produto("Jipe", 46000.0),
				new Produto("Brasilia", 16000.0),
				new Produto("Smart", 46000.0),
				new Produto("Fusca", 17000.0),
		};

		imprime(produtos);

		sorter.sort(produtos);

		imprime(produtos);

		System.out.println("O produto mais barato: " + produtos[0]);
		System.out.println("O produto mais caro: " + produtos[produtos.length - 1]);
	}

	private static void imprime(Produto[] produtos) {
		System.out.print("[");
		for (int i = 0; i < produtos.length; ++i) {
			if (i > 0) {
				System.out.print(", ");
			}
			System.out.print(produtos[i]);
		}
		System.out.println("]");
	}

}
