public class NextNumber {
	public static void main(String[] args) {
		int[] numbers = {2,4,6,8};
		int lastDiff;
		lastDiff = numbers[numbers.length-1] - numbers[numbers.length-2];
		System.out.println(numbers[numbers.length-1] + lastDiff);
	}
}
