package WeekOne;

import java.util.Scanner;

public class question2 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Yap�lacak ��lemi Se�iniz\n1-Toplama\n2-��karma\n3-�arpma\n4-B�lme");
		
		int input=scanner.nextInt();
		System.out.println("2 Adet Say� Giriniz:");
		float number1=scanner.nextFloat();
		float number2=scanner.nextFloat();
		float result;
		
		switch(input){
		
			case 1:
				result=(number1+number2);
				System.out.println("Toplam:"+result);
				break;
			case 2:
				result=(number1-number2);
				System.out.println("Fark:"+result);
				break;
			case 3:
				result=(number1*number2);
				System.out.println("�arp�m:"+result);
				break;
			case 4:
				result=(number1/number2);
				System.out.println("B�l�m:"+result);
				break;
			default :
	            System.out.println("Hatali secim! 1, 2 ,3 ya da 4'e basiniz.");
	            break;
		
		}

	}

}
