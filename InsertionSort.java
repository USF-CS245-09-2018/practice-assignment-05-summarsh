
public class InsertionSort implements SortingAlgorithm {

	public void sort(int [] a) {

		for(int i = 0; i < a.length; i++) {
			int temp = a[i];
			int k = i-1;
			while(k>=0 && a[k]>temp) {
				a[k+1] = a[k];
				k=k-1;
			}
			a[k+1] = temp;
		}
	}
}