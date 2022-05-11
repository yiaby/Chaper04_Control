package loopExample;

public class P118_Nested_oneMinute {
//구구단 3단 부터 7단까지
	public static void main(String[] args) {
		int dan;
		int times;
		
		for(dan=3; dan<=7; dan++) {
			for(times=1; times<=9; times++) {
				System.out.println(dan+"x"+times+"="+dan*times);
			}
			System.out.println();
		}
	}

}
