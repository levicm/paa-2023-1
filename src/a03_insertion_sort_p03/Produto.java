package a03_insertion_sort_p03;

import java.util.Comparator;

public class Produto implements Comparable<Produto>{
	private String nome;
	private double preco;
	
	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getPreco() {
		return preco;
	}
	
	@Override
	public String toString() {
		return nome + " (" + preco + ")";
	}

	@Override
	public int compareTo(Produto o) {
		return (int) Math.round(this.getPreco() - o.getPreco());
	}

}
