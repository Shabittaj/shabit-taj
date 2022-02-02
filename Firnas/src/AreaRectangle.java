import java.util.Scanner;

public class AreaRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader= new Scanner(System.in);
		System.out.println("enter the length: "); 
		int length = reader.nextInt();
		System.out.println("enter the width: ");
		int width= reader.nextInt();
		int rect= length* width;
		System.out.println("Area of Rectangle: "+rect);
		reader.close();
	}

}
