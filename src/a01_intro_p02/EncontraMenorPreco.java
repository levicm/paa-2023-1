package a01_intro_p02;

public class EncontraMenorPreco {

	public static void main(String[] args) {
		Produto[] produtos = new Produto[] {
				new Produto("Lamborghini", 1000000.0),
				new Produto("Jipe", 46000.0),
				new Produto("Brasilia", 16000.0),
				new Produto("Smart", 46000.0),
				new Produto("Fusca", 17000.0),
				
		};
		
		int maisBarato = 0;
		for (int atual = 0; atual < produtos.length; ++atual) {
			if (produtos[atual].getPreco() < produtos[maisBarato].getPreco()) {
				maisBarato = atual;
			}
		}
		
		System.out.println("O mais barato foi " + produtos[maisBarato]);
	}

}
