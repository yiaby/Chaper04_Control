package ifExample;

public class P102_SwitchCase {
//Switch-case문 예제
	public static void main(String[] args) {
		int ranking = 1;
		char medalColor;
		
		switch(ranking){
		 case 1 : medalColor = 'G';
		 		  break;
		 case 2 : medalColor = 'S';
		 		  break;
		 case 3 : medalColor = 'B';
		 		  break;
		 default:
			      medalColor = 'A';
		}
		 System.out.println(ranking + "등 메달의 색깔은 " + medalColor + " 입니다.");
		 //[결과]:1등 메달의 색깔은G 입니다.
	}
	

}
