package assignment12.qn1;

import java.util.Arrays;

public class MergeSort implements Sortable {

	@Override
	public int[] sort(int[] arr) {
		if (arr.length == 1) {
			return arr;
		}
		int mid = arr.length / 2;
		int left[] = sort(Arrays.copyOfRange(arr, 0, mid));
		int right[] = sort(Arrays.copyOfRange(arr, mid, arr.length));
		return mergeSort(left, right);
	}

	public int[] mergeSort(int[] left, int[] right) {
		int join[] = new int[left.length + right.length];
		int i = 0, j = 0, k = 0;
		while (i < left.length && j < right.length) {
			if (left[i] < right[j]) {
				join[k++] = left[i++];
			} else if (left[i] > right[j]) {
				join[k++] = right[j++];
			}
		}
		while (i < left.length)
			join[k++] = left[i++];
		while (j < right.length)
			join[k++] = right[j++];

		// System.out.println(Arrays.toString(join));
		return join;
	}

}
