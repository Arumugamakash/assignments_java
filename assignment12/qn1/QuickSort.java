package assignment12.qn1;

import java.util.Arrays;

public class QuickSort implements Sortable {
	@Override
	public int[] sort(int arr[]) {
		int start = 0;
		int end = arr.length - 1;
		quick(arr, start, end);
		return arr;
		//System.out.println(Arrays.toString(arr));
	}

	int partition(int a[], int start, int end) {
		int p = a[end];
		int i = (start - 1);

		for (int j = start; j <= end - 1; j++) {
			if (a[j] < p) {
				i++;
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
		int temp2= a[i + 1];
		a[i + 1] = a[end];
		a[end] = temp2;
		return (i + 1);
	}

	void quick(int a[], int start, int end) {
		if (start < end) {
			int p = partition(a, start, end);
			quick(a, start, p - 1);
			quick(a, p + 1, end);
		}
	}
//	return arr;
}
