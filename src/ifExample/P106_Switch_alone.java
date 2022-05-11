package ifExample;

public class P106_Switch_alone {
//Switch-case문 연습하기
	public static void main(String[] args) {
		int floar = 5;
		String storeName;
		
		switch(floar) {
		  case 1 : storeName = "약국";
			  break;
		  case 2 : storeName = "정형외과";
			  break;
		  case 3 : storeName = "피부과";
			  break;
		  case 4 : storeName = "치과";
			  break;
		  case 5 : storeName = "헬스 클럽";
		      break;
		  default : storeName ="존재하지 않는 층 ";
		      
		}
          System.out.println(floar + "층 " + storeName + "입니다.");
	}

}
