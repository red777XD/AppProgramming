import java.util.Arrays;
import java.util.Scanner;

public class LottoNum {
	
static int[] autoNum = new int[6];		// �ڵ���ȣ �迭
static int[] manualNum = new int[6];	// ������ȣ �迭
Scanner scanner = new Scanner(System.in);
	

public void autoMake() {	// �ڵ� �ζǹ�ȣ ����
	
	for(int i = 0; i < autoNum.length; i ++) {
		autoNum[i] = (int)(Math.random() * 45) +1;	// ���� �� ��ȯ
		
		for(int j = 0; j < i; j++) {
			if(autoNum[i] == autoNum[j]) {
				i--;
				break;
			}	// �ߺ� �� ����
		}
	}	Arrays.sort(autoNum);	// ����
}

public void autoPrint() { // ������ �ڵ� �ζǹ�ȣ ���
	System.out.println("\n" + "---�ڵ� ���� ��ȣ--- ");
	for(int i = 0; i < autoNum.length; i++) {
		System.out.print(autoNum[i] + " ");
		
		}
}

	
	public void manualMake() { // ���� �ζǹ�ȣ ����
		System.out.print("\n" + "1~ 45������ 6���� ��ȣ �Է�  >> ");
		for(int i = 0; i < manualNum.length; i++) {
			manualNum[i] = scanner.nextInt();
			if(manualNum[i] > 45) {
				System.out.println("������ �Ѿ����ϴ�. �ٽ� �Է��ϼ���");
				i--;
			}
		}
		Arrays.sort(manualNum);	// ����
	}
	public void manualPrint() { // ������ ���� �ζǹ�ȣ ���
		System.out.println("\n" + "---���� ���� ��ȣ--- ");
		for(int i = 0; i < manualNum.length; i++) {		
			System.out.print(manualNum[i] + " ");
			}
		}
	}
