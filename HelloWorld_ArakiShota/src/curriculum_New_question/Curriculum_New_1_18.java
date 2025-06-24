package curriculum_New_question;
import java.util.Random;

public class Curriculum_New_1_18 {
	// Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。
	private static void method1() {
		System.out.println("Hello JavaSE 11");
	}
	
	// Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください
	public static int method2(int x) {
		x *= x;
		System.out.println(x);
		return x;
	}
	
	// Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください
	public static void method3(int[] x) {
		for(int i = 0;i < x.length;i++) {
			System.out.println(x[i]);
		}
	}		
	
	// Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。
	public static void method2(float x,float y) {
		System.out.println(x + y);
	}	
	
	// Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
	// 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
	// ※0は出力＆格納しないようにしてください。
	public static int[] method4(int x) {
		int a[] = new int[x];
		Random rand = new Random();
		for(int i = 0;i < x;i++) {
			a[i] = rand.nextInt(100) + 1;
			System.out.println(a[i]);
		}
		return a;
	}

	// Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
	// ※小数点以下も表示されるようにしてください。
	public static float method5(int[] x) {
		float b = 0.0f;
		for(int i = 0;i < x.length;i++) {
			b += x[i];
		}
		b = b / x.length;
		System.out.println(b);
		return b;
	}
	
	// Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください
	public static boolean method6(float x) {
		if(x >= 50) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public static void main(String[] args) {
		// 作成したメソッドをここで呼び出してください
		method1();
		method2(2);
		int a[] = {7,3,6,9,1};
		method3(a);
		method2(3.2f,5.5f);
		//method4(5);
		//method5(method4(5));
		System.out.println(method6(method5(method4(5))));
	}

}
