import java.util.Arrays;
import java.util.Scanner;

public class LottoNum {
	
static int[] autoNum = new int[6];		// 자동번호 배열
static int[] manualNum = new int[6];	// 수동번호 배열
Scanner scanner = new Scanner(System.in);
	

public void autoMake() {	// 자동 로또번호 생성
	
	for(int i = 0; i < autoNum.length; i ++) {
		autoNum[i] = (int)(Math.random() * 45) +1;	// 랜덤 값 반환
		
		for(int j = 0; j < i; j++) {
			if(autoNum[i] == autoNum[j]) {
				i--;
				break;
			}	// 중복 값 제거
		}
	}	Arrays.sort(autoNum);	// 정렬
}

public void autoPrint() { // 생성된 자동 로또번호 출력
	System.out.println("\n" + "---자동 생성 번호--- ");
	for(int i = 0; i < autoNum.length; i++) {
		System.out.print(autoNum[i] + " ");
		
		}
}

	
	public void manualMake() { // 수동 로또번호 생성
		System.out.print("\n" + "1~ 45까지의 6개의 번호 입력  >> ");
		for(int i = 0; i < manualNum.length; i++) {
			manualNum[i] = scanner.nextInt();
			if(manualNum[i] > 45) {
				System.out.println("범위를 넘었습니다. 다시 입력하세요");
				i--;
			}
		}
		Arrays.sort(manualNum);	// 정렬
	}
	public void manualPrint() { // 생성된 수동 로또번호 출력
		System.out.println("\n" + "---수동 생성 번호--- ");
		for(int i = 0; i < manualNum.length; i++) {		
			System.out.print(manualNum[i] + " ");
			}
		}
	}
