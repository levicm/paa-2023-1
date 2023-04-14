package a03_insertion_sort_p03;

public class SelectionSorter<T extends Comparable<T>> implements Sorter<T> {

	@Override
	public void sort(T[] array) {
		for (int i = 0; i < array.length; ++i) {
			int menor = buscaMenor(array, i, array.length);
			T menorElemento = array[menor];
			System.out.println("Menor índice: " + menor + " Menor elemento: " + menorElemento + ". Trocando "
					+ menorElemento + " por " + array[i]);
			array[menor] = array[i];
			array[i] = menorElemento;
		}
	}

	private int buscaMenor(T[] array, int inicio, int fim) {
		int menor = inicio;
		for (int atual = inicio; atual < fim; ++atual) {
			if (array[atual].compareTo(array[menor]) < 0) {
				menor = atual;
			}
		}
		return menor;
	}

}
