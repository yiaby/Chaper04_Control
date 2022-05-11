package loopExample;
//if문 switch문 연습 문제
public class P123_Exercise_Q1 {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 2;
		int ans;
		char operator = '+';
		
		//switch문
		switch(operator) {
		 case '+' : ans = num1 + num2;
		 			System.out.println(ans);
		            break;
		 case '-' : ans = num1 - num2;
		 			System.out.println(ans);
		 			break;
		 case '*' : ans = num1 * num2;
		 			System.out.println(ans);
		            break;
		 case '/' : ans = num1 / num2;
		 			System.out.println(ans);
		            break;
		}
	    //if-else문
		if(operator == '+') {
			ans = num1 + num2;
			System.out.println(ans);	
		}else if(operator == '-') {
			ans = num1 - num2;
			System.out.println(ans);	
		}else if(operator == '*') {
			ans = num1 * num2;
			System.out.println(ans);	
		}else if(operator == '/') {
			ans = num1 / num2;
			System.out.println(ans);	
		}
	}

}
