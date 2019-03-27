
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
				
				while(true) {
					System.out.print("숫자를 입력해주세요 : ");
					
					userNum=getUserNum();
					
					int strike = getStrike(comNum, userNum);
					
				}
			}
			
			
		}
		
		
		/**랜덤함수 불러오는 메소드*/
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
		
		
		/**사용자의 숫자 입력 메소드*/
		public static int[] getUserNum() {
			int userNum[] = new int[3];
			
			int input = scan.nextInt();
			
			/**세자리 숫자의 설정*/
			userNum[0]=input/100;//100의 자리
			input-=input/100*100;//100의 자리 날리기
			userNum[1]=input/10;//10의 자리
			userNum[2]=input%10;//1의 자리
			
			return userNum;
		}
		
		
		/**comNum과 userNum비교에 따른 스트라이크 카운팅 메소드*/
		public static int getStrike(int[] comNum, int[] userNum) {
			int strike=0;
			for(int i=0; i<3; ++i) {
				if(comNum[i]==userNum[i]) {
					strike++;
				}
			}
			
			return strike;
			
		}
}
