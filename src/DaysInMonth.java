import java.util.Scanner;

/*
 * (�������)
 * ���� �ϼ� ����ϱ� 
 *  - switch �̿�
 *  - 2���� ���� �̰�����.
 */
public class DaysInMonth {
	public static void main(String[] args) {
		int month;
		int days=0;
		
		System.out.print("�ϼ��� �˰� ���� ���� �Է��Ͻÿ�:");
		Scanner scan=new Scanner(System.in);
		
		month=scan.nextInt();
		switch(month){
		case 4:
		case 6:
		case 9:
		case 11:
			days=30;
			break;
		case 2:
			days=28;
			break;
		default:
			days=31;
			break;
		}
		System.out.printf("%d���� ������ %d�� �Դϴ�.",month,days);
	}
}