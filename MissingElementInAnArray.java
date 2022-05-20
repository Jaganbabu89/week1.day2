package week1.day2;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,7,6,8};
		
		Arrays.sort(arr);
		
		int length = arr.length;
		int x = arr[0];
		
		for (int i = 0; i < length; i++) {
			if (arr[i] != (x + i)) {
				System.out.println("Missing number is "+(x + i));
				break;
			}
		}

	}

}
