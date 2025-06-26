package basicClass;

public class Dog {
	// Q1：フィールドに動物の名前の変数を定義してください。
	protected String animal_name;
	
	// Q2：フィールドに動物の数の変数を定義してください。
	protected int animal_number;
	
	// Q3：Q1で作成した変数に「犬」を代入するコンストラクタを作成してください。
	protected Dog() {
		this.animal_name = "犬";
	}
	
	// Q4：Q2で作成した変数に引数を代入するコンストラクタを作成してください。
	protected Dog(int x) {
		this.animal_number = x;
	}
}
