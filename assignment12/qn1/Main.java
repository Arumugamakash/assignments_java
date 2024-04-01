package assignment12.qn1;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int arr[]= {2,55,11,44,35};
		 Sortable bubble=new BubbleSort();
		 int[]ans1=bubble.sort(arr);
		 Sortable quick =new QuickSort();
		 int ans2[]=quick.sort(arr);
		 Sortable merge=new MergeSort();
		 int ans3[]=merge.sort(arr);
		 System.out.println("Buble sort Algarithm using"+Arrays.toString(ans1));
		 System.out.println("Quick sort Algarithm using"+Arrays.toString(ans2));
		 System.out.println("Merge sort Algarithm using"+Arrays.toString(ans3));
	}

}
