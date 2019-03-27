/*
 *NumberBaseball.class
 *
 *2019.03.28
 *
 * @author �ֿ���
 *
 */
import java.util.Scanner;


public class NumberBaseball {
	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		int userNum[] = new int[3];
		int comNum[] = new int[3];
		
		comNum=getComNum();
		userNum=getUserNum();
		
	}

	
	/*��ǻ���� ���� �Լ��� �ҷ����� �޼ҵ�*/
	public static int[] getComNum() {
		int comNum[]=new int[3];
		
		/*1���� 9������ ���� ����*/
		comNum[0]=(int)(Math.random()*9+1);
		
		while(true) {
			comNum[1]=(int)(Math.random()*9+1);
			
			/*�� �ڸ��� ���ڵ��� ��ġ�� �ʵ���*/
			if(comNum[1]!=comNum[0]) {
				break;
			}
		}
		
		while(true) {
			comNum[2]=(int)(Math.random()*9+1);
			
			if((comNum[2]!=comNum[1])&&comNum[2]!=comNum[0])
				break;
		}
		
		return comNum;
	}
	
	
	/*������� ���ڸ� �� �Է� �޼ҵ�*/
	public static int[] getUserNum() {
		int userNum[]=new int[3];
		
		int input = scan.nextInt();
		
		
		/*���� �ߺ� ���� �ʵ��� Ȯ��*/
		userNum[0]=input/100; //100�� �ڸ�
		input-=input/100*100; //100�� �ڸ� ������
		userNum[1]=input/10; //10�� �ڸ�
		userNum[2]=input%10; //1�� �ڸ�
		
		return userNum;
	}
}

