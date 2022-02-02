import java.util.Scanner;

public class AddNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the first number: ");
		int first = scan.nextInt();
		System.out.println("enter the second number: ");
		int second= scan.nextInt();
		int sum= first + second;
		System.out.println("the sum of two number: "+sum);
		scan.close();
	}

}
