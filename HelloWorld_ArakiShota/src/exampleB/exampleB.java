package exampleB;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import example.exampleA;

public class exampleB {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		LocalDateTime ldt = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd H:m:s");
		String st = ldt.format(formatter);
		exampleA example = new exampleA(st);
		
		example.print(st);
	}

}
