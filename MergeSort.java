
public class MergeSort implements SortingAlgorithm {

	public void sort(int [] a) {
		int mid = (a.length/2);
		if(a.length < 2) {
			return;
		}
		int[] leftArr = new int[mid];
		int[] rightArr = new int [a.length-mid];
		for(int i=0; i<mid; i++){
			leftArr[i] = a[i];
		}
		for(int k=mid; k<a.length; k++){
			rightArr[k-mid]=a[k];
		}
		sort(leftArr);
		sort(rightArr);
		merge(a, leftArr, rightArr);
	}

	public void merge(int [] a, int [] arrLeft, int [] arrRight) {
		int Llen = arrLeft.length;
		int Rlen = arrRight.length;

		int leftIndex = 0;
		int rightIndex = 0;
		int arrIndex = 0;
		while(leftIndex< Llen && rightIndex<Rlen) {
			if(arrLeft[leftIndex]<=arrRight[rightIndex]){
				a[arrIndex] = arrLeft[leftIndex];
				leftIndex++;
			} else {
				a[arrIndex] = arrRight[rightIndex];
				rightIndex++;
			}
			arrIndex++;
		}
		while(leftIndex<Llen) {
			a[arrIndex] = arrLeft[leftIndex];
			arrIndex++;
			leftIndex++;
		}
		while(rightIndex<Rlen) {
			a[arrIndex] = arrRight[rightIndex];
			arrIndex++;
			rightIndex++;
		}
	}
}