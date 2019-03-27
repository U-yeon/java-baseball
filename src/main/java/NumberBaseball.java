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
	public static void main (String[] args) {
		int userNum[] = new int[3];
		int comNum[] = new int[3];
		boolean result = false;
		boolean continued = true;
		
		
		while (continued) {
			comNum = getComNum();
		
			while (!result) {
				System.out.print ("���ڸ� �Է����ּ��� : ");
				
				userNum = getUserNum();
				
				int strike = getStrike(comNum, userNum);
				int ball = getBall(comNum, userNum);
				
				result  =printResult(strike, ball);
			}
			
			System.out.println ("3���� ���ڸ� ��� �����̽��ϴ�! ���� ����");
			System.out.println ("������ ���� �����Ϸ��� 1, �����Ϸ��� 2�� �Է��ϼ���.");
			
			if (scan.nextInt() == 2) {
				continued = false;
			}
			else {
				result = false;
			}
		}
	}

	
	/*��ǻ���� ���� �Լ��� �ҷ����� �޼ҵ�*/
	public static int[] getComNum() {
		int comNum[] = new int[3];
		
		/*1���� 9������ ���� ����*/
		comNum[0] = ( int )(Math.random() * 9 + 1);
		
		while(true) {
			comNum[1]=( int )(Math.random() * 9 + 1);
			
			/*�� �ڸ��� ���ڵ��� ��ġ�� �ʵ���*/
			if(comNum[1] != comNum[0]) {
				break;
			}
		}
		
		while (true) {
			comNum[2]=( int )(Math.random() * 9 + 1);
			
			if ((comNum[2] != comNum[1]) && (comNum[2] != comNum[0]))
				break;
		}
		
		return comNum;
	}
	
	
	/*������� ���ڸ� �� �Է� �޼ҵ�*/
	public static int[] getUserNum() {
		int userNum[] = new int[3];
		
		int input = scan.nextInt();
		
		
		/*���� �ߺ� ���� �ʵ��� Ȯ��*/
		userNum[0] = input/100; //100�� �ڸ�
		input -= input/100*100; //100�� �ڸ� ������
		userNum[1] = input/10; //10�� �ڸ�
		userNum[2] = input%10; //1�� �ڸ�
		
		return userNum;
	}
	
	
	/*comNum�� userNum�� ���� ��Ʈ����ũ�� ī����*/
	public static int getStrike (int[] comNum, int[] userNum) {
		int strike=0;
		
		for (int i  =0; i < 3; ++i) {
			if (comNum[i] == userNum[i]) {
				strike++;
			}
		}
		
		return strike;
	}
	
	
	/*comNum�� userNum�� ���� ���� ī����*/
	public static int getBall (int[] comNum, int[] userNum) {
		int ball=0;
		
		for (int i = 0; i < 3; ++i) {
			if (comNum[i] == userNum[(i + 1) % 3]) {
				ball++;
			}
			else if (comNum[i] == userNum[(i + 2) % 3]) {
				ball++;
			}
		}
		return ball;
	}
	
	
	/*��� �� ��¿� ���� �޼ҵ�*/
	public static boolean printResult(int strike, int ball) {
		if(strike != 0) {
			System.out.print(strike + " ��Ʈ����ũ  ");
		}
		if(ball != 0) {
			System.out.print(ball + "��");
		}
		if(strike+ball == 0) {
			System.out.print("����");
		}
		
		System.out.println();
		
		return (strike == 3);
		
	}
}

