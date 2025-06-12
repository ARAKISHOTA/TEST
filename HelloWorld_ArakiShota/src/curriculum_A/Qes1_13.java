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
		height = height / s;
		System.out.println("BMIは" + weight / (height * height) + "です。");
	}
}
