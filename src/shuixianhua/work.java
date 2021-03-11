package shuixianhua;

import java.util.Scanner;

public class work {
	public static void main(String args[]) {
		int temp;
		int number;
		int n;
		int remainder = 0;

		Scanner scan = new Scanner(System.in);
		System.out.println("输入一个数，该数属于三至七");
		n = scan.nextInt();
		for (int i = (int) Math.pow(10, n - 1); i < Math.pow(10, n); i++) {
			temp = i;
			number = 0;
		  	while (temp != 0)

			{
				remainder = temp % 10;
				number = (int) (number + Math.pow(remainder, n));
				temp = temp / 10;
			}
			if (i == number) {
				System.out.println(number);
			}
		}
	}

}
