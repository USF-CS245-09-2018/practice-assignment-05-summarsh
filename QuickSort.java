
public class QuickSort implements SortingAlgorithm {

	public void swap(int a, int b, int [] arr) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b]=temp;
	}
	
	public void sort(int [] a) {
		sort(a, 0, a.length-1);
	}

	public void sort(int []a, int left, int right) {
		if(left<right){
			int p = partition(a, left, right);
			sort(a, left, p-1);
			sort(a, p+1, right);
		}
	}

	public int partition(int [] a, int left, int right){
			int pivot=right;
			int i=left;
			int k=right-1;
			while(i<k) {
				while(i<right && a[i]<=a[pivot]){
					++i;
				}
				while(k>i && a[k]>a[pivot]){
					--k;
				}
				if(i<k) {
					swap(i,k,a);
				}
			}
		swap(pivot,i,a);
		return k;
	}
}