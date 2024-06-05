package in.winny;

import java.util.Arrays;

public class MinAndMax {

	public static void main(String[] args) {
		int arr[] = { 1, 5, 32, 3, 4, 22, };
		Arrays.sort(arr);
		System.out.println("min:" + arr[0]);
		System.out.println("max:" + arr[arr.length - 1]);
	}

}
