package algorithmsIS;

import java.util.Arrays;

public class main {

	public static void main(String[] names) {
		int[] numbers = {7, 3, 10, 15, 20, 1, 1, 37, 27};
		var sorter = new InsertionSort();
		sorter.sort(numbers);
		System.out.println(Arrays.toString(numbers));

	}

}
