package InheritanceB;
import java.util.Scanner;

import InheritanceA.Player;

public class InheritanceB {
	public static void main(String[] args) {
		String name;
	
		System.out.println("名前を入力してください");
		Scanner scan = new Scanner(System.in);
		name = scan.nextLine();
		scan.close();
	
		Player player = new Player(name);
		
		System.out.println("こんにちは「" + player.getName() + "」さん");
		player.print();
	}
}
