package ifExample;

public class P97_IfExmaple2 {
//if-else if-else문으로 입장료 계산하기
	public static void main(String[] args) {
		
		int age = 9;
		int charge;
		
		if(age < 8) {
			charge = 1000;
			System.out.println("취학 전 아동입니다.");
		}else if(age < 14) {
			charge = 2000;
			System.out.println("초등학생입니다.");
		}else if(age < 20) {
			charge = 2500;
			System.out.println("중, 고등학생입니다.");
		}else{
			charge = 3000;
			System.out.println("일반인입니다.");
		}
			System.out.println("입장료는 " + charge + "원입니다.");
			
			//[결과]:초등학생입니다. 입장료는 2000원입니다.
	    
//[if-if문 비교]-----------------------------------------------------------------------------------------------	
	/*	
		int age = 9;
		int charge;
		
		if(age < 8) {
			charge = 1000;
			System.out.println("취학 전 아동 입니다.");
		}if(age < 14) {
			charge = 2000;
			System.out.println("초등학생입니다.");
		}if(age < 20) {
			charge = 2500;
			System.out.println("중,고등학생입니다.");
		}else {
			charge = 3000;
			System.out.println("일반인 입니다.");
		}
			System.out.println("입장료는 " + charge + "원입니다.");
			
			/*[결과]
			 * 초등학생입니다.
			 * 중,고등학생입니다.			=>if문으로만 이루어진 코드는 조건마다 각각 비교하여 출력함
			 * 입장료는 2500원입니다.
			 */
		
	}
}
