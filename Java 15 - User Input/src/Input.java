import java.util.Scanner;

public class Input {
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("G'day, mate what's your name?");
		
		String name = input.next();
		
		System.out.println("Hello " + name);
		
		System.out.print("What's your favorite number?");
		
		int number = input.nextInt();
		
		System.out.println("Cool, I like " + number + " too");
	}
}