package commonbytes;
import java.util.Arrays;

public class findNonRecurringNumber {
	public static void main(String[] args) {
		Integer[] intArr = { 3, 3, 3, 4, 6, 6, 6, 4, 4, 0 };
		// 1,3,3,3,6,6,6
		// 3,3,3,4,6,6,6
		Arrays.sort(intArr);
		for (int i = 0; i < intArr.length - 2;) {
			if (intArr[i] == intArr[i + 1] && intArr[i] == intArr[i + 2]) {
				i += 3;
				continue;
			} else {
				System.out.println(intArr[i]);
				i += 1;
			}
		}
	}
}
