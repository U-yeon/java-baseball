
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
			boolean result=false;
			
			while(true) {
				comNum=getComNum();
				
				while(!result) {
					System.out.print("숫자를 입력해주세요 : ");
					
					userNum=getUserNum();
					
					int strike = getStrike(comNum, userNum);
					int ball = getBall(comNum, userNum);
					
					/**true반환 시 이 while문에서 탈출하고 축하 결과*/
					result=printResult(strike, ball);
					}
				
				System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
				System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
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
		
		
		/**comNum과 userNum비교에 따른 볼 카운팅 메소드*/
		public static int getBall(int[] comNum, int[] userNum) {
			int ball=0;
			
			for(int i=0; i<3; ++i) {
				if((comNum[i])==(userNum[(i+1)%3])) {
					ball++;
				}
				if((comNum[i])==(userNum[(i+2)%3])) {
					ball++;
				}
			}
			
			return ball;
		}
		
		
		/**결과 출력 창 메소드*/
		public static boolean printResult(int strike, int ball) {
			if(strike!=0) {
				System.out.print(strike + " 스트라이크");
			}
			
			if(ball!=0) {
				System.out.print(ball+"볼");
			}
			
			if(strike+ball==0) {
				System.out.print("낫싱");
			}
			
			System.out.println();
			
			
			/**strike가 3일시 true반환*/
			return (strike==3);

		}
		
		
}
