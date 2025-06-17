package curriculum_B;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Qes7 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Pattern s = Pattern.compile("^[0-9]+$");//数字確認用
		for(;;) {
			System.out.print("生徒の人数を入力してください（2以上）:");
			Scanner scan = new Scanner(System.in);
			String num = scan.next();
			if(s.matcher(num).find() == false || Integer.parseInt(num) <= 1) {
				System.out.println("2以上の数字を入力してください");
			}
			else {
				int Nop =Integer.parseInt(num);
				int p = Nop;
				int c = 1;
				int score[][] = new int[Nop][4];
				String str = "英数、数学、理科、社会";
				String[] fruits = str.split("、");
				
				while(Nop > 0) {
					int force =0;
					for(String fruit : fruits) {
						System.out.print(c + "人目の『" + fruit + "』の点数を入力してください:");
						scan = new Scanner(System.in);
						num = scan.next();
						score[c - 1][force++] = Integer.parseInt(num);
					}
					c++;
					Nop--;
				}
				Nop = p;
				c = 0;
				//平均点表示
				while(p > 0) {
					double test = (score[c][0] + score[c][1] + score[c][2] + score[c][3]) / 4.0d;
					System.out.println(c + "人目の平均点は" + String.format("%.2f", test) + "点です。");
					c++;
					p--;
				}
				c = 0;
				//教科ごとの平均点
				for(String fruit : fruits) {
					double test = 0.0d;
					for(int i = 0;i < Nop; i++) {
						test += score[i][c];
					}
					test = test / Nop;
					System.out.println(fruit + "の平均点は" + String.format("%.2f", test) + "点です。");
					c++;
				}
				//全体平均
				double test = 0.0d;
				for(int i = 0;i < Nop; i++) {
					for(int j = 0;j <= 3; j++) {
						test += score[i][j];
					}
				}
				test = test / (Nop * 4.0d);
				System.out.println("全体の平均点は" + String.format("%.2f", test) + "点です。");
				break;
			}
		}
	}
}
