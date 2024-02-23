package Assignment4;
//Write a program to find the sum of even numbers only in a given array. Use continue.
public class Q3 {
	public static void main(String[] args) {
		int sum=0;
		int arr[]= {0,1,2,3,4,5,6,7,8,9};
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				sum+=arr[i];
			}
			else {
				continue;
			}
		}
		System.out.println(sum);
	}

}
