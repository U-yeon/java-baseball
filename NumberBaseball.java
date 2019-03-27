
/**
 * NumberBaseball.class
 * 
 * @author 여진
 *2019.03.27
 *
 *
 */
import java.util.Scanner;


public class NumberBaseball {
		public static Scanner scan = new Scanner(System.in);
		public static void main(String[] args) {
			int userNum[] = new int[3];
			int comNum[] = new int[3];
			
			while(true) {
				comNum=getComNum();
			}
		}
		
		
		/**랜덤함수 불러오는 함수*/
		public static int[] getComNum() {
			int comNum[] = new int[3];
			comNum[0]=(int)(Math.random()*9+1);//1부터 9까지 랜덤
			
			while(true) {
				comNum[1]=(int)(Math.random()*9+1);
				
				/**숫자 중복 여부 확인*/
				if(comNum[1]!=comNum[0])
					break;
			}
			
			while(true) {
				comNum[2]=(int)(Math.random()*9+1);
				
				/**숫자 중복 여부 확인*/
				if((comNum[2]!=comNum[0])&&(comNum[2]!=comNum[1]))
					break;
			}
			
			return comNum;
		}
}
