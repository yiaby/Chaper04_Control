package loopExample;

public class P109_WhileExmaple1 {
//while문 활용하여 1부터 10까지 더하기
	public static void main(String[] args) {
		int num = 1;
		int sum = 0;
		
		while (num <= 10) {
			sum += num;
			num++;
		}
		System.out.println("1부터 10까지의 합은" + sum + "입니다.");
		//[결과]:1부터 10까지의 합은55입니다.
	}

}
