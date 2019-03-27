
/**
 * NumberBaseball.class
 * 
 * @author ����
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
					System.out.print("���ڸ� �Է����ּ��� : ");
					
					userNum=getUserNum();
					
					int strike = getStrike(comNum, userNum);
					int ball = getBall(comNum, userNum);
					
				}
			}
			
			
		}
		
		
		/**�����Լ� �ҷ����� �޼ҵ�*/
		public static int[] getComNum() {
			int comNum[] = new int[3];
			comNum[0]=(int)(Math.random()*9+1);//1���� 9���� ����
			
			while(true) {
				comNum[1]=(int)(Math.random()*9+1);
				
				/**���� �ߺ� ���� Ȯ��*/
				if(comNum[1]!=comNum[0])
					break;
			}
			
			while(true) {
				comNum[2]=(int)(Math.random()*9+1);
				
				/**���� �ߺ� ���� Ȯ��*/
				if((comNum[2]!=comNum[0])&&(comNum[2]!=comNum[1]))
					break;
			}
			
			return comNum;
		}
		
		
		/**������� ���� �Է� �޼ҵ�*/
		public static int[] getUserNum() {
			int userNum[] = new int[3];
			
			int input = scan.nextInt();
			
			/**���ڸ� ������ ����*/
			userNum[0]=input/100;//100�� �ڸ�
			input-=input/100*100;//100�� �ڸ� ������
			userNum[1]=input/10;//10�� �ڸ�
			userNum[2]=input%10;//1�� �ڸ�
			
			return userNum;
		}
		
		
		/**comNum�� userNum�񱳿� ���� ��Ʈ����ũ ī���� �޼ҵ�*/
		public static int getStrike(int[] comNum, int[] userNum) {
			int strike=0;
			for(int i=0; i<3; ++i) {
				if(comNum[i]==userNum[i]) {
					strike++;
				}
			}
			
			return strike;
			
		}
		
		
		/**comNum�� userNum�񱳿� ���� �� ī���� �޼ҵ�*/
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
}
