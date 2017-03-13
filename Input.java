import java.util.Scanner;

public class Input {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("įvesti bet ką iš konsolės: ");
	String text = sc.nextLine();
	System.out.println(text);
	sc.close();
}
}
