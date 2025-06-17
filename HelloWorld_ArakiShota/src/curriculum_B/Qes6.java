package curriculum_B;
import java.util.Random;
import java.util.Scanner;

public class Qes6 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		String str = null;
		Scanner scan = new Scanner(System.in);
		str = scan.next();
		String[] fruits = str.split("、");
		Random rand = new Random();
		//int tv_num = rand.nextInt(11);
		//int ds_num = rand.nextInt(11);
		int num = rand.nextInt(11);
		boolean is1st = true;
		
		//
		for(String fruit : fruits) {
			
			switch(fruit) {
			case "パソコン":
			case "冷蔵庫":
			case "扇風機":
			case "洗濯機":
			case "加湿器":
				System.out.println(fruit + "の残り台数は" + rand.nextInt(11) + "台です");
				break;
			case "テレビ":
			case "ディスプレイ":
				int  tv_num = is1st ? num : 11 - num;
				System.out.println(fruit + "の残り台数は" + tv_num + "台です");
				is1st = false;
				break;
			/*
			case "テレビ":
			case "ディスプレイ":
				System.out.println(fruit + "の残り台数は" + num + "台です");
				num = 11 - num;
				break;
			*/
			case "その他商品":
				System.out.println("『 その他商品 』は指定の商品ではありません");
				break;
			default :
				System.out.println("『受け取った値』は指定の商品ではありません");
				break;
			}
		}
	}

}
