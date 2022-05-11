package loopExample;
//break 연습문제 => 구구단을 단보다 곱하는 수가 작거나 같은 경우까지만 출력

public class P123_Exercise_Q3 {
	public static void main(String[] args) {
		int dan;
		int times;
		
		for(dan=1; dan<=9; dan++) {
			for(times=1; ;times++) {
				if(dan<times)
					break;
				System.out.println(dan + "x" + times + "=" + dan*times );
			}
		 System.out.println();
		}
	}

}
