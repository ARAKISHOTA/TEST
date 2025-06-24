package curriculum_B;

public class Qes4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//for文を使用して9×9表を出力してください
		for(int i = 1;i <= 9;i++) {
			for(int j = 1;j <= 9;j++) {
				System.out.print(String.format("%02d", i) + " * " + String.format("%02d", j) + " = " + String.format("%02d", i * j) + " || " );
			}
			System.out.println();
		}
	}

}
