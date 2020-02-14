package 예외;

//import java.io.InputStream;
import java.util.Scanner;

public class TryCatchTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner conInput = new Scanner(System.in);
//stat final 하기 때문에 in가능

		System.out.print("수1: ");
		int num1 = conInput.nextInt();

		System.out.print("수2: ");
		int num2 = conInput.nextInt();

		int res = num1 / num2;
		System.out.println(num1 + "/" + num2 + "=" + res);
	}

}
