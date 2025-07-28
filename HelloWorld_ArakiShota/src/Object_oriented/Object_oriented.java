package Object_oriented;

import java.util.Scanner;

public class Object_oriented {
	public static void main(String[] args) {
		String string;
		
		System.out.println("コンソールに文字を入力してください");
		Scanner scan = new Scanner(System.in);
		string = scan.nextLine();
		scan.close();
		
		String[] animal = string.split(",");
		Object_A obj = new Object_A();
		
		for (int i = 0;i < animal.length; i++) {
			obj.setState(animal[i]);
			obj.print();
			System.out.println("");
		}
	}
}
