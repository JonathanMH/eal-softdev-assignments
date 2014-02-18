/*
 * If n is odd then Median (M) = value of ((n + 1)/2)th item term.
 * If n is even then Median (M) = value of [((n)/2)th item term + ((n)/2 + 1)th item term ]/2
*/

import java.util.Arrays;

public class Median {
	public static void main(String[] args) {
		int[] numArray = {1,2,3,4,5,6,7,8,9,10,11};
		Arrays.sort(numArray);
		int middle = numArray.length/2;
		int medianValue = 0; //declare variable 
		if (numArray.length%2 == 1) { 
				medianValue = numArray[middle];
		}
		else {
			 medianValue = (numArray[middle-1] + numArray[middle]) / 2;
		}
		System.out.println(medianValue);
	}
}
