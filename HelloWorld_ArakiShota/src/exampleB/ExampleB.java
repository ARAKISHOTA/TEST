package exampleB;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import example.ExampleA;

public class ExampleB {

	public static void main(String[] args) {
		LocalDateTime ldt = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd H:m:s");
		String st = ldt.format(formatter);
		ExampleA example = new ExampleA(st);
		
		example.print();
	}
}
