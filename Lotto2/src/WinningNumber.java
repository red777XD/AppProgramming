import java.util.Arrays;


public class WinningNumber extends LottoNum {
	static int winningNum[] = new int[6];
	
public void make() {	// 당첨 번호 생성
	
	for(int i = 0; i < winningNum.length; i ++) {
		winningNum[i] = (int)(Math.random() * 45) +1;	// 랜덤 값 반환
		
		for(int j = 0; j < i; j++) {
			if(winningNum[i] == winningNum[j]) {
				i--;
				break;
			}	// 중복 값 제거
		}
	}	Arrays.sort(winningNum);	// 정렬
}

public void print() {	// 당첨 번호  출력
	System.out.println("\n" + "\n" + "---이번 당첨 번호--- ");
	for(int i = 0; i < winningNum.length; i++) {
		System.out.print(winningNum[i] + " ");
		}
	}
}