/**
 * @author zwaclaw
 *
 */

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class HelloWorld {
	public static void main(String[] args) {
	System.out.println("HELLO UGLY WORLD!");
	System.out.println("The World is not ugly!");
	Input in = new Input();
	in.insertName();
	DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	Date date = new Date();
	System.out.println("Today: " + dateFormat.format(date));
	System.out.println("Hello " + in.getName());
}
}
