package WeekOne;

import java.util.Random;
import java.util.Scanner;

public class question5 {

	static void single(int[] a) {

		for (int i = 0; i < 100; i++) {

			if (a[i] % 2 == 1) {

				System.out.println(a[i]);

			}
		}
	}

	static void twin(int []a) {
		
		for(int i=0;i<100;i++) {
			
			if(a[i]%2==0) {
				
				System.out.println(a[i]);
				
			}
		}
	}

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		Random r = new Random();

		int[] array = new int[100];

		for (int i = 0; i < 100; i++) {
			array[i] = r.nextInt(1000);
		}
		
		System.out.println("Dizinin Tek say�lar�n� g�rmek i�in '1' �ift say�lar�n� g�rmek i�in '2' tu�lay�n�z..");
		
		int input=scanner.nextInt();
		
		switch(input) {
		
		case 1:
			single(array);
			break;
		case 2:
			twin(array);
			break;
		default:
			System.out.println("Hatal� Giri�!!Girdi�iniz de�er '1' ya da '2' olmal�d�r");
		}
		
		
	}

}
