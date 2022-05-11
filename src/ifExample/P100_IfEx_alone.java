package ifExample;

public class P100_IfEx_alone {
//성적에 따라 학점 부여하기
	public static void main(String[] args) {
		int score = 65;
		char grade;
		
		if(score>=90) {
			grade = 'A';
		
		}else if(score>=80) {
			grade = 'B';
		}else if(score>=70) {
			grade = 'c';
		}else if(score>=60) {
			grade = 'D';
		}else{
			grade = 'F';
		}
		System.out.println("학점은 " + grade + "등급입니다.");
	}

}
