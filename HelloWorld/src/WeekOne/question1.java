package WeekOne;

import java.util.Scanner;

public class question1 {

	public static void main(String[] args) {

		String password = "12345";

		Scanner scanner = new Scanner(System.in);
		System.out.println("�ifreyi Giriniz:");

		String uservalue= scanner.nextLine();
		

		if (password.equals(uservalue))
			{
			System.out.println("Giri� Ba�ar�l�");
			}

		else {
			System.out.println("Giri� Ba�ar�s�z");
			 }
	}

}
