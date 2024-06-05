package in.winny;

import java.util.Arrays;

public class SecondLargestNumber {

	public static void main(String[] args) {

		int arr[] = {97,83,85,70,78,82};
		Arrays.sort(arr);
		System.out.println(arr[0]);
		System.out.println(arr[arr.length -2 ]);

	}

}
