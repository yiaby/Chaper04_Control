package loopExample;

public class P114_ForExample1 {
//for문 예제
	public static void main(String[] args) {
		int i;
		int sum;
		for(i = 1, sum = 0; i <= 10; i++) { //초기화 부분과 증감식 부분도 콤마(,)로 구분하여 여러 문장을 사용할 수 있다.
			sum += i;
		}
		System.out.println("1부터 10까지의 합은 " + sum + "입니다.");
	}

}
