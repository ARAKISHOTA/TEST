package Object_oriented_B;

import java.util.Scanner;

import Prefectures.Prefectures_A;

public class Object_oriented_B {

	public static void main(String[] args) {
		String string;
		
		System.out.println("数字を入力してください");
		Scanner scan = new Scanner(System.in);
		string = scan.nextLine();
		
		Prefectures_A prefectures_A = new Prefectures_A(string);
		
		System.out.println("昇順か降順を入力してください");
		string = scan.nextLine();
		scan.close();
		
		prefectures_A.sort(string);
		prefectures_A.print();
	}

}