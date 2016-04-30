package collectionTest;

import java.util.Arrays;

public class StringTest {

	public static void main(java.lang.String[] args) {
		int[] in = {3,4,5,2,7,1,8,0,6};
		int[] is = new int[5];
		Arrays.fill(is, 6);
		Arrays.sort(in);
		System.out.println(Arrays.toString(is));
		System.out.println(Arrays.binarySearch(in, 0));

	}

}
