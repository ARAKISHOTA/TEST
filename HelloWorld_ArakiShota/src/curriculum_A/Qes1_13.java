package curriculum_A;

public class Qes1_13 {
	
	public static void main(String[] args) {
	
		//型の宣言
		byte b;
		short s;
		int i;
		long l;
		float f;
		double d;
		char c;
		String st;
		boolean bool;
	
		//初期値の代入
		b = 0;
		s = 0;
		i = 0;
		l = 0L;
		f = 0.0f;
		d = 0.0d;
		c = '\u0000';
		st = null;
		bool = false;
		
		//値の代入
		b = 10;
		s = 100;
		i = 1000;
		l = 10000L;
		f = 9.5f;
		d = 10.5d;
		c = 'a';
		st = "ハロー";
		bool = true;
		
		//コンソール出力
		System.out.println(b + s + i + l);
		System.out.println(b + b);
		System.out.println(c + " " + st + " " + bool);
		System.out.println(Math.round(b + s + i + l + f + d));
		System.out.println(b * s * i * l);
		System.out.println(d / s);
		System.out.println(b - s);
		
		//「ハローJAVA43」と表示とさせたい
		int num = 20;
		int num1 = 23;
		System.out.println("ハローJAVA" + (num + num1));
		
		//formatの通りコンソールに出力
		String name = "山田太郎";
		int age = 18;
		float height = 170.5f;
		float weight = 62.2f;
		String food = "寿司";
		
		System.out.println("初めまして" + name + "です。");
		System.out.println("年齢は" + age + "歳です。");
		System.out.println("身長は" + height + "cmです。");
		System.out.println("体重は" + weight + "kgです。");
		System.out.println("好きな食べ物は" + food + "です。");
		
		//BMI出力
		float height_m = height / s;
		System.out.println("BMIは" + weight / (height_m * height_m) + "です。");
	
		
		
		//再代入しコンソールに出力
		name = "鈴木一郎";
		age = 24;
		height = 168.5f;
		weight = 64.2f;
		food = "オムライス";
		height_m = height / s;
		
		System.out.println("初めまして" + name + "です。");
		System.out.println("年齢は" + age + "歳です。");
		System.out.println("身長は" + height + "cmです。");
		System.out.println("体重は" + weight + "kgです。");
		System.out.println("好きな食べ物は" + food + "です。");
		System.out.println("BMIは" + weight / (height_m * height_m) + "です。");
		
		//和算で自己代入しコンソールに出力
		age += age;
		height += height;
		weight += weight;
		height_m = height / s;
		
		System.out.println("初めまして" + name + "です。");
		System.out.println("年齢は" + age + "歳です。");
		System.out.println("身長は" + height + "cmです。");
		System.out.println("体重は" + weight + "kgです。");
		System.out.println("好きな食べ物は" + food + "です。");
		System.out.println("BMIは" + weight / (height_m * height_m) + "です。");
		
		
		
		//25歳以上ならtrueが出力
		age = 24;
		
		bool = (age >= 25);
		System.out.println(bool);
		
		//文字列型に型変換し繋げて出力
		height = 168.5f;
		weight = 64.2f;
		String Age,Height,Weight;
		
		Age = String.valueOf(age);
		Height = String.valueOf(height);
		Weight = String.valueOf(weight);
		
		System.out.println(Age + Height + Weight);
		
		//整数型に変換して出力
		int AGE,HEIGHT;
		
		AGE = Integer.valueOf(Age);
		height = Float.valueOf(Height);
		HEIGHT = (int)height;
		
		System.out.println(AGE);
		System.out.println(HEIGHT);
		
		
		
		//【年齢が25もしくは身長が160以上】であればtrueを出力
		boolean bool2,BOOL;
		bool = AGE >= 25;
		bool2 = HEIGHT >= 160;
		BOOL = bool || bool2;
		
		System.out.println(BOOL);
		
	}
}
