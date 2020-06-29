import java.util.Scanner;

public class LottoSimulator extends WinningNumber {

	public static void main(String[] args) {
		int count = 0;
		Scanner scanner = new Scanner(System.in);
		boolean isWrong = true;
		LottoNum lottonum = new LottoNum();
		while(isWrong) {
		System.out.print("로또 시뮬레이터입니다. 자동 : 1번   수동: 2번   종료: 3번을 입력해 주세요>> ");
		int num = scanner.nextInt();
		if(num == 1) {	// 자동
			
			System.out.print("몇 줄 출력 받을지 입력>>(1-5) ");
			int some = scanner.nextInt();
				for(int i = 0; i < some; i++) {
			lottonum.autoMake();
			lottonum.autoPrint();
				}  
			WinningNumber winningnum = new WinningNumber();
			winningnum.make();
			winningnum.print();
			if(some == 1) {
				for (int i = 0; i < 6;   i++) {
					for (int j = 0; j < 6; j++) {
		        	
		            if (winningNum[i] == autoNum[j]) {
		                count++;
			System.out.println("\n");
			                        
		            }
		        }
		    }			
		    switch(count) {
		    case 2: 
		    	System.out.println("5등");
		    	break;
		    case 3: 
		    	System.out.println("4등");
		    	break;
		    case 4: 
		    	System.out.println("3등");
		    	break;
		    case 5: 
		    	System.out.println("2등");
		    	break;
		    case 6: 
		    	System.out.println("1등");
		    	break;
		    default:
		    	System.out.println("꽝");
		    	break;
		    }
		}
			isWrong = false;
		}
		else if(num == 2) {	// 수동
			
			System.out.print("몇 장 출력 받을지 입력>>(1-5) ");
			int some = scanner.nextInt();
				for(int i = 0; i < some; i++) {
			lottonum.manualMake();
			lottonum.manualPrint();
		}	
			WinningNumber winningnum = new WinningNumber();
			winningnum.make();
			winningnum.print();
			
			if(some == 1) {
				System.out.println("\n");
			for (int i = 0; i < 6; i++) {
		        for (int j = 0; j < 6; j++) {         	
		            if (manualNum[i] == winningNum[j]) {
		                count++;                          
		            }
		        }
		    }
		    switch(count) {
		    case 2: 
		    	System.out.print("5등");
		    	break;
		    case 3: 
		    	System.out.print("4등");
		    	break;
		    case 4: 
		    	System.out.print("3등");
		    	break;
		    case 5: 
		    	System.out.print("2등");
		    	break;
		    case 6: 
		    	System.out.print("1등");
		    	break;
		    default:
		    	System.out.print("꽝");
		    	break;
		    }
			}	
			isWrong = false;	
		}		
		else if(num == 3){	// 종료
			System.out.println("종료합니다 . . .");
			isWrong = false;
		}
		else {
			System.out.println("1번, 2번, 3번 중에 입력해 주세요.");
			isWrong = true;
			}
		}scanner.close();
	}
}
