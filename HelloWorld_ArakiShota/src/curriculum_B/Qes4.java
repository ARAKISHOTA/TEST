package curriculum_B;

public class Qes4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//for文を使用して9×9表を出力してください
		for(int i = 1,j = 1;i <= 9;i++) {
			System.out.println(String.format("%02d", i) + " * " + String.format("%02d", j) + " = " + String.format("%02d", i * j++) + " || " +
					String.format("%02d", i) + " * " + String.format("%02d", j) + " = " + String.format("%02d", i * j++) + " || " +
					String.format("%02d", i) + " * " + String.format("%02d", j) + " = " + String.format("%02d", i * j++) + " || " +
					String.format("%02d", i) + " * " + String.format("%02d", j) + " = " + String.format("%02d", i * j++) + " || " +
					String.format("%02d", i) + " * " + String.format("%02d", j) + " = " + String.format("%02d", i * j++) + " || " +
					String.format("%02d", i) + " * " + String.format("%02d", j) + " = " + String.format("%02d", i * j++) + " || " +
					String.format("%02d", i) + " * " + String.format("%02d", j) + " = " + String.format("%02d", i * j++) + " || " +
					String.format("%02d", i) + " * " + String.format("%02d", j) + " = " + String.format("%02d", i * j++) + " || " +
					String.format("%02d", i) + " * " + String.format("%02d", j) + " = " + String.format("%02d", i * j)
					);
			j = 1;
		}
	}

}
