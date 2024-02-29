import java.util.Arrays;

public class orderArray {
	public static void main(String[] args) {
//		Object[] inputArray = {5,7,3,5,9,10,3,2}; //input array numbers here

		Object[] inputArray = {"elephant", "baby", "zebra", "shoe"}; //input words to sort here
		if (isNumeric(inputArray)) {
			Arrays.sort(inputArray, (a, b) -> ((Integer) a).compareTo((Integer) b));
			System.out.println("Sorted by number: " + Arrays.toString(inputArray));
		} else {
			Arrays.sort(inputArray);
			System.out.println("sorted alphabetically: " + Arrays.toString(inputArray));
	}
}

public static boolean isNumeric(Object[] array) {
	for (Object element : array) {
		if (!(element instanceof Number)) {
			return false;
		}
	}
	return true;

	}
}
