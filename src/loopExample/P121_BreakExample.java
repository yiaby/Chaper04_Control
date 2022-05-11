package loopExample;
//break문 예제
public class P121_BreakExample {
	public static void main(String[] args) {
		int sum = 0;
		int num = 0;
		
		for( ; ; num++) {
			sum += num;
			if(sum >= 100)
				break;
		}
	    System.out.println("num : " + num);
	    System.out.println("sum : " + sum);
	}
  /*
   * ※continue와 break문의 차이: 
   *  =>continue:반복문을 계속 수행하지만 특정 조건에서 수행문을 생략하는경우에 사용
   *  =>break:반복문을 더 이상 수행하지 않고 빠져나올 때 사용
   */
}
