import java.util.*;

public class HelloWorld {
	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		String name = null;

		do {
			System.out.print("Navn: ");
			name = inputScanner.nextLine();

			System.out.printf("Hei, %s%n%n", name);
		} while (!name.equalsIgnoreCase("quit"));
		
		System.out.println("Avsluttet.");
		inputScanner.close();
	}
}