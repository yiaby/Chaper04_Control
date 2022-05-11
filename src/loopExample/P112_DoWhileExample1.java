package loopExample;

public class P112_DoWhileExample1 {
//do-while문 예제
	public static void main(String[] args) {
		int num = 1;
		int sum = 0;
		
		do {
			sum += num;
			num++;
		}while(num<=10);
		
		System.out.println("1부터 10까지의 합은" + sum + "입니다.");
			
		
	}

}
