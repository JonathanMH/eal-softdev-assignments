
public class Checksum {
	public static void main (String[] args) {
		int checksum;
		int[] number = {1,2,3};
		int result = 0;
		
		for (int n : number){
			result = result + n;
		}
		System.out.println(result);
	}
}

