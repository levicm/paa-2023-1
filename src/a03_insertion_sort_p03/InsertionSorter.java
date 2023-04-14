package a03_insertion_sort_p03;

public class InsertionSorter<T extends Comparable<T>> implements Sorter<T> {

	@Override
	public void sort(T[] array) {
		for (int atual = 1; atual < array.length; ++atual) {
			int analise = atual;
			System.out.println("Atual: " + atual + ". Analise: " + analise);

			while (analise > 0 && array[analise].compareTo(array[analise - 1]) < 0) {
				System.out.println("Trocando " + array[analise] + " por " + array[analise - 1] + "...");
				exchange(array, analise, analise - 1);
				analise--;
			}
		}
	}

	private void exchange(T[] array, int pos1, int pos2) {
		T analise = array[pos1];
		array[pos1] = array[pos2];
		array[pos2] = analise;
	}
}
