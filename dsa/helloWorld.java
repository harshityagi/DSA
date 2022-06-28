package dsa;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class helloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("h:mm:ss a 'on' MMMM d, yyyy'.'");
	    final LocalDateTime now = LocalDateTime.now();

	    System.out.println("Hello, World! The current time is " + dtf.format(now));

	}

}
