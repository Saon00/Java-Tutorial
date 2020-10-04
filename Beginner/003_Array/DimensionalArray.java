import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {

		int[] arr = { 6, 2, 9, 6, 16, 3, 46, 254, 73, 25 };
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

		// 2d

		int[][] arr2D = { { 1, 2, 3 }, { 4, 5, 6 } };
		System.out.println(Arrays.deepToString(arr2D));
		// for multidimensional Array,use "deepToString"

		// 3d

		int[][] arr3D = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		System.out.println(Arrays.deepToString(arr3D));
		// for multidimensional Array,use "deepToString"
	}

}
