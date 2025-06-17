package curriculum_B;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Qes1_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//ログイン時の入力チェックシステムを作成してください
		Pattern p = Pattern.compile("^[0-9a-zA-Z]+$");//半角英数確認用
		Pattern s = Pattern.compile("^[0-9]+$");//数字確認用
		String name;//ユーザー名登録用
		
		for(int i = 0;i <= 0;)/* ユーザー名登録までループ */ {
			System.out.println("キーボードから名前を入力してください");
			Scanner scan = new Scanner(System.in);
			name = scan.nextLine();
			
			if(name.length() <= 0 || name == null) {
				System.out.println("名前を入力してください");
			}
			else if(p.matcher(name).find() == false) {
				System.out.println("半角英数字のみで名前を入力してください");
			}
			else if(name.length() >= 10) {
				System.out.println("名前を10文字以内にしてください");
			}
			else {
				System.out.println("ユーザー名「 " + name + " 」を登録しました");
				i++;
			}
		}
		
		for(int i = 0,c = 1;i <= 0;c++)/* じゃんけんで勝つまでまでループ */ {
			System.out.println("手を決めてください");
			Scanner scan = new Scanner(System.in);
			String str2 = scan.next();
			if(s.matcher(str2).find() == false) /* 入力された文字が数字か確認 */{
				c--;
			}
			else if(Integer.parseInt(str2) == 0 || Integer.parseInt(str2) == 1 || Integer.parseInt(str2) == 2) {
				Random rand = new Random();
				int enemy = rand.nextInt(3);
				int self = 0;
				
				//自分の手
				if(Integer.parseInt(str2) == 0) {
					System.out.println(str2 + "の手は「グー」");
					self = 0;
				}
				else if(Integer.parseInt(str2) == 1) {
					System.out.println(str2 + "の手は「チョキ」");
					self = 1;
				}
				else if(Integer.parseInt(str2) == 2) {
					System.out.println(str2 + "の手は「パー」");
					self = 2;
				}
				//相手の手
				if(enemy == 0) {
					System.out.println("相手の手は「グー」");
				}
				else if(enemy == 1) {
					System.out.println("相手の手は「チョキ」");
				}
				else if(enemy  == 2) {
					System.out.println("相手の手は「パー」");
				}
				
				//結果表示
				if(self == 1 && enemy == 0) {
					System.out.println("俺の勝ち！");
					System.out.println("負けは次につながるチャンスです！");
					System.out.println("ネバーギブアップ！");
				}
				else if(self == 2 && enemy == 1) {
					System.out.println("俺の勝ち！");
					System.out.println("たかがじゃんけん、そう思ってないですか？");
					System.out.println("それやったら次も、俺が勝ちますよ");
				}
				else if(self == 0 && enemy == 2) {
					System.out.println("俺の勝ち！");
					System.out.println("なんで負けたか、明日まで考えといてください。");
					System.out.println("そしたら何かが見えてくるはずです");
				}
				else if(self == enemy) {
					System.out.println("DRAW あいこ もう一回しましょう！");
				}
				else {
					System.out.println("やるやん。");
					System.out.println("次は俺にリベンジさせて");
					System.out.println("勝つまでにかかった合計回数は" + c + "回です");
					i++;
				}
			}
			else /* 数字でも０，１，２以外の場合 */{
				c--;
			}
		}
	}

}
