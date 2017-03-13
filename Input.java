import java.util.Scanner;

public class Input {
	private String name;
	Scanner sc = new Scanner(System.in);

	public Input() {}

	public String getName() {
	return name;	
	}
	
	public String insertName(){
	System.out.print("Insert your name: ");
	name = sc.nextLine();
	sc.close();
	return name;	
	}
}
