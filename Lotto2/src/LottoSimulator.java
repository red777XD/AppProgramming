import java.util.Scanner;

public class LottoSimulator extends WinningNumber {

	public static void main(String[] args) {
		int count = 0;
		Scanner scanner = new Scanner(System.in);
		boolean isWrong = true;
		LottoNum lottonum = new LottoNum();
		while(isWrong) {
		System.out.print("�ζ� �ùķ������Դϴ�. �ڵ� : 1��   ����: 2��   ����: 3���� �Է��� �ּ���>> ");
		int num = scanner.nextInt();
		if(num == 1) {	// �ڵ�
			
			System.out.print("�� �� ��� ������ �Է�>>(1-5) ");
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
		    	System.out.println("5��");
		    	break;
		    case 3: 
		    	System.out.println("4��");
		    	break;
		    case 4: 
		    	System.out.println("3��");
		    	break;
		    case 5: 
		    	System.out.println("2��");
		    	break;
		    case 6: 
		    	System.out.println("1��");
		    	break;
		    default:
		    	System.out.println("��");
		    	break;
		    }
		}
			isWrong = false;
		}
		else if(num == 2) {	// ����
			
			System.out.print("�� �� ��� ������ �Է�>>(1-5) ");
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
		    	System.out.print("5��");
		    	break;
		    case 3: 
		    	System.out.print("4��");
		    	break;
		    case 4: 
		    	System.out.print("3��");
		    	break;
		    case 5: 
		    	System.out.print("2��");
		    	break;
		    case 6: 
		    	System.out.print("1��");
		    	break;
		    default:
		    	System.out.print("��");
		    	break;
		    }
			}	
			isWrong = false;	
		}		
		else if(num == 3){	// ����
			System.out.println("�����մϴ� . . .");
			isWrong = false;
		}
		else {
			System.out.println("1��, 2��, 3�� �߿� �Է��� �ּ���.");
			isWrong = true;
			}
		}scanner.close();
	}
}
