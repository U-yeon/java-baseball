
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
			}
		}
		
		
		/**�����Լ� �ҷ����� �Լ�*/
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
}
