package ifExample;

public class P105_SwitchCase2 {
//switch-case문 예제(2)
	public static void main(String[] args) {
		String medal = "Gold";
		
		switch(medal) {
		case "Gold":  
	 	  System.out.println("금메달 입니다.");
		  break;
		case "Silver":
			System.out.println("은메달 입니다.");
		  break;
		case "Bronze":
			System.out.println("동메달입니다.");
		  break;
		default:
			System.out.println("메달이 없슴니다.");
		  break;	
		}
	  //[결과]:금메달 입니다.	
	}
}
