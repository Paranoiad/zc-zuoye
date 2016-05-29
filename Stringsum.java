package zuoye;

import java.util.Scanner;

public class Stringsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		long sum=0;
		long number=0;
		do {
			System.out.println("输入数字:");
			number=Long.parseLong(scanner.nextLine());
			sum+=number;
			
			
			
		} while (number != 0);
		System.out.println("总和："+sum);

	}

}
