package loopExample;
//반복문 연습 문제
public class P123_Exercise_Q4 {

	public static void main(String[] args) {
        int lineCount = 4;
        int spaceCount =lineCount/2+1;
        int starCount = 1;
        
        	for(int i=1; i<=lineCount; i++) {
        		for(int j=0; j<spaceCount; j++) {
        			System.out.print(" ");
        		}for(int j=0; j<starCount; j++) {
        			System.out.print("*");
        		}for(int j=0; j<spaceCount; j++) {
        			System.out.print(" ");
        		}
        	 spaceCount-=1;	
        	 starCount+=2;
        	 System.out.println();//줄바꿈
        	}
        	
         
	}

}
