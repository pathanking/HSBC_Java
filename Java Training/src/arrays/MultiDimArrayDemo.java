package arrays;

/**
 * 
 * @author razaa
 * @apiNote array of arrays
 */

public class MultiDimArrayDemo {
	public static void main(String[] args) {
		int[][] arrays = new int[2][2];
		arrays[0][0] = 22;
		arrays[0][1] = 34;
		arrays[1][0] = 46;
		arrays[1][1] = 39;

		for (int[] array : arrays) {
			for (int i : array)
				System.out.print(i + "\t");

			System.out.println();
		}

		int[][] arr2 = { { 1, 2 }, { 2, 3 } };
		System.out.println(arr2[0][0]); // 1
		System.out.println(arr2[0][1]); // 2
		System.out.println(arr2[1][0]); // 2
		System.out.println(arr2[1][1]); // 3
	}
}
