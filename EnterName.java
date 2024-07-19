import java.util.Scanner;
public class Welcome
{
	public static void main(String[] args) {
		System.out.println("please Enter Your Name: ");
		Scanner input = new Scanner(System.in);
		String name = input.nextLine();
		System.out.println("Welcome" + "Khushi");
	}
}
