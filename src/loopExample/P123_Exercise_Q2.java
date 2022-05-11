package loopExample;
//continue 연습문제 => 구구단 짝수단만 출력 
public class P123_Exercise_Q2 {

	public static void main(String[] args) {
		int dan;
		int times;
		
		for(dan=1; dan<=9; dan++) {
			if(dan%2 != 0)
				continue;
			for(times=1 ; times<=9; times++) {
				System.out.println(dan + "x" + times + "=" + dan*times );	
				
			}
		  System.out.println();
		}
	}

}
