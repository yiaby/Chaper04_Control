package loopExample;

public class P116_NestedLoop {
//중첩된 반복문
	public static void main(String[] args) {
		int dan;
		int times;
		//2단부터 9단까지 반복하는 외부 반복문
		for(dan = 2; dan <= 9; dan++) {
			//각 단에서 1~9를 곱하는 내부 반복문
			for(times = 1; times <= 9; times++) {
				System.out.println(dan + "x" + times + dan*times);
			}
			//한줄 띄워서 출력
			System.out.println(); 
		}
	}

}
