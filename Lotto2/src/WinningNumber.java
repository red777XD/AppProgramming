import java.util.Arrays;


public class WinningNumber extends LottoNum {
	static int winningNum[] = new int[6];
	
public void make() {	// ��÷ ��ȣ ����
	
	for(int i = 0; i < winningNum.length; i ++) {
		winningNum[i] = (int)(Math.random() * 45) +1;	// ���� �� ��ȯ
		
		for(int j = 0; j < i; j++) {
			if(winningNum[i] == winningNum[j]) {
				i--;
				break;
			}	// �ߺ� �� ����
		}
	}	Arrays.sort(winningNum);	// ����
}

public void print() {	// ��÷ ��ȣ  ���
	System.out.println("\n" + "\n" + "---�̹� ��÷ ��ȣ--- ");
	for(int i = 0; i < winningNum.length; i++) {
		System.out.print(winningNum[i] + " ");
		}
	}
}